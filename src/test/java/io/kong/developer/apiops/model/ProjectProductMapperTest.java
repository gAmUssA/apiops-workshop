package io.kong.developer.apiops.model;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectProductMapperTest {

  @Test
  void toResource() {
    final ProjectProductMapper mapper = Mappers.getMapper(ProjectProductMapper.class);

    final Project project = new Project("Kong Gateway",
                                        "oss",
                                        "Kong or Kong API Gateway is a cloud-native, platform-agnostic, scalable API Gateway distinguished for its high performance and extensibility via plugins.");

    assertThat(mapper.toResource(project).getType()).isEqualTo("OSS");
  }
}