package io.kong.developer.apiops.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import io.kong.developer.apiops.service.ProductsService;
import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class ProductQueryController {

  private final ProductsService productsService;

  @QueryMapping
  public Flux<Product> productsByType(@Argument final Type type) {
    return productsService.getProductFlux(type);
  }

  @QueryMapping
  public Flux<Product> products() {
    return productsService.getProductFlux(null);
  }
}
