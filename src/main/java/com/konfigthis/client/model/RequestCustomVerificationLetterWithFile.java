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
import com.konfigthis.client.model.FileObject;
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
 * RequestCustomVerificationLetterWithFile
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RequestCustomVerificationLetterWithFile {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INCLUDE_Q_R_CODE = "includeQRCode";
  @SerializedName(SERIALIZED_NAME_INCLUDE_Q_R_CODE)
  private Boolean includeQRCode;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    VISA_APPLICATION_FOR_PERSONAL_TRIP("VISA_APPLICATION_FOR_PERSONAL_TRIP"),
    
    VISA_APPLICATION_FOR_BUSINESS_TRIP("VISA_APPLICATION_FOR_BUSINESS_TRIP"),
    
    VISA_RENEWAL_CERTIFICATE("VISA_RENEWAL_CERTIFICATE"),
    
    NO_OBJECTION_CERTIFICATE_FOR_TRAVELLING("NO_OBJECTION_CERTIFICATE_FOR_TRAVELLING"),
    
    BANK_VERIFICATION_OR_SALARY_CERTIFICATE("BANK_VERIFICATION_OR_SALARY_CERTIFICATE"),
    
    CUSTOMISED("CUSTOMISED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<FileObject> files = new ArrayList<>();

  public RequestCustomVerificationLetterWithFile() {
  }

  public RequestCustomVerificationLetterWithFile description(String description) {
    
    
    if (description != null && description.length() < 25) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 25.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * Description of the letter (minimum 25 characters)
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Description of the letter (minimum 25 characters)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 25) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 25.");
    }
    this.description = description;
  }


  public RequestCustomVerificationLetterWithFile includeQRCode(Boolean includeQRCode) {
    
    
    
    
    this.includeQRCode = includeQRCode;
    return this;
  }

   /**
   * Flag indicating whether to include a QR code
   * @return includeQRCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether to include a QR code")

  public Boolean getIncludeQRCode() {
    return includeQRCode;
  }


  public void setIncludeQRCode(Boolean includeQRCode) {
    
    
    
    this.includeQRCode = includeQRCode;
  }


  public RequestCustomVerificationLetterWithFile type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public RequestCustomVerificationLetterWithFile files(List<FileObject> files) {
    
    
    
    
    this.files = files;
    return this;
  }

  public RequestCustomVerificationLetterWithFile addFilesItem(FileObject filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FileObject> getFiles() {
    return files;
  }


  public void setFiles(List<FileObject> files) {
    
    
    
    this.files = files;
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
   * @return the RequestCustomVerificationLetterWithFile instance itself
   */
  public RequestCustomVerificationLetterWithFile putAdditionalProperty(String key, Object value) {
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
    RequestCustomVerificationLetterWithFile requestCustomVerificationLetterWithFile = (RequestCustomVerificationLetterWithFile) o;
    return Objects.equals(this.description, requestCustomVerificationLetterWithFile.description) &&
        Objects.equals(this.includeQRCode, requestCustomVerificationLetterWithFile.includeQRCode) &&
        Objects.equals(this.type, requestCustomVerificationLetterWithFile.type) &&
        Objects.equals(this.files, requestCustomVerificationLetterWithFile.files)&&
        Objects.equals(this.additionalProperties, requestCustomVerificationLetterWithFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, includeQRCode, type, files, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCustomVerificationLetterWithFile {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includeQRCode: ").append(toIndentedString(includeQRCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("includeQRCode");
    openapiFields.add("type");
    openapiFields.add("files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("files");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestCustomVerificationLetterWithFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestCustomVerificationLetterWithFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestCustomVerificationLetterWithFile is not found in the empty JSON string", RequestCustomVerificationLetterWithFile.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestCustomVerificationLetterWithFile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        FileObject.validateJsonObject(jsonArrayfiles.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestCustomVerificationLetterWithFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestCustomVerificationLetterWithFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestCustomVerificationLetterWithFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestCustomVerificationLetterWithFile.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestCustomVerificationLetterWithFile>() {
           @Override
           public void write(JsonWriter out, RequestCustomVerificationLetterWithFile value) throws IOException {
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
           public RequestCustomVerificationLetterWithFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RequestCustomVerificationLetterWithFile instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RequestCustomVerificationLetterWithFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestCustomVerificationLetterWithFile
  * @throws IOException if the JSON string is invalid with respect to RequestCustomVerificationLetterWithFile
  */
  public static RequestCustomVerificationLetterWithFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestCustomVerificationLetterWithFile.class);
  }

 /**
  * Convert an instance of RequestCustomVerificationLetterWithFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

