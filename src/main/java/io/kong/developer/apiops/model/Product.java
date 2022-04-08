package io.kong.developer.apiops.model;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

  @Id
  Integer id;
  private String name;
  private String type;
  private String description;

}
