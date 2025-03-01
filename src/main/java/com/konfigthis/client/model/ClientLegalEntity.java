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
import com.konfigthis.client.model.LegalEntityType;
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
 * ClientLegalEntity
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClientLegalEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LegalEntityType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vat_number";
  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  private String vatNumber;

  public ClientLegalEntity() {
  }

  public ClientLegalEntity id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this resource.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "Unique identifier of this resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ClientLegalEntity name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ClientLegalEntity email(String email) {
    
    
    if (email != null && email.length() < 5) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 5.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "User's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 5) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 5.");
    }
    this.email = email;
  }


  public ClientLegalEntity type(LegalEntityType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LegalEntityType getType() {
    return type;
  }


  public void setType(LegalEntityType type) {
    
    
    
    this.type = type;
  }


  public ClientLegalEntity subtype(String subtype) {
    
    
    
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    
    
    
    this.subtype = subtype;
  }


  public ClientLegalEntity registrationNumber(String registrationNumber) {
    
    
    
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(String registrationNumber) {
    
    
    
    this.registrationNumber = registrationNumber;
  }


  public ClientLegalEntity vatNumber(String vatNumber) {
    
    
    
    
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Get vatNumber
   * @return vatNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVatNumber() {
    return vatNumber;
  }


  public void setVatNumber(String vatNumber) {
    
    
    
    this.vatNumber = vatNumber;
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
   * @return the ClientLegalEntity instance itself
   */
  public ClientLegalEntity putAdditionalProperty(String key, Object value) {
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
    ClientLegalEntity clientLegalEntity = (ClientLegalEntity) o;
    return Objects.equals(this.id, clientLegalEntity.id) &&
        Objects.equals(this.name, clientLegalEntity.name) &&
        Objects.equals(this.email, clientLegalEntity.email) &&
        Objects.equals(this.type, clientLegalEntity.type) &&
        Objects.equals(this.subtype, clientLegalEntity.subtype) &&
        Objects.equals(this.registrationNumber, clientLegalEntity.registrationNumber) &&
        Objects.equals(this.vatNumber, clientLegalEntity.vatNumber)&&
        Objects.equals(this.additionalProperties, clientLegalEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, type, subtype, registrationNumber, vatNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLegalEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("registration_number");
    openapiFields.add("vat_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("registration_number");
    openapiRequiredFields.add("vat_number");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientLegalEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientLegalEntity is not found in the empty JSON string", ClientLegalEntity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientLegalEntity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if (!jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
      if (!jsonObj.get("vat_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientLegalEntity>() {
           @Override
           public void write(JsonWriter out, ClientLegalEntity value) throws IOException {
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
           public ClientLegalEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClientLegalEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientLegalEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientLegalEntity
  * @throws IOException if the JSON string is invalid with respect to ClientLegalEntity
  */
  public static ClientLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientLegalEntity.class);
  }

 /**
  * Convert an instance of ClientLegalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

