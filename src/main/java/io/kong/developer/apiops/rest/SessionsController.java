package io.kong.developer.apiops.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import javax.swing.*;

import io.kong.developer.apiops.service.SessionService;
import io.kong.developer.generated.devnexus.api.SessionsApi;
import io.kong.developer.generated.devnexus.model.Session;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SessionsController implements SessionsApi {

  private final SessionService sessionService;

  @Override
  public ResponseEntity<Flux<Session>> listSessions() {
    return new ResponseEntity<Flux<Session>>(Flux.just(sessionService.getSession()), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Mono<Session>> getSession(final String id) {
    final Session session = sessionService.getSession();
    return new ResponseEntity<Mono<Session>>(Mono.just(session), HttpStatus.OK);
  }
}
