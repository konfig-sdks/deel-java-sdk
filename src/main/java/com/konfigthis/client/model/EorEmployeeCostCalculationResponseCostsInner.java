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
 * EorEmployeeCostCalculationResponseCostsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EorEmployeeCostCalculationResponseCostsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private String frequency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public EorEmployeeCostCalculationResponseCostsInner() {
  }

  public EorEmployeeCostCalculationResponseCostsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the cost item.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Health Insurance Estimate", value = "The name of the cost item.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EorEmployeeCostCalculationResponseCostsInner amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount or price of the cost item.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "The amount or price of the cost item.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public EorEmployeeCostCalculationResponseCostsInner frequency(String frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency that the cost item must be paid.
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Monthly", value = "The frequency that the cost item must be paid.")

  public String getFrequency() {
    return frequency;
  }


  public void setFrequency(String frequency) {
    
    
    
    this.frequency = frequency;
  }


  public EorEmployeeCostCalculationResponseCostsInner country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * The country that the cost item is associated with.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Germany", value = "The country that the cost item is associated with.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public EorEmployeeCostCalculationResponseCostsInner countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for the country that the cost item is associated with.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE", value = "The country code for the country that the cost item is associated with.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
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
   * @return the EorEmployeeCostCalculationResponseCostsInner instance itself
   */
  public EorEmployeeCostCalculationResponseCostsInner putAdditionalProperty(String key, Object value) {
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
    EorEmployeeCostCalculationResponseCostsInner eorEmployeeCostCalculationResponseCostsInner = (EorEmployeeCostCalculationResponseCostsInner) o;
    return Objects.equals(this.name, eorEmployeeCostCalculationResponseCostsInner.name) &&
        Objects.equals(this.amount, eorEmployeeCostCalculationResponseCostsInner.amount) &&
        Objects.equals(this.frequency, eorEmployeeCostCalculationResponseCostsInner.frequency) &&
        Objects.equals(this.country, eorEmployeeCostCalculationResponseCostsInner.country) &&
        Objects.equals(this.countryCode, eorEmployeeCostCalculationResponseCostsInner.countryCode)&&
        Objects.equals(this.additionalProperties, eorEmployeeCostCalculationResponseCostsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, frequency, country, countryCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorEmployeeCostCalculationResponseCostsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("amount");
    openapiFields.add("frequency");
    openapiFields.add("country");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EorEmployeeCostCalculationResponseCostsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EorEmployeeCostCalculationResponseCostsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationResponseCostsInner is not found in the empty JSON string", EorEmployeeCostCalculationResponseCostsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationResponseCostsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationResponseCostsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationResponseCostsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationResponseCostsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationResponseCostsInner>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationResponseCostsInner value) throws IOException {
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
           public EorEmployeeCostCalculationResponseCostsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EorEmployeeCostCalculationResponseCostsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EorEmployeeCostCalculationResponseCostsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EorEmployeeCostCalculationResponseCostsInner
  * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationResponseCostsInner
  */
  public static EorEmployeeCostCalculationResponseCostsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationResponseCostsInner.class);
  }

 /**
  * Convert an instance of EorEmployeeCostCalculationResponseCostsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

