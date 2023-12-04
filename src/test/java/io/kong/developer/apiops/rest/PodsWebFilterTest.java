package io.kong.developer.apiops.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import io.kong.developer.apiops.testcontainers.AbstractTestcontainersTest;
import io.kong.developer.generated.devnexus.model.Session;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PodsWebFilterTest extends AbstractTestcontainersTest {

  @Autowired
  private WebTestClient webTestClient;

  @Test
  public void filterShouldAddResponseHeaders() {
    EntityExchangeResult<Session> result = webTestClient.get()
        .uri("/sessions/1")
        .exchange()
        .expectStatus().isOk()
        .expectBody(Session.class)
        .returnResult();

    assertThat(result.getResponseHeaders().getFirst("X-Pod-Name")).isNotEmpty();
  }

}