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
import com.konfigthis.client.model.EorTimeoffsBaseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * EorClientTimeoffRequests
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EorClientTimeoffRequests {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Double year;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Double daysRequested;

  public static final String SERIALIZED_NAME_CURRENT_APPROVED = "current_approved";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVED)
  private Double currentApproved;

  public static final String SERIALIZED_NAME_YEARLY_LIMIT = "yearly_limit";
  @SerializedName(SERIALIZED_NAME_YEARLY_LIMIT)
  private Double yearlyLimit;

  public static final String SERIALIZED_NAME_OVER_ANNUAL_LIMIT = "over_annual_limit";
  @SerializedName(SERIALIZED_NAME_OVER_ANNUAL_LIMIT)
  private Boolean overAnnualLimit;

  public static final String SERIALIZED_NAME_YEARLY_REQUESTS = "yearly_requests";
  @SerializedName(SERIALIZED_NAME_YEARLY_REQUESTS)
  private Double yearlyRequests;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<EorTimeoffsBaseItem> requests = new ArrayList<>();

  public EorClientTimeoffRequests() {
  }

  public EorClientTimeoffRequests year(Double year) {
    
    
    
    
    this.year = year;
    return this;
  }

  public EorClientTimeoffRequests year(Integer year) {
    
    
    
    
    this.year = year.doubleValue();
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022", value = "")

  public Double getYear() {
    return year;
  }


  public void setYear(Double year) {
    
    
    
    this.year = year;
  }


  public EorClientTimeoffRequests daysRequested(Double daysRequested) {
    
    
    
    
    this.daysRequested = daysRequested;
    return this;
  }

  public EorClientTimeoffRequests daysRequested(Integer daysRequested) {
    
    
    
    
    this.daysRequested = daysRequested.doubleValue();
    return this;
  }

   /**
   * Days off requested by employee.
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Days off requested by employee.")

  public Double getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Double daysRequested) {
    
    
    
    this.daysRequested = daysRequested;
  }


  public EorClientTimeoffRequests currentApproved(Double currentApproved) {
    
    
    
    
    this.currentApproved = currentApproved;
    return this;
  }

  public EorClientTimeoffRequests currentApproved(Integer currentApproved) {
    
    
    
    
    this.currentApproved = currentApproved.doubleValue();
    return this;
  }

   /**
   * Days off approved.
   * @return currentApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Days off approved.")

  public Double getCurrentApproved() {
    return currentApproved;
  }


  public void setCurrentApproved(Double currentApproved) {
    
    
    
    this.currentApproved = currentApproved;
  }


  public EorClientTimeoffRequests yearlyLimit(Double yearlyLimit) {
    
    
    
    
    this.yearlyLimit = yearlyLimit;
    return this;
  }

  public EorClientTimeoffRequests yearlyLimit(Integer yearlyLimit) {
    
    
    
    
    this.yearlyLimit = yearlyLimit.doubleValue();
    return this;
  }

   /**
   * Total number of days off allowed per year.
   * @return yearlyLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of days off allowed per year.")

  public Double getYearlyLimit() {
    return yearlyLimit;
  }


  public void setYearlyLimit(Double yearlyLimit) {
    
    
    
    this.yearlyLimit = yearlyLimit;
  }


  public EorClientTimeoffRequests overAnnualLimit(Boolean overAnnualLimit) {
    
    
    
    
    this.overAnnualLimit = overAnnualLimit;
    return this;
  }

   /**
   * Too many days off requested by employee.
   * @return overAnnualLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Too many days off requested by employee.")

  public Boolean getOverAnnualLimit() {
    return overAnnualLimit;
  }


  public void setOverAnnualLimit(Boolean overAnnualLimit) {
    
    
    
    this.overAnnualLimit = overAnnualLimit;
  }


  public EorClientTimeoffRequests yearlyRequests(Double yearlyRequests) {
    
    
    
    
    this.yearlyRequests = yearlyRequests;
    return this;
  }

  public EorClientTimeoffRequests yearlyRequests(Integer yearlyRequests) {
    
    
    
    
    this.yearlyRequests = yearlyRequests.doubleValue();
    return this;
  }

   /**
   * Total number of time off requests this year.
   * @return yearlyRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of time off requests this year.")

  public Double getYearlyRequests() {
    return yearlyRequests;
  }


  public void setYearlyRequests(Double yearlyRequests) {
    
    
    
    this.yearlyRequests = yearlyRequests;
  }


  public EorClientTimeoffRequests requests(List<EorTimeoffsBaseItem> requests) {
    
    
    
    
    this.requests = requests;
    return this;
  }

  public EorClientTimeoffRequests addRequestsItem(EorTimeoffsBaseItem requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * List of time offs.
   * @return requests
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of time offs.")

  public List<EorTimeoffsBaseItem> getRequests() {
    return requests;
  }


  public void setRequests(List<EorTimeoffsBaseItem> requests) {
    
    
    
    this.requests = requests;
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
   * @return the EorClientTimeoffRequests instance itself
   */
  public EorClientTimeoffRequests putAdditionalProperty(String key, Object value) {
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
    EorClientTimeoffRequests eorClientTimeoffRequests = (EorClientTimeoffRequests) o;
    return Objects.equals(this.year, eorClientTimeoffRequests.year) &&
        Objects.equals(this.daysRequested, eorClientTimeoffRequests.daysRequested) &&
        Objects.equals(this.currentApproved, eorClientTimeoffRequests.currentApproved) &&
        Objects.equals(this.yearlyLimit, eorClientTimeoffRequests.yearlyLimit) &&
        Objects.equals(this.overAnnualLimit, eorClientTimeoffRequests.overAnnualLimit) &&
        Objects.equals(this.yearlyRequests, eorClientTimeoffRequests.yearlyRequests) &&
        Objects.equals(this.requests, eorClientTimeoffRequests.requests)&&
        Objects.equals(this.additionalProperties, eorClientTimeoffRequests.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, daysRequested, currentApproved, yearlyLimit, overAnnualLimit, yearlyRequests, requests, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorClientTimeoffRequests {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    currentApproved: ").append(toIndentedString(currentApproved)).append("\n");
    sb.append("    yearlyLimit: ").append(toIndentedString(yearlyLimit)).append("\n");
    sb.append("    overAnnualLimit: ").append(toIndentedString(overAnnualLimit)).append("\n");
    sb.append("    yearlyRequests: ").append(toIndentedString(yearlyRequests)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("days_requested");
    openapiFields.add("current_approved");
    openapiFields.add("yearly_limit");
    openapiFields.add("over_annual_limit");
    openapiFields.add("yearly_requests");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requests");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EorClientTimeoffRequests
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EorClientTimeoffRequests.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorClientTimeoffRequests is not found in the empty JSON string", EorClientTimeoffRequests.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorClientTimeoffRequests.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }

      JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
      // validate the required field `requests` (array)
      for (int i = 0; i < jsonArrayrequests.size(); i++) {
        EorTimeoffsBaseItem.validateJsonObject(jsonArrayrequests.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorClientTimeoffRequests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorClientTimeoffRequests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorClientTimeoffRequests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorClientTimeoffRequests.class));

       return (TypeAdapter<T>) new TypeAdapter<EorClientTimeoffRequests>() {
           @Override
           public void write(JsonWriter out, EorClientTimeoffRequests value) throws IOException {
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
           public EorClientTimeoffRequests read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EorClientTimeoffRequests instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EorClientTimeoffRequests given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EorClientTimeoffRequests
  * @throws IOException if the JSON string is invalid with respect to EorClientTimeoffRequests
  */
  public static EorClientTimeoffRequests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorClientTimeoffRequests.class);
  }

 /**
  * Convert an instance of EorClientTimeoffRequests to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

