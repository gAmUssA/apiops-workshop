package io.kong.developer.apiops.model;


import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Locale;

import io.kong.developer.generated.devnexus.model.Product;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProjectProductMapper {

  Product toResource(Project project);

  Project toDomain(Product product);

  @Mapping(source = "type", target = "type")
  default String toResource(String project) {
    if ("oss".equals(project)) {
      return project.toUpperCase(Locale.ROOT);
    }
    return project;
  }
}
