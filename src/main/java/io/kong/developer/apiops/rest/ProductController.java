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

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

  private final ProductMapper mapper;
  
  private final ProductRepository repository;

  /* TODO: make method to find products by type */
  @Override
  public ResponseEntity<Flux<Product>> listProducts(final Type type) {

    final Flux<io.kong.developer.apiops.model.Product> all = repository.findAll();
    
    return ResponseEntity.ok().body(all.map(mapper::toResource));
  }
}
