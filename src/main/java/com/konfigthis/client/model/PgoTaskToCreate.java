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
import com.konfigthis.client.model.FileAttachmentInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * PgoTaskToCreate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PgoTaskToCreate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  private LocalDate dateSubmitted;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private FileAttachmentInfo attachment;

  public PgoTaskToCreate() {
  }

  public PgoTaskToCreate description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Task description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Make the button pop.", required = true, value = "Task description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PgoTaskToCreate amount(String amount) {
    
    
    if (amount != null && amount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for amount. Length must be greater than or equal to 1.");
    }
    
    this.amount = amount;
    return this;
  }

   /**
   * Fixed rate for this task.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.45", required = true, value = "Fixed rate for this task.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    if (amount != null && amount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for amount. Length must be greater than or equal to 1.");
    }
    this.amount = amount;
  }


  public PgoTaskToCreate dateSubmitted(LocalDate dateSubmitted) {
    
    
    
    
    this.dateSubmitted = dateSubmitted;
    return this;
  }

   /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return dateSubmitted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.")

  public LocalDate getDateSubmitted() {
    return dateSubmitted;
  }


  public void setDateSubmitted(LocalDate dateSubmitted) {
    
    
    
    this.dateSubmitted = dateSubmitted;
  }


  public PgoTaskToCreate attachment(FileAttachmentInfo attachment) {
    
    
    
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileAttachmentInfo getAttachment() {
    return attachment;
  }


  public void setAttachment(FileAttachmentInfo attachment) {
    
    
    
    this.attachment = attachment;
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
   * @return the PgoTaskToCreate instance itself
   */
  public PgoTaskToCreate putAdditionalProperty(String key, Object value) {
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
    PgoTaskToCreate pgoTaskToCreate = (PgoTaskToCreate) o;
    return Objects.equals(this.description, pgoTaskToCreate.description) &&
        Objects.equals(this.amount, pgoTaskToCreate.amount) &&
        Objects.equals(this.dateSubmitted, pgoTaskToCreate.dateSubmitted) &&
        Objects.equals(this.attachment, pgoTaskToCreate.attachment)&&
        Objects.equals(this.additionalProperties, pgoTaskToCreate.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, amount, dateSubmitted, attachment, additionalProperties);
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
    sb.append("class PgoTaskToCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("date_submitted");
    openapiFields.add("attachment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("date_submitted");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PgoTaskToCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PgoTaskToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PgoTaskToCreate is not found in the empty JSON string", PgoTaskToCreate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PgoTaskToCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // validate the optional field `attachment`
      if (jsonObj.get("attachment") != null && !jsonObj.get("attachment").isJsonNull()) {
        FileAttachmentInfo.validateJsonObject(jsonObj.getAsJsonObject("attachment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PgoTaskToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PgoTaskToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PgoTaskToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PgoTaskToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<PgoTaskToCreate>() {
           @Override
           public void write(JsonWriter out, PgoTaskToCreate value) throws IOException {
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
           public PgoTaskToCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PgoTaskToCreate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PgoTaskToCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PgoTaskToCreate
  * @throws IOException if the JSON string is invalid with respect to PgoTaskToCreate
  */
  public static PgoTaskToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PgoTaskToCreate.class);
  }

 /**
  * Convert an instance of PgoTaskToCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

