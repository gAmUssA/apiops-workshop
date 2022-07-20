package io.kong.developer.apiops.testcontainers;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.utility.DockerImageName;

import io.kong.developer.apiops.APIOpsWorkshopApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = APIOpsWorkshopApplication.class,
    webEnvironment = WebEnvironment.RANDOM_PORT
)
@ActiveProfiles("test")
@Slf4j
public abstract class AbstractTestcontainersTest {

  static PostgreSQLContainer<?> pg = new PostgreSQLContainer<>(DockerImageName.parse("postgres:14"))
      .withLogConsumer(new Slf4jLogConsumer(log))
      .withExposedPorts(PostgreSQLContainer.POSTGRESQL_PORT)
      .withDatabaseName("kong")
      .withUsername("postgres")
      .withPassword("postgres");


  @DynamicPropertySource
  static void redisProperties(DynamicPropertyRegistry registry) {
    pg.start();
    registry.add("spring.r2dbc.url", () ->
        String.format("r2dbc:pool:postgresql://%s:%d/%s",
                      pg.getHost(),
                      pg.getFirstMappedPort(),
                      pg.getDatabaseName()));
    registry.add("spring.r2dbc.username", pg::getUsername);
    registry.add("spring.r2dbc.password", pg::getPassword);
    // init db from `data.sql` for tests
    registry.add("spring.sql.init.mode", ()->"always");
  }
}
