package io.kong.developer.apiops.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import io.kong.developer.apiops.testcontainers.AbstractTestcontainersTest;

import static org.assertj.core.api.Assertions.assertThat;
import static reactor.test.StepVerifier.create;

public class ProductsRepositoryTest extends AbstractTestcontainersTest {

  @Autowired
  private ProductRepository repository;

  @Test
  @DisplayName("should return three products")
  public void repoTest() {
    create(repository.count())
        .assertNext(count -> assertThat(count).isEqualTo(3))
        .expectComplete()
        .verify();
  }

  @Test
  @DisplayName("should return two OSS products")
  public void restTest2() {
    create(repository.countByType("oss"))
        .assertNext(count -> assertThat(count).isEqualTo(2))
        .expectComplete()
        .verify();
  }
}
