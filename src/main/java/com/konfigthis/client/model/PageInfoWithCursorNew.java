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
 * PageInfoWithCursorNew
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageInfoWithCursorNew {
  public static final String SERIALIZED_NAME_TOTAL_ROWS = "total_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  private Double totalRows;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "items_per_page";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Double itemsPerPage;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Double offset;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public PageInfoWithCursorNew() {
  }

  public PageInfoWithCursorNew totalRows(Double totalRows) {
    
    
    
    
    this.totalRows = totalRows;
    return this;
  }

  public PageInfoWithCursorNew totalRows(Integer totalRows) {
    
    
    
    
    this.totalRows = totalRows.doubleValue();
    return this;
  }

   /**
   * Get totalRows
   * @return totalRows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getTotalRows() {
    return totalRows;
  }


  public void setTotalRows(Double totalRows) {
    
    
    
    this.totalRows = totalRows;
  }


  public PageInfoWithCursorNew itemsPerPage(Double itemsPerPage) {
    if (itemsPerPage != null && itemsPerPage < 1) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be greater than or equal to 1.");
    }
    if (itemsPerPage != null && itemsPerPage > 99) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be less than or equal to 99.");
    }
    
    
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public PageInfoWithCursorNew itemsPerPage(Integer itemsPerPage) {
    if (itemsPerPage != null && itemsPerPage < 1) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be greater than or equal to 1.");
    }
    if (itemsPerPage != null && itemsPerPage > 99) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be less than or equal to 99.");
    }
    
    
    this.itemsPerPage = itemsPerPage.doubleValue();
    return this;
  }

   /**
   * Get itemsPerPage
   * minimum: 1
   * maximum: 99
   * @return itemsPerPage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getItemsPerPage() {
    return itemsPerPage;
  }


  public void setItemsPerPage(Double itemsPerPage) {
    if (itemsPerPage != null && itemsPerPage < 1) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be greater than or equal to 1.");
    }
    if (itemsPerPage != null && itemsPerPage > 99) {
      throw new IllegalArgumentException("Invalid value for itemsPerPage. Must be less than or equal to 99.");
    }
    
    this.itemsPerPage = itemsPerPage;
  }


  public PageInfoWithCursorNew offset(Double offset) {
    if (offset != null && offset < 0) {
      throw new IllegalArgumentException("Invalid value for offset. Must be greater than or equal to 0.");
    }
    if (offset != null && offset > 999999999) {
      throw new IllegalArgumentException("Invalid value for offset. Must be less than or equal to 999999999.");
    }
    
    
    this.offset = offset;
    return this;
  }

  public PageInfoWithCursorNew offset(Integer offset) {
    if (offset != null && offset < 0) {
      throw new IllegalArgumentException("Invalid value for offset. Must be greater than or equal to 0.");
    }
    if (offset != null && offset > 999999999) {
      throw new IllegalArgumentException("Invalid value for offset. Must be less than or equal to 999999999.");
    }
    
    
    this.offset = offset.doubleValue();
    return this;
  }

   /**
   * Get offset
   * minimum: 0
   * maximum: 999999999
   * @return offset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getOffset() {
    return offset;
  }


  public void setOffset(Double offset) {
    if (offset != null && offset < 0) {
      throw new IllegalArgumentException("Invalid value for offset. Must be greater than or equal to 0.");
    }
    if (offset != null && offset > 999999999) {
      throw new IllegalArgumentException("Invalid value for offset. Must be less than or equal to 999999999.");
    }
    
    this.offset = offset;
  }


  public PageInfoWithCursorNew cursor(String cursor) {
    
    
    
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Use for pagination to get next set of records after the given cursor.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJvZmZzZXQiOjEwMCwibGltaXQiOjEwMCwiZmlsdGVyVHlwZSI6ImFsbCJ9", value = "Use for pagination to get next set of records after the given cursor.")

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    
    
    
    this.cursor = cursor;
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
   * @return the PageInfoWithCursorNew instance itself
   */
  public PageInfoWithCursorNew putAdditionalProperty(String key, Object value) {
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
    PageInfoWithCursorNew pageInfoWithCursorNew = (PageInfoWithCursorNew) o;
    return Objects.equals(this.totalRows, pageInfoWithCursorNew.totalRows) &&
        Objects.equals(this.itemsPerPage, pageInfoWithCursorNew.itemsPerPage) &&
        Objects.equals(this.offset, pageInfoWithCursorNew.offset) &&
        Objects.equals(this.cursor, pageInfoWithCursorNew.cursor)&&
        Objects.equals(this.additionalProperties, pageInfoWithCursorNew.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, itemsPerPage, offset, cursor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfoWithCursorNew {\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("total_rows");
    openapiFields.add("items_per_page");
    openapiFields.add("offset");
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_rows");
    openapiRequiredFields.add("items_per_page");
    openapiRequiredFields.add("offset");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageInfoWithCursorNew
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageInfoWithCursorNew.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageInfoWithCursorNew is not found in the empty JSON string", PageInfoWithCursorNew.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageInfoWithCursorNew.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageInfoWithCursorNew.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageInfoWithCursorNew' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageInfoWithCursorNew> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageInfoWithCursorNew.class));

       return (TypeAdapter<T>) new TypeAdapter<PageInfoWithCursorNew>() {
           @Override
           public void write(JsonWriter out, PageInfoWithCursorNew value) throws IOException {
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
           public PageInfoWithCursorNew read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageInfoWithCursorNew instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageInfoWithCursorNew given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageInfoWithCursorNew
  * @throws IOException if the JSON string is invalid with respect to PageInfoWithCursorNew
  */
  public static PageInfoWithCursorNew fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageInfoWithCursorNew.class);
  }

 /**
  * Convert an instance of PageInfoWithCursorNew to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

