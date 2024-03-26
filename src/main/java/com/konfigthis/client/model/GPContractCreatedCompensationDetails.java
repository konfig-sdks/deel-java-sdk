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
 * GPContractCreatedCompensationDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GPContractCreatedCompensationDetails {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  private Double salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private String scale;

  public GPContractCreatedCompensationDetails() {
  }

  public GPContractCreatedCompensationDetails salary(Double salary) {
    
    
    
    
    this.salary = salary;
    return this;
  }

  public GPContractCreatedCompensationDetails salary(Integer salary) {
    
    
    
    
    this.salary = salary.doubleValue();
    return this;
  }

   /**
   * Gross annual/month salary.
   * @return salary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gross annual/month salary.")

  public Double getSalary() {
    return salary;
  }


  public void setSalary(Double salary) {
    
    
    
    this.salary = salary;
  }


  public GPContractCreatedCompensationDetails currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency of gross annual/month salary.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency of gross annual/month salary.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public GPContractCreatedCompensationDetails scale(String scale) {
    
    
    
    
    this.scale = scale;
    return this;
  }

   /**
   * Scale at which the salary is paid.
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scale at which the salary is paid.")

  public String getScale() {
    return scale;
  }


  public void setScale(String scale) {
    
    
    
    this.scale = scale;
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
   * @return the GPContractCreatedCompensationDetails instance itself
   */
  public GPContractCreatedCompensationDetails putAdditionalProperty(String key, Object value) {
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
    GPContractCreatedCompensationDetails gpContractCreatedCompensationDetails = (GPContractCreatedCompensationDetails) o;
    return Objects.equals(this.salary, gpContractCreatedCompensationDetails.salary) &&
        Objects.equals(this.currency, gpContractCreatedCompensationDetails.currency) &&
        Objects.equals(this.scale, gpContractCreatedCompensationDetails.scale)&&
        Objects.equals(this.additionalProperties, gpContractCreatedCompensationDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, currency, scale, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractCreatedCompensationDetails {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
    openapiFields.add("salary");
    openapiFields.add("currency");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GPContractCreatedCompensationDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GPContractCreatedCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractCreatedCompensationDetails is not found in the empty JSON string", GPContractCreatedCompensationDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractCreatedCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractCreatedCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractCreatedCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractCreatedCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractCreatedCompensationDetails>() {
           @Override
           public void write(JsonWriter out, GPContractCreatedCompensationDetails value) throws IOException {
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
           public GPContractCreatedCompensationDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GPContractCreatedCompensationDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GPContractCreatedCompensationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GPContractCreatedCompensationDetails
  * @throws IOException if the JSON string is invalid with respect to GPContractCreatedCompensationDetails
  */
  public static GPContractCreatedCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractCreatedCompensationDetails.class);
  }

 /**
  * Convert an instance of GPContractCreatedCompensationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

