package io.kong.developer.apiops.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Session {

  @Id
  Integer id;
  private String title;
  private String description;

  //private List<Presenter> presenters;
  private String presenters;
  private LocalDate date;
  private Boolean isWorkshop;
}
