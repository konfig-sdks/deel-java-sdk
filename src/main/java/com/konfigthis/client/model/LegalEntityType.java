/*
 * Deel REST API
 * API specification for Deel HR user provisioning API. This YAML file is a preview of the API Deel is building. We are looking forward to your feedback.
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets LegalEntityType
 */
@JsonAdapter(LegalEntityType.Adapter.class)public enum LegalEntityType {
  
  INDIVIDUAL("individual"),
  
  COMPANY("company");

  private String value;

  LegalEntityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LegalEntityType fromValue(String value) {
    for (LegalEntityType b : LegalEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LegalEntityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LegalEntityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LegalEntityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LegalEntityType.fromValue(value);
    }
  }
}

