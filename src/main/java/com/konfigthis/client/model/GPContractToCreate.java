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
import com.konfigthis.client.model.GPClient;
import com.konfigthis.client.model.GPContractToCreateCompensationDetails;
import com.konfigthis.client.model.GPContractToCreateEmployee;
import com.konfigthis.client.model.GPContractToCreateEmployment;
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
 * GPContractToCreate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GPContractToCreate {
  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private GPContractToCreateEmployee employee;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  private GPContractToCreateEmployment employment;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private GPClient client;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  private GPContractToCreateCompensationDetails compensationDetails;

  public GPContractToCreate() {
  }

  public GPContractToCreate employee(GPContractToCreateEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GPContractToCreateEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(GPContractToCreateEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public GPContractToCreate employment(GPContractToCreateEmployment employment) {
    
    
    
    
    this.employment = employment;
    return this;
  }

   /**
   * Get employment
   * @return employment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GPContractToCreateEmployment getEmployment() {
    return employment;
  }


  public void setEmployment(GPContractToCreateEmployment employment) {
    
    
    
    this.employment = employment;
  }


  public GPContractToCreate jobTitle(String jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Employee&#39;s job title.
   * @return jobTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Employee's job title.")

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
  }


  public GPContractToCreate client(GPClient client) {
    
    
    
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GPClient getClient() {
    return client;
  }


  public void setClient(GPClient client) {
    
    
    
    this.client = client;
  }


  public GPContractToCreate compensationDetails(GPContractToCreateCompensationDetails compensationDetails) {
    
    
    
    
    this.compensationDetails = compensationDetails;
    return this;
  }

   /**
   * Get compensationDetails
   * @return compensationDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GPContractToCreateCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }


  public void setCompensationDetails(GPContractToCreateCompensationDetails compensationDetails) {
    
    
    
    this.compensationDetails = compensationDetails;
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
   * @return the GPContractToCreate instance itself
   */
  public GPContractToCreate putAdditionalProperty(String key, Object value) {
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
    GPContractToCreate gpContractToCreate = (GPContractToCreate) o;
    return Objects.equals(this.employee, gpContractToCreate.employee) &&
        Objects.equals(this.employment, gpContractToCreate.employment) &&
        Objects.equals(this.jobTitle, gpContractToCreate.jobTitle) &&
        Objects.equals(this.client, gpContractToCreate.client) &&
        Objects.equals(this.compensationDetails, gpContractToCreate.compensationDetails)&&
        Objects.equals(this.additionalProperties, gpContractToCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, employment, jobTitle, client, compensationDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractToCreate {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
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
    openapiFields.add("employee");
    openapiFields.add("employment");
    openapiFields.add("job_title");
    openapiFields.add("client");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("compensation_details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GPContractToCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GPContractToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractToCreate is not found in the empty JSON string", GPContractToCreate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPContractToCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `employee`
      GPContractToCreateEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      // validate the required field `employment`
      GPContractToCreateEmployment.validateJsonObject(jsonObj.getAsJsonObject("employment"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `client`
      GPClient.validateJsonObject(jsonObj.getAsJsonObject("client"));
      // validate the required field `compensation_details`
      GPContractToCreateCompensationDetails.validateJsonObject(jsonObj.getAsJsonObject("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractToCreate>() {
           @Override
           public void write(JsonWriter out, GPContractToCreate value) throws IOException {
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
           public GPContractToCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GPContractToCreate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GPContractToCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GPContractToCreate
  * @throws IOException if the JSON string is invalid with respect to GPContractToCreate
  */
  public static GPContractToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractToCreate.class);
  }

 /**
  * Convert an instance of GPContractToCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

