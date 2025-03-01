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
 * Some countries require additional employee information for employment contracts.
 */
@ApiModel(description = "Some countries require additional employee information for employment contracts.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EorContractToCreateQuoteAdditionalFields {
  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  /**
   * Type of worker.
   */
  @JsonAdapter(WorkerTypeEnum.Adapter.class)
 public enum WorkerTypeEnum {
    SKILLED("Skilled"),
    
    UNSKILLED("Unskilled");

    private String value;

    WorkerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkerTypeEnum fromValue(String value) {
      for (WorkerTypeEnum b : WorkerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkerTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKER_TYPE = "worker_type";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPE)
  private WorkerTypeEnum workerType;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public EorContractToCreateQuoteAdditionalFields() {
  }

  public EorContractToCreateQuoteAdditionalFields gender(String gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Employee&#39;s gender.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee's gender.")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    
    
    
    this.gender = gender;
  }


  public EorContractToCreateQuoteAdditionalFields workerType(WorkerTypeEnum workerType) {
    
    
    
    
    this.workerType = workerType;
    return this;
  }

   /**
   * Type of worker.
   * @return workerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of worker.")

  public WorkerTypeEnum getWorkerType() {
    return workerType;
  }


  public void setWorkerType(WorkerTypeEnum workerType) {
    
    
    
    this.workerType = workerType;
  }


  public EorContractToCreateQuoteAdditionalFields dob(String dob) {
    
    
    
    
    this.dob = dob;
    return this;
  }

   /**
   * Employee&#39;s date of birth.
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee's date of birth.")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    
    
    
    this.dob = dob;
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
   * @return the EorContractToCreateQuoteAdditionalFields instance itself
   */
  public EorContractToCreateQuoteAdditionalFields putAdditionalProperty(String key, Object value) {
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
    EorContractToCreateQuoteAdditionalFields eorContractToCreateQuoteAdditionalFields = (EorContractToCreateQuoteAdditionalFields) o;
    return Objects.equals(this.gender, eorContractToCreateQuoteAdditionalFields.gender) &&
        Objects.equals(this.workerType, eorContractToCreateQuoteAdditionalFields.workerType) &&
        Objects.equals(this.dob, eorContractToCreateQuoteAdditionalFields.dob)&&
        Objects.equals(this.additionalProperties, eorContractToCreateQuoteAdditionalFields.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, workerType, dob, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorContractToCreateQuoteAdditionalFields {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("worker_type");
    openapiFields.add("dob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EorContractToCreateQuoteAdditionalFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EorContractToCreateQuoteAdditionalFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractToCreateQuoteAdditionalFields is not found in the empty JSON string", EorContractToCreateQuoteAdditionalFields.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("worker_type") != null && !jsonObj.get("worker_type").isJsonNull()) && !jsonObj.get("worker_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_type").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractToCreateQuoteAdditionalFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractToCreateQuoteAdditionalFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractToCreateQuoteAdditionalFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractToCreateQuoteAdditionalFields.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractToCreateQuoteAdditionalFields>() {
           @Override
           public void write(JsonWriter out, EorContractToCreateQuoteAdditionalFields value) throws IOException {
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
           public EorContractToCreateQuoteAdditionalFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EorContractToCreateQuoteAdditionalFields instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EorContractToCreateQuoteAdditionalFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EorContractToCreateQuoteAdditionalFields
  * @throws IOException if the JSON string is invalid with respect to EorContractToCreateQuoteAdditionalFields
  */
  public static EorContractToCreateQuoteAdditionalFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractToCreateQuoteAdditionalFields.class);
  }

 /**
  * Convert an instance of EorContractToCreateQuoteAdditionalFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

