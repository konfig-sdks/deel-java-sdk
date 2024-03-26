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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;.
 */
@JsonAdapter(WorkStatementPaymentDueTypeEnum.Adapter.class)public enum WorkStatementPaymentDueTypeEnum {
  
  REGULAR("REGULAR"),
  
  WITHIN_MONTH("WITHIN_MONTH");

  private String value;

  WorkStatementPaymentDueTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WorkStatementPaymentDueTypeEnum fromValue(String value) {
    for (WorkStatementPaymentDueTypeEnum b : WorkStatementPaymentDueTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WorkStatementPaymentDueTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final WorkStatementPaymentDueTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WorkStatementPaymentDueTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WorkStatementPaymentDueTypeEnum.fromValue(value);
    }
  }
}

