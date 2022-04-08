package io.kong.developer.apiops.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.kong.developer.apiops.model.Product;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {

}
