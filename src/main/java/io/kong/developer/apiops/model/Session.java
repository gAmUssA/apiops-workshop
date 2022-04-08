package io.kong.developer.apiops.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Session {

  private String title;
  private String description;
  private List<Presenter> presenters;
  private LocalDate date;
  private Boolean isWorkshop;
}
