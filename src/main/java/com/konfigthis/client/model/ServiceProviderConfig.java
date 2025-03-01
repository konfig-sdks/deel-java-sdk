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
import com.konfigthis.client.model.AuthenticationSchemes;
import com.konfigthis.client.model.BulkSupported;
import com.konfigthis.client.model.FilterSupported;
import com.konfigthis.client.model.Supported;
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
 * ServiceProviderConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ServiceProviderConfig {
  public static final String SERIALIZED_NAME_AUTHENTICATION_SCHEMES = "authenticationSchemes";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_SCHEMES)
  private AuthenticationSchemes authenticationSchemes;

  public static final String SERIALIZED_NAME_BULK = "bulk";
  @SerializedName(SERIALIZED_NAME_BULK)
  private BulkSupported bulk;

  public static final String SERIALIZED_NAME_CHANGE_PASSWORD = "changePassword";
  @SerializedName(SERIALIZED_NAME_CHANGE_PASSWORD)
  private Supported changePassword;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private Supported etag;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private FilterSupported filter;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private Supported patch;

  /**
   * Gets or Sets schemas
   */
  @JsonAdapter(SchemasEnum.Adapter.class)
 public enum SchemasEnum {
    URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_SERVICEPROVIDERCONFIG("urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig");

    private String value;

    SchemasEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SchemasEnum fromValue(String value) {
      for (SchemasEnum b : SchemasEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SchemasEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchemasEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchemasEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SchemasEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<SchemasEnum> schemas = null;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Supported sort;

  public static final String SERIALIZED_NAME_XML_DATA_FORMAT = "xmlDataFormat";
  @SerializedName(SERIALIZED_NAME_XML_DATA_FORMAT)
  private Supported xmlDataFormat;

  public ServiceProviderConfig() {
  }

  public ServiceProviderConfig authenticationSchemes(AuthenticationSchemes authenticationSchemes) {
    
    
    
    
    this.authenticationSchemes = authenticationSchemes;
    return this;
  }

   /**
   * Get authenticationSchemes
   * @return authenticationSchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticationSchemes getAuthenticationSchemes() {
    return authenticationSchemes;
  }


  public void setAuthenticationSchemes(AuthenticationSchemes authenticationSchemes) {
    
    
    
    this.authenticationSchemes = authenticationSchemes;
  }


  public ServiceProviderConfig bulk(BulkSupported bulk) {
    
    
    
    
    this.bulk = bulk;
    return this;
  }

   /**
   * Get bulk
   * @return bulk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BulkSupported getBulk() {
    return bulk;
  }


  public void setBulk(BulkSupported bulk) {
    
    
    
    this.bulk = bulk;
  }


  public ServiceProviderConfig changePassword(Supported changePassword) {
    
    
    
    
    this.changePassword = changePassword;
    return this;
  }

   /**
   * Get changePassword
   * @return changePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Supported getChangePassword() {
    return changePassword;
  }


  public void setChangePassword(Supported changePassword) {
    
    
    
    this.changePassword = changePassword;
  }


  public ServiceProviderConfig etag(Supported etag) {
    
    
    
    
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Supported getEtag() {
    return etag;
  }


  public void setEtag(Supported etag) {
    
    
    
    this.etag = etag;
  }


  public ServiceProviderConfig filter(FilterSupported filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FilterSupported getFilter() {
    return filter;
  }


  public void setFilter(FilterSupported filter) {
    
    
    
    this.filter = filter;
  }


  public ServiceProviderConfig patch(Supported patch) {
    
    
    
    
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Supported getPatch() {
    return patch;
  }


  public void setPatch(Supported patch) {
    
    
    
    this.patch = patch;
  }


  public ServiceProviderConfig schemas(List<SchemasEnum> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ServiceProviderConfig addSchemasItem(SchemasEnum schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SchemasEnum> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<SchemasEnum> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ServiceProviderConfig sort(Supported sort) {
    
    
    
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Supported getSort() {
    return sort;
  }


  public void setSort(Supported sort) {
    
    
    
    this.sort = sort;
  }


  public ServiceProviderConfig xmlDataFormat(Supported xmlDataFormat) {
    
    
    
    
    this.xmlDataFormat = xmlDataFormat;
    return this;
  }

   /**
   * Get xmlDataFormat
   * @return xmlDataFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Supported getXmlDataFormat() {
    return xmlDataFormat;
  }


  public void setXmlDataFormat(Supported xmlDataFormat) {
    
    
    
    this.xmlDataFormat = xmlDataFormat;
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
   * @return the ServiceProviderConfig instance itself
   */
  public ServiceProviderConfig putAdditionalProperty(String key, Object value) {
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
    ServiceProviderConfig serviceProviderConfig = (ServiceProviderConfig) o;
    return Objects.equals(this.authenticationSchemes, serviceProviderConfig.authenticationSchemes) &&
        Objects.equals(this.bulk, serviceProviderConfig.bulk) &&
        Objects.equals(this.changePassword, serviceProviderConfig.changePassword) &&
        Objects.equals(this.etag, serviceProviderConfig.etag) &&
        Objects.equals(this.filter, serviceProviderConfig.filter) &&
        Objects.equals(this.patch, serviceProviderConfig.patch) &&
        Objects.equals(this.schemas, serviceProviderConfig.schemas) &&
        Objects.equals(this.sort, serviceProviderConfig.sort) &&
        Objects.equals(this.xmlDataFormat, serviceProviderConfig.xmlDataFormat)&&
        Objects.equals(this.additionalProperties, serviceProviderConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationSchemes, bulk, changePassword, etag, filter, patch, schemas, sort, xmlDataFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProviderConfig {\n");
    sb.append("    authenticationSchemes: ").append(toIndentedString(authenticationSchemes)).append("\n");
    sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    xmlDataFormat: ").append(toIndentedString(xmlDataFormat)).append("\n");
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
    openapiFields.add("bulk");
    openapiFields.add("changePassword");
    openapiFields.add("etag");
    openapiFields.add("filter");
    openapiFields.add("patch");
    openapiFields.add("schemas");
    openapiFields.add("sort");
    openapiFields.add("xmlDataFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProviderConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProviderConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProviderConfig is not found in the empty JSON string", ServiceProviderConfig.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `authenticationSchemes`
      if (jsonObj.get("authenticationSchemes") != null && !jsonObj.get("authenticationSchemes").isJsonNull()) {
        AuthenticationSchemes.validateJsonObject(jsonObj.getAsJsonObject("authenticationSchemes"));
      }
      // validate the optional field `bulk`
      if (jsonObj.get("bulk") != null && !jsonObj.get("bulk").isJsonNull()) {
        BulkSupported.validateJsonObject(jsonObj.getAsJsonObject("bulk"));
      }
      // validate the optional field `changePassword`
      if (jsonObj.get("changePassword") != null && !jsonObj.get("changePassword").isJsonNull()) {
        Supported.validateJsonObject(jsonObj.getAsJsonObject("changePassword"));
      }
      // validate the optional field `etag`
      if (jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) {
        Supported.validateJsonObject(jsonObj.getAsJsonObject("etag"));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        FilterSupported.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      }
      // validate the optional field `patch`
      if (jsonObj.get("patch") != null && !jsonObj.get("patch").isJsonNull()) {
        Supported.validateJsonObject(jsonObj.getAsJsonObject("patch"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        Supported.validateJsonObject(jsonObj.getAsJsonObject("sort"));
      }
      // validate the optional field `xmlDataFormat`
      if (jsonObj.get("xmlDataFormat") != null && !jsonObj.get("xmlDataFormat").isJsonNull()) {
        Supported.validateJsonObject(jsonObj.getAsJsonObject("xmlDataFormat"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProviderConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProviderConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProviderConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProviderConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProviderConfig>() {
           @Override
           public void write(JsonWriter out, ServiceProviderConfig value) throws IOException {
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
           public ServiceProviderConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProviderConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceProviderConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProviderConfig
  * @throws IOException if the JSON string is invalid with respect to ServiceProviderConfig
  */
  public static ServiceProviderConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProviderConfig.class);
  }

 /**
  * Convert an instance of ServiceProviderConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

