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
import com.konfigthis.client.model.AuthenticationScheme;
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
 * AuthenticationSchemes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthenticationSchemes {
  public static final String SERIALIZED_NAME_AUTHENTICATION_SCHEMES = "authenticationSchemes";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_SCHEMES)
  private List<AuthenticationScheme> authenticationSchemes = null;

  public AuthenticationSchemes() {
  }

  public AuthenticationSchemes authenticationSchemes(List<AuthenticationScheme> authenticationSchemes) {
    
    
    
    
    this.authenticationSchemes = authenticationSchemes;
    return this;
  }

  public AuthenticationSchemes addAuthenticationSchemesItem(AuthenticationScheme authenticationSchemesItem) {
    if (this.authenticationSchemes == null) {
      this.authenticationSchemes = new ArrayList<>();
    }
    this.authenticationSchemes.add(authenticationSchemesItem);
    return this;
  }

   /**
   * Get authenticationSchemes
   * @return authenticationSchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuthenticationScheme> getAuthenticationSchemes() {
    return authenticationSchemes;
  }


  public void setAuthenticationSchemes(List<AuthenticationScheme> authenticationSchemes) {
    
    
    
    this.authenticationSchemes = authenticationSchemes;
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
   * @return the AuthenticationSchemes instance itself
   */
  public AuthenticationSchemes putAdditionalProperty(String key, Object value) {
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
    AuthenticationSchemes authenticationSchemes = (AuthenticationSchemes) o;
    return Objects.equals(this.authenticationSchemes, authenticationSchemes.authenticationSchemes)&&
        Objects.equals(this.additionalProperties, authenticationSchemes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationSchemes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationSchemes {\n");
    sb.append("    authenticationSchemes: ").append(toIndentedString(authenticationSchemes)).append("\n");
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
    openapiFields.add("authenticationSchemes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticationSchemes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthenticationSchemes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationSchemes is not found in the empty JSON string", AuthenticationSchemes.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("authenticationSchemes") != null && !jsonObj.get("authenticationSchemes").isJsonNull()) {
        JsonArray jsonArrayauthenticationSchemes = jsonObj.getAsJsonArray("authenticationSchemes");
        if (jsonArrayauthenticationSchemes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authenticationSchemes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authenticationSchemes` to be an array in the JSON string but got `%s`", jsonObj.get("authenticationSchemes").toString()));
          }

          // validate the optional field `authenticationSchemes` (array)
          for (int i = 0; i < jsonArrayauthenticationSchemes.size(); i++) {
            AuthenticationScheme.validateJsonObject(jsonArrayauthenticationSchemes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationSchemes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationSchemes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationSchemes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationSchemes.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationSchemes>() {
           @Override
           public void write(JsonWriter out, AuthenticationSchemes value) throws IOException {
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
           public AuthenticationSchemes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthenticationSchemes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthenticationSchemes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticationSchemes
  * @throws IOException if the JSON string is invalid with respect to AuthenticationSchemes
  */
  public static AuthenticationSchemes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticationSchemes.class);
  }

 /**
  * Convert an instance of AuthenticationSchemes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

