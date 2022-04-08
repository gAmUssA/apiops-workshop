package io.kong.developer.apiops.model;

import java.util.StringJoiner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Presenter {

  private String firstName;
  private String lastName;

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }
}
