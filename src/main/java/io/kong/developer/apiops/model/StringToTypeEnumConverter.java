package io.kong.developer.apiops.model;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import io.kong.developer.apiops.rest.UnknownProductException;
import io.kong.developer.generated.devnexus.model.Type;
import lombok.SneakyThrows;

@Component
public class StringToTypeEnumConverter implements Converter<String, Type> {

  @SneakyThrows
  @Override
  public Type convert(final String source) {
    return Type.valueOf(source.toUpperCase());
  }
}
