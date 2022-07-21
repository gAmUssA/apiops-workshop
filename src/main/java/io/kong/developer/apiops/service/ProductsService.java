package io.kong.developer.apiops.service;

import org.springframework.stereotype.Component;

import io.kong.developer.apiops.data.ProductRepository;
import io.kong.developer.apiops.model.ProductMapper;
import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class ProductsService {

  private final ProductRepository repository;
  private final ProductMapper mapper;

  public Flux<Product> getProductFlux(final Type type) {
    if (type != null) {
      return repository.findAllByType(type.getValue()).map(mapper::toResource);
    }
    return repository.findAll().map(mapper::toResource);
  }
}
