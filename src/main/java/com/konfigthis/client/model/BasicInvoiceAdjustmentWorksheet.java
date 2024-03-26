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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BasicInvoiceAdjustmentWorksheet
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BasicInvoiceAdjustmentWorksheet {
  public static final String SERIALIZED_NAME_WEEKS = "weeks";
  @SerializedName(SERIALIZED_NAME_WEEKS)
  private Double weeks;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Double days;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Double minutes;

  public BasicInvoiceAdjustmentWorksheet() {
  }

  public BasicInvoiceAdjustmentWorksheet weeks(Double weeks) {
    if (weeks != null && weeks < 0) {
      throw new IllegalArgumentException("Invalid value for weeks. Must be greater than or equal to 0.");
    }
    
    
    
    this.weeks = weeks;
    return this;
  }

  public BasicInvoiceAdjustmentWorksheet weeks(Integer weeks) {
    if (weeks != null && weeks < 0) {
      throw new IllegalArgumentException("Invalid value for weeks. Must be greater than or equal to 0.");
    }
    
    
    
    this.weeks = weeks.doubleValue();
    return this;
  }

   /**
   * Get weeks
   * minimum: 0
   * @return weeks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public Double getWeeks() {
    return weeks;
  }


  public void setWeeks(Double weeks) {
    if (weeks != null && weeks < 0) {
      throw new IllegalArgumentException("Invalid value for weeks. Must be greater than or equal to 0.");
    }
    
    
    this.weeks = weeks;
  }


  public BasicInvoiceAdjustmentWorksheet days(Double days) {
    if (days != null && days < 0) {
      throw new IllegalArgumentException("Invalid value for days. Must be greater than or equal to 0.");
    }
    
    
    
    this.days = days;
    return this;
  }

  public BasicInvoiceAdjustmentWorksheet days(Integer days) {
    if (days != null && days < 0) {
      throw new IllegalArgumentException("Invalid value for days. Must be greater than or equal to 0.");
    }
    
    
    
    this.days = days.doubleValue();
    return this;
  }

   /**
   * Get days
   * minimum: 0
   * @return days
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public Double getDays() {
    return days;
  }


  public void setDays(Double days) {
    if (days != null && days < 0) {
      throw new IllegalArgumentException("Invalid value for days. Must be greater than or equal to 0.");
    }
    
    
    this.days = days;
  }


  public BasicInvoiceAdjustmentWorksheet hours(Double hours) {
    if (hours != null && hours < 0) {
      throw new IllegalArgumentException("Invalid value for hours. Must be greater than or equal to 0.");
    }
    
    
    
    this.hours = hours;
    return this;
  }

  public BasicInvoiceAdjustmentWorksheet hours(Integer hours) {
    if (hours != null && hours < 0) {
      throw new IllegalArgumentException("Invalid value for hours. Must be greater than or equal to 0.");
    }
    
    
    
    this.hours = hours.doubleValue();
    return this;
  }

   /**
   * Get hours
   * minimum: 0
   * @return hours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    if (hours != null && hours < 0) {
      throw new IllegalArgumentException("Invalid value for hours. Must be greater than or equal to 0.");
    }
    
    
    this.hours = hours;
  }


  public BasicInvoiceAdjustmentWorksheet minutes(Double minutes) {
    if (minutes != null && minutes < 0) {
      throw new IllegalArgumentException("Invalid value for minutes. Must be greater than or equal to 0.");
    }
    
    
    
    this.minutes = minutes;
    return this;
  }

  public BasicInvoiceAdjustmentWorksheet minutes(Integer minutes) {
    if (minutes != null && minutes < 0) {
      throw new IllegalArgumentException("Invalid value for minutes. Must be greater than or equal to 0.");
    }
    
    
    
    this.minutes = minutes.doubleValue();
    return this;
  }

   /**
   * Get minutes
   * minimum: 0
   * @return minutes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public Double getMinutes() {
    return minutes;
  }


  public void setMinutes(Double minutes) {
    if (minutes != null && minutes < 0) {
      throw new IllegalArgumentException("Invalid value for minutes. Must be greater than or equal to 0.");
    }
    
    
    this.minutes = minutes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BasicInvoiceAdjustmentWorksheet instance itself
   */
  public BasicInvoiceAdjustmentWorksheet putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicInvoiceAdjustmentWorksheet basicInvoiceAdjustmentWorksheet = (BasicInvoiceAdjustmentWorksheet) o;
    return Objects.equals(this.weeks, basicInvoiceAdjustmentWorksheet.weeks) &&
        Objects.equals(this.days, basicInvoiceAdjustmentWorksheet.days) &&
        Objects.equals(this.hours, basicInvoiceAdjustmentWorksheet.hours) &&
        Objects.equals(this.minutes, basicInvoiceAdjustmentWorksheet.minutes)&&
        Objects.equals(this.additionalProperties, basicInvoiceAdjustmentWorksheet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeks, days, hours, minutes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInvoiceAdjustmentWorksheet {\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("weeks");
    openapiFields.add("days");
    openapiFields.add("hours");
    openapiFields.add("minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("weeks");
    openapiRequiredFields.add("days");
    openapiRequiredFields.add("hours");
    openapiRequiredFields.add("minutes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BasicInvoiceAdjustmentWorksheet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BasicInvoiceAdjustmentWorksheet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasicInvoiceAdjustmentWorksheet is not found in the empty JSON string", BasicInvoiceAdjustmentWorksheet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BasicInvoiceAdjustmentWorksheet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasicInvoiceAdjustmentWorksheet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasicInvoiceAdjustmentWorksheet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasicInvoiceAdjustmentWorksheet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasicInvoiceAdjustmentWorksheet.class));

       return (TypeAdapter<T>) new TypeAdapter<BasicInvoiceAdjustmentWorksheet>() {
           @Override
           public void write(JsonWriter out, BasicInvoiceAdjustmentWorksheet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BasicInvoiceAdjustmentWorksheet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BasicInvoiceAdjustmentWorksheet instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BasicInvoiceAdjustmentWorksheet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BasicInvoiceAdjustmentWorksheet
  * @throws IOException if the JSON string is invalid with respect to BasicInvoiceAdjustmentWorksheet
  */
  public static BasicInvoiceAdjustmentWorksheet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasicInvoiceAdjustmentWorksheet.class);
  }

 /**
  * Convert an instance of BasicInvoiceAdjustmentWorksheet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

