package io.kong.developer.apiops.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.kong.developer.apiops.model.Product;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {

  Flux<Product> findAllByType(String type);

}
