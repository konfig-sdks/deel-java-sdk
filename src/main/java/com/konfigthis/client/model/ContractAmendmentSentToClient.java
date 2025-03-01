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
 * ContractAmendmentSentToClient
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContractAmendmentSentToClient {
  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  private String contractOid;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  private String contractName;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Double clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public ContractAmendmentSentToClient() {
  }

  public ContractAmendmentSentToClient contractOid(String contractOid) {
    
    
    
    
    this.contractOid = contractOid;
    return this;
  }

   /**
   * Get contractOid
   * @return contractOid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getContractOid() {
    return contractOid;
  }


  public void setContractOid(String contractOid) {
    
    
    
    this.contractOid = contractOid;
  }


  public ContractAmendmentSentToClient contractName(String contractName) {
    
    
    
    
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getContractName() {
    return contractName;
  }


  public void setContractName(String contractName) {
    
    
    
    this.contractName = contractName;
  }


  public ContractAmendmentSentToClient clientId(Double clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

  public ContractAmendmentSentToClient clientId(Integer clientId) {
    
    
    
    
    this.clientId = clientId.doubleValue();
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getClientId() {
    return clientId;
  }


  public void setClientId(Double clientId) {
    
    
    
    this.clientId = clientId;
  }


  public ContractAmendmentSentToClient clientName(String clientName) {
    
    
    
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    
    
    
    this.clientName = clientName;
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
   * @return the ContractAmendmentSentToClient instance itself
   */
  public ContractAmendmentSentToClient putAdditionalProperty(String key, Object value) {
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
    ContractAmendmentSentToClient contractAmendmentSentToClient = (ContractAmendmentSentToClient) o;
    return Objects.equals(this.contractOid, contractAmendmentSentToClient.contractOid) &&
        Objects.equals(this.contractName, contractAmendmentSentToClient.contractName) &&
        Objects.equals(this.clientId, contractAmendmentSentToClient.clientId) &&
        Objects.equals(this.clientName, contractAmendmentSentToClient.clientName)&&
        Objects.equals(this.additionalProperties, contractAmendmentSentToClient.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractOid, contractName, clientId, clientName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAmendmentSentToClient {\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
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
    openapiFields.add("contract_oid");
    openapiFields.add("contract_name");
    openapiFields.add("client_id");
    openapiFields.add("client_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_oid");
    openapiRequiredFields.add("contract_name");
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractAmendmentSentToClient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContractAmendmentSentToClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractAmendmentSentToClient is not found in the empty JSON string", ContractAmendmentSentToClient.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractAmendmentSentToClient.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (!jsonObj.get("contract_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_name").toString()));
      }
      if (!jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractAmendmentSentToClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractAmendmentSentToClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractAmendmentSentToClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractAmendmentSentToClient.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractAmendmentSentToClient>() {
           @Override
           public void write(JsonWriter out, ContractAmendmentSentToClient value) throws IOException {
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
           public ContractAmendmentSentToClient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContractAmendmentSentToClient instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContractAmendmentSentToClient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractAmendmentSentToClient
  * @throws IOException if the JSON string is invalid with respect to ContractAmendmentSentToClient
  */
  public static ContractAmendmentSentToClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractAmendmentSentToClient.class);
  }

 /**
  * Convert an instance of ContractAmendmentSentToClient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

