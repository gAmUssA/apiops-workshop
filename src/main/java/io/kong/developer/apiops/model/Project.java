package io.kong.developer.apiops.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Project {

  private String name;
  private String type;
  private String description;

}
