/*
 * Copyright 2020 the original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.kong.developer.apiops.model;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.kong.developer.generated.devnexus.model.Session;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SessionMapper {


  @Mapping(source = "title", target = "title")
  Session toResource(io.kong.developer.apiops.model.Session source);

  default String toResource(Presenter source) {
    return source.toString();
  }

  io.kong.developer.apiops.model.Session toDomain(Session session);

  default List<Presenter> toDomain(String[] presenters) {
    return Stream.of(presenters)
        .map(a -> {
          Presenter p = new Presenter();
          final String[] s = a.split(" ");
          p.setFirstName(s[0]);
          p.setLastName(s[1]);
          return p;
        })
        .collect(Collectors.toList());
  }

}
