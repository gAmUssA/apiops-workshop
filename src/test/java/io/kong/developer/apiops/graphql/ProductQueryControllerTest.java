package io.kong.developer.apiops.graphql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.graphql.test.tester.HttpGraphQlTester;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.stream.Stream;

import io.kong.developer.apiops.testcontainers.AbstractTestcontainersTest;
import io.kong.developer.generated.devnexus.model.Product;

import static java.util.stream.Stream.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductQueryControllerTest extends AbstractTestcontainersTest {

  @Autowired
  ApplicationContext context;

  private WebTestClient webTestClient;

  @BeforeEach
  public void setup() {
    webTestClient =
        WebTestClient.bindToApplicationContext(context)
            .configureClient()
            .baseUrl("/graphql")
            .build();
  }

  @Test
  void products() {
    final HttpGraphQlTester tester = HttpGraphQlTester.create(webTestClient);
    tester.documentName("products")
        .execute()
        .path("products")
        .entityList(Product.class)
        .hasSize(5);
  }

  @ParameterizedTest(name = "{0} products count is {1}")
  @MethodSource("provideProductTypeAndCount")
  void productsBy(String type, int count) {
    HttpGraphQlTester.create(webTestClient)
        .documentName("productsByType")
        .variable("productType", type)
        .execute().path("productsByType")
        .entityList(Product.class)
        .hasSize(count);
  }

  private static Stream<Arguments> provideProductTypeAndCount() {
    return of(
        Arguments.of("oss", 3),
        Arguments.of("enterprise", 2)
    );
  }
}