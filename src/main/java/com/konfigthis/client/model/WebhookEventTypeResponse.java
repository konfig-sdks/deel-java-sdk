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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WebhookEventTypeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookEventTypeResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_MODULE_NAME = "module_name";
  @SerializedName(SERIALIZED_NAME_MODULE_NAME)
  private String moduleName;

  public static final String SERIALIZED_NAME_MODULE_LABEL = "module_label";
  @SerializedName(SERIALIZED_NAME_MODULE_LABEL)
  private String moduleLabel;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAYLOAD_EXAMPLE = "payload_example";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_EXAMPLE)
  private String payloadExample;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public WebhookEventTypeResponse() {
  }

  public WebhookEventTypeResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Describes the webhook event and other pertinent info.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Triggered when a contract status changes.", required = true, value = "Describes the webhook event and other pertinent info.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public WebhookEventTypeResponse id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public WebhookEventTypeResponse id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Event type unique identifier.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Event type unique identifier.")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public WebhookEventTypeResponse moduleName(String moduleName) {
    
    
    
    
    this.moduleName = moduleName;
    return this;
  }

   /**
   * Name of the rabbit queue.
   * @return moduleName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "contract", required = true, value = "Name of the rabbit queue.")

  public String getModuleName() {
    return moduleName;
  }


  public void setModuleName(String moduleName) {
    
    
    
    this.moduleName = moduleName;
  }


  public WebhookEventTypeResponse moduleLabel(String moduleLabel) {
    
    
    
    
    this.moduleLabel = moduleLabel;
    return this;
  }

   /**
   * Display name of the rabbit queue in Deel UI.
   * @return moduleLabel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Contracts", required = true, value = "Display name of the rabbit queue in Deel UI.")

  public String getModuleLabel() {
    return moduleLabel;
  }


  public void setModuleLabel(String moduleLabel) {
    
    
    
    this.moduleLabel = moduleLabel;
  }


  public WebhookEventTypeResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the webhook event.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "invoice-adjustment.reviewed", required = true, value = "Name of the webhook event.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WebhookEventTypeResponse payloadExample(String payloadExample) {
    
    
    
    
    this.payloadExample = payloadExample;
    return this;
  }

   /**
   * JSON payload example of the specific event.
   * @return payloadExample
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON payload example of the specific event.")

  public String getPayloadExample() {
    return payloadExample;
  }


  public void setPayloadExample(String payloadExample) {
    
    
    
    this.payloadExample = payloadExample;
  }


  public WebhookEventTypeResponse createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which the event type was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the event type was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public WebhookEventTypeResponse updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time at which the event type was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the event type was updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the WebhookEventTypeResponse instance itself
   */
  public WebhookEventTypeResponse putAdditionalProperty(String key, Object value) {
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
    WebhookEventTypeResponse webhookEventTypeResponse = (WebhookEventTypeResponse) o;
    return Objects.equals(this.description, webhookEventTypeResponse.description) &&
        Objects.equals(this.id, webhookEventTypeResponse.id) &&
        Objects.equals(this.moduleName, webhookEventTypeResponse.moduleName) &&
        Objects.equals(this.moduleLabel, webhookEventTypeResponse.moduleLabel) &&
        Objects.equals(this.name, webhookEventTypeResponse.name) &&
        Objects.equals(this.payloadExample, webhookEventTypeResponse.payloadExample) &&
        Objects.equals(this.createdAt, webhookEventTypeResponse.createdAt) &&
        Objects.equals(this.updatedAt, webhookEventTypeResponse.updatedAt)&&
        Objects.equals(this.additionalProperties, webhookEventTypeResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, moduleName, moduleLabel, name, payloadExample, createdAt, updatedAt, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEventTypeResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleLabel: ").append(toIndentedString(moduleLabel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payloadExample: ").append(toIndentedString(payloadExample)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("module_name");
    openapiFields.add("module_label");
    openapiFields.add("name");
    openapiFields.add("payload_example");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("module_name");
    openapiRequiredFields.add("module_label");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookEventTypeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookEventTypeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEventTypeResponse is not found in the empty JSON string", WebhookEventTypeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookEventTypeResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("module_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_name").toString()));
      }
      if (!jsonObj.get("module_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_label").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("payload_example").isJsonNull() && (jsonObj.get("payload_example") != null && !jsonObj.get("payload_example").isJsonNull()) && !jsonObj.get("payload_example").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload_example` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload_example").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEventTypeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEventTypeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEventTypeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEventTypeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEventTypeResponse>() {
           @Override
           public void write(JsonWriter out, WebhookEventTypeResponse value) throws IOException {
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
           public WebhookEventTypeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookEventTypeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookEventTypeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookEventTypeResponse
  * @throws IOException if the JSON string is invalid with respect to WebhookEventTypeResponse
  */
  public static WebhookEventTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEventTypeResponse.class);
  }

 /**
  * Convert an instance of WebhookEventTypeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

