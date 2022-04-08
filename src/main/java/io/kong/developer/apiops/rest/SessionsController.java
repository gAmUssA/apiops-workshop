package io.kong.developer.apiops.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.kong.developer.apiops.data.SessionRepository;

import io.kong.developer.apiops.model.SessionMapper;
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

  private final SessionRepository sessionRepository;
  private final SessionMapper mapper;

  @Override
  public ResponseEntity<Flux<Session>> listSessions() {
    return ResponseEntity.ok().body(sessionRepository.findAll()
                                        .map(mapper::toResource));
  }

  @Override
  public ResponseEntity<Mono<Session>> getSession(final String id) {
    return ResponseEntity.ok().body(sessionRepository.findById(Integer.parseInt(id))
                                        .switchIfEmpty(Mono.error(new UnknownSessionException()))
                                        .map(mapper::toResource));
  }
}
