package io.kong.developer.apiops.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Session;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductsWebTest {

  @Autowired
  private WebTestClient webTestClient;


  @Test
  public void shouldReturnTwoOSSProducts() {
    final EntityExchangeResult<List<Product>> result = webTestClient.get()
        .uri("/products?type=oss")
        .exchange()
        .expectStatus().isOk()
        .expectBodyList(Product.class)
        .returnResult();

    assertThat(result.getResponseBody()).hasSize(2);

  }

  @Test
  public void shouldReturnOneEnterpriseProduct() {
    final EntityExchangeResult<List<Product>> result = webTestClient.get()
        .uri("/products?type=enterprise")
        .exchange()
        .expectStatus().isOk()
        .expectBodyList(Product.class)
        .returnResult();

    assertThat(result.getResponseBody()).hasSize(1);

  }

  @Test
  public void shouldReturnNotFound() {
    webTestClient.get()
        .uri("/products?type=blah")
        .exchange()
        .expectStatus().isNotFound().expectStatus().isBadRequest();
  }
}
