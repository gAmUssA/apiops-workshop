package io.kong.developer.apiops.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.kong.developer.apiops.model.Project;
import io.kong.developer.apiops.model.ProjectProductMapper;
import io.kong.developer.generated.devnexus.api.ProductApi;
import io.kong.developer.generated.devnexus.model.Product;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

  private final ProjectProductMapper mapper;

  @Override
  public ResponseEntity<Flux<Product>> listProducts(final Type type) {
    Project kongGateway = Project.builder()
        .name("Kong Gateway")
        .type("oss")
        .description("Kong or Kong API Gateway is a cloud-native, platform-agnostic, scalable API Gateway distinguished for its high performance and extensibility via plugins.")
        .build();

    Project insomnia = Project.builder()
        .name("Insomnia")
        .description("Insomnia is an open-source, cross-platform API Client for GraphQL, REST, and gRPC.")
        .type("oss")
        .build();

    return ResponseEntity.ok().body(Flux.just(kongGateway, insomnia).map(mapper::toResource));
  }
}
