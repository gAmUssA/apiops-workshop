package io.kong.developer.apiops.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import io.kong.developer.generated.devnexus.model.Session;

import static org.assertj.core.api.Assertions.assertThat;

class SessionMapperTest {

  static SessionMapper mapper;

  @BeforeAll
  static void setup() {
    mapper = Mappers.getMapper(SessionMapper.class);
  }

  @Test
  void mapperShouldTransformPresentersToList() {

    final Session generatedSession = new Session();
    generatedSession.setPresenters(new String[]{"Viktor Gamov"});
    generatedSession.setDescription("description");

    final io.kong.developer.apiops.model.Session session = mapper.toDomain(generatedSession);

    assertThat(session.getPresenters()).containsOnlyOnce("Viktor Gamov");
  }

  @Test
  void mapperShouldTransformArrayOfPresentersToList() {
    io.kong.developer.apiops.model.Session domainSession = new io.kong.developer.apiops.model.Session();

    domainSession.setPresenters("Viktor Gamov");
    final Session session = mapper.toResource(domainSession);
    assertThat(session.getPresenters()).hasSize(1);
  }
}