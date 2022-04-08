package io.kong.developer.apiops.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

import io.kong.developer.generated.devnexus.model.Session;

@Component
public class SessionService {

  public Session getSession() {
    final Session session = new Session();
    session.setTitle("Supercharge your Ingress with Kong");
    session.setDate(LocalDate.of(2022, 04, 13));
    session.setIsWorkshop(false);
    session.setDescription("During this talk, you will learn how to declaratively enable security, API rate limiting, how to add native gRPC support using Kong Gateway and plugins.");
    session.setPresenters(new String[]{"Viktor Gamov"});
    return session;
  }

}
