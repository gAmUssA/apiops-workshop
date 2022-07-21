package io.kong.developer.apiops.rest;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.kong.developer.apiops.service.ProductsService;
import io.kong.developer.generated.devnexus.api.ProductApi;
import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

  private final ProductsService productsService;

  @Override
  public ResponseEntity<Flux<Product>> listProducts(@Argument final Type type) {
    return ok().body(productsService.getProductFlux(type));
  }
}
