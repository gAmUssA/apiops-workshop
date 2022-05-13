package io.kong.developer.apiops.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.kong.developer.apiops.data.ProductRepository;
import io.kong.developer.apiops.model.ProductMapper;
import io.kong.developer.generated.devnexus.api.ProductApi;
import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

  private final ProductMapper mapper;

  private final ProductRepository repository;

  @Override
  public ResponseEntity<Flux<Product>> listProducts(final Type type) {
    if (type != null) {
      return ok().body(repository.findAllByType(type.getValue()).map(mapper::toResource));
    }
    return ok().body(repository.findAll().map(mapper::toResource));
  }
}
