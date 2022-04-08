package io.kong.developer.apiops.model;


import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.util.StringUtils;

import java.util.Locale;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {

  io.kong.developer.generated.devnexus.model.Product toResource(Product project);

  Product toDomain(io.kong.developer.generated.devnexus.model.Product product);

  /**
   * just a simple function to demonstrate mapping/transformation capabilities
   */
  @Mapping(source = "type", target = "type")
  default String toResource(String project) {
    if ("oss".equals(project)) {
      return project.toUpperCase(Locale.ROOT);
    }
    return StringUtils.capitalize(project);
  }
}
