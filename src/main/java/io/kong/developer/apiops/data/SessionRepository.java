package io.kong.developer.apiops.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.kong.developer.apiops.model.Session;

public interface SessionRepository extends ReactiveCrudRepository<Session, Integer> {

}
