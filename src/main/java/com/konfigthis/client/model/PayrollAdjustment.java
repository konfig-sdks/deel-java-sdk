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
import com.konfigthis.client.model.AdjustmentStatusEnum;
import com.konfigthis.client.model.PayrollAdjustmentFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
 * PayrollAdjustment
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayrollAdjustment {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DATE_OF_ADJUSTMENT = "date_of_adjustment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_ADJUSTMENT)
  private LocalDate dateOfAdjustment;

  public static final String SERIALIZED_NAME_CYCLE_REFERENCE = "cycle_reference";
  @SerializedName(SERIALIZED_NAME_CYCLE_REFERENCE)
  private String cycleReference;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdjustmentStatusEnum status;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID = "adjustment_category_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID)
  private String adjustmentCategoryId;

  public static final String SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE = "actual_start_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE)
  private String actualStartCycleDate;

  public static final String SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE = "actual_end_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE)
  private String actualEndCycleDate;

  public static final String SERIALIZED_NAME_MOVE_NEXT_CYCLE = "move_next_cycle";
  @SerializedName(SERIALIZED_NAME_MOVE_NEXT_CYCLE)
  private Boolean moveNextCycle;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private PayrollAdjustmentFile _file;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public PayrollAdjustment() {
  }

  public PayrollAdjustment title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the adjustment
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Your title here", value = "The title of the adjustment")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public PayrollAdjustment description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the adjustment
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Your description here", value = "The description of the adjustment")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PayrollAdjustment id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the adjustment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "The unique identifier of the adjustment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PayrollAdjustment contractId(String contractId) {
    
    
    
    
    this.contractId = contractId;
    return this;
  }

   /**
   * The identifier of the contract associated with the adjustment
   * @return contractId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "m3jk2j", value = "The identifier of the contract associated with the adjustment")

  public String getContractId() {
    return contractId;
  }


  public void setContractId(String contractId) {
    
    
    
    this.contractId = contractId;
  }


  public PayrollAdjustment amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the adjustment
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234.56", value = "The amount of the adjustment")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public PayrollAdjustment dateOfAdjustment(LocalDate dateOfAdjustment) {
    
    
    
    
    this.dateOfAdjustment = dateOfAdjustment;
    return this;
  }

   /**
   * The date of the adjustment
   * @return dateOfAdjustment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the adjustment")

  public LocalDate getDateOfAdjustment() {
    return dateOfAdjustment;
  }


  public void setDateOfAdjustment(LocalDate dateOfAdjustment) {
    
    
    
    this.dateOfAdjustment = dateOfAdjustment;
  }


  public PayrollAdjustment cycleReference(String cycleReference) {
    
    
    
    
    this.cycleReference = cycleReference;
    return this;
  }

   /**
   * The reference to the cycle associated with the adjustment
   * @return cycleReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_cycle_reference", value = "The reference to the cycle associated with the adjustment")

  public String getCycleReference() {
    return cycleReference;
  }


  public void setCycleReference(String cycleReference) {
    
    
    
    this.cycleReference = cycleReference;
  }


  public PayrollAdjustment status(AdjustmentStatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdjustmentStatusEnum getStatus() {
    return status;
  }


  public void setStatus(AdjustmentStatusEnum status) {
    
    
    
    this.status = status;
  }


  public PayrollAdjustment adjustmentCategoryId(String adjustmentCategoryId) {
    
    
    
    
    this.adjustmentCategoryId = adjustmentCategoryId;
    return this;
  }

   /**
   * The identifier of the adjustment category associated with the adjustment
   * @return adjustmentCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c9cf4c2c0165f48f494415390c3b49", value = "The identifier of the adjustment category associated with the adjustment")

  public String getAdjustmentCategoryId() {
    return adjustmentCategoryId;
  }


  public void setAdjustmentCategoryId(String adjustmentCategoryId) {
    
    
    
    this.adjustmentCategoryId = adjustmentCategoryId;
  }


  public PayrollAdjustment actualStartCycleDate(String actualStartCycleDate) {
    
    
    
    
    this.actualStartCycleDate = actualStartCycleDate;
    return this;
  }

   /**
   * The date of the actual start cycle date
   * @return actualStartCycleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-11-01T00:00:00.000Z", value = "The date of the actual start cycle date")

  public String getActualStartCycleDate() {
    return actualStartCycleDate;
  }


  public void setActualStartCycleDate(String actualStartCycleDate) {
    
    
    
    this.actualStartCycleDate = actualStartCycleDate;
  }


  public PayrollAdjustment actualEndCycleDate(String actualEndCycleDate) {
    
    
    
    
    this.actualEndCycleDate = actualEndCycleDate;
    return this;
  }

   /**
   * The date of the actual end cycle date
   * @return actualEndCycleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-11-15T00:00:00.000Z", value = "The date of the actual end cycle date")

  public String getActualEndCycleDate() {
    return actualEndCycleDate;
  }


  public void setActualEndCycleDate(String actualEndCycleDate) {
    
    
    
    this.actualEndCycleDate = actualEndCycleDate;
  }


  public PayrollAdjustment moveNextCycle(Boolean moveNextCycle) {
    
    
    
    
    this.moveNextCycle = moveNextCycle;
    return this;
  }

   /**
   * If an adjustments can belong to another payroll cycle
   * @return moveNextCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If an adjustments can belong to another payroll cycle")

  public Boolean getMoveNextCycle() {
    return moveNextCycle;
  }


  public void setMoveNextCycle(Boolean moveNextCycle) {
    
    
    
    this.moveNextCycle = moveNextCycle;
  }


  public PayrollAdjustment _file(PayrollAdjustmentFile _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayrollAdjustmentFile getFile() {
    return _file;
  }


  public void setFile(PayrollAdjustmentFile _file) {
    
    
    
    this._file = _file;
  }


  public PayrollAdjustment createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the adjustment was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-02T12:00Z", value = "The date and time when the adjustment was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public PayrollAdjustment updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when the adjustment was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-02T12:00Z", value = "The date and time when the adjustment was last updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
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
   * @return the PayrollAdjustment instance itself
   */
  public PayrollAdjustment putAdditionalProperty(String key, Object value) {
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
    PayrollAdjustment payrollAdjustment = (PayrollAdjustment) o;
    return Objects.equals(this.title, payrollAdjustment.title) &&
        Objects.equals(this.description, payrollAdjustment.description) &&
        Objects.equals(this.id, payrollAdjustment.id) &&
        Objects.equals(this.contractId, payrollAdjustment.contractId) &&
        Objects.equals(this.amount, payrollAdjustment.amount) &&
        Objects.equals(this.dateOfAdjustment, payrollAdjustment.dateOfAdjustment) &&
        Objects.equals(this.cycleReference, payrollAdjustment.cycleReference) &&
        Objects.equals(this.status, payrollAdjustment.status) &&
        Objects.equals(this.adjustmentCategoryId, payrollAdjustment.adjustmentCategoryId) &&
        Objects.equals(this.actualStartCycleDate, payrollAdjustment.actualStartCycleDate) &&
        Objects.equals(this.actualEndCycleDate, payrollAdjustment.actualEndCycleDate) &&
        Objects.equals(this.moveNextCycle, payrollAdjustment.moveNextCycle) &&
        Objects.equals(this._file, payrollAdjustment._file) &&
        Objects.equals(this.createdAt, payrollAdjustment.createdAt) &&
        Objects.equals(this.updatedAt, payrollAdjustment.updatedAt)&&
        Objects.equals(this.additionalProperties, payrollAdjustment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, contractId, amount, dateOfAdjustment, cycleReference, status, adjustmentCategoryId, actualStartCycleDate, actualEndCycleDate, moveNextCycle, _file, createdAt, updatedAt, additionalProperties);
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
    sb.append("class PayrollAdjustment {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateOfAdjustment: ").append(toIndentedString(dateOfAdjustment)).append("\n");
    sb.append("    cycleReference: ").append(toIndentedString(cycleReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    adjustmentCategoryId: ").append(toIndentedString(adjustmentCategoryId)).append("\n");
    sb.append("    actualStartCycleDate: ").append(toIndentedString(actualStartCycleDate)).append("\n");
    sb.append("    actualEndCycleDate: ").append(toIndentedString(actualEndCycleDate)).append("\n");
    sb.append("    moveNextCycle: ").append(toIndentedString(moveNextCycle)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("contract_id");
    openapiFields.add("amount");
    openapiFields.add("date_of_adjustment");
    openapiFields.add("cycle_reference");
    openapiFields.add("status");
    openapiFields.add("adjustment_category_id");
    openapiFields.add("actual_start_cycle_date");
    openapiFields.add("actual_end_cycle_date");
    openapiFields.add("move_next_cycle");
    openapiFields.add("file");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayrollAdjustment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayrollAdjustment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollAdjustment is not found in the empty JSON string", PayrollAdjustment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("cycle_reference").isJsonNull() && (jsonObj.get("cycle_reference") != null && !jsonObj.get("cycle_reference").isJsonNull()) && !jsonObj.get("cycle_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_reference").toString()));
      }
      if ((jsonObj.get("adjustment_category_id") != null && !jsonObj.get("adjustment_category_id").isJsonNull()) && !jsonObj.get("adjustment_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_category_id").toString()));
      }
      if ((jsonObj.get("actual_start_cycle_date") != null && !jsonObj.get("actual_start_cycle_date").isJsonNull()) && !jsonObj.get("actual_start_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_start_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_start_cycle_date").toString()));
      }
      if ((jsonObj.get("actual_end_cycle_date") != null && !jsonObj.get("actual_end_cycle_date").isJsonNull()) && !jsonObj.get("actual_end_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_end_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_end_cycle_date").toString()));
      }
      // validate the optional field `file`
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) {
        PayrollAdjustmentFile.validateJsonObject(jsonObj.getAsJsonObject("file"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollAdjustment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollAdjustment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollAdjustment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollAdjustment.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollAdjustment>() {
           @Override
           public void write(JsonWriter out, PayrollAdjustment value) throws IOException {
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
           public PayrollAdjustment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayrollAdjustment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayrollAdjustment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayrollAdjustment
  * @throws IOException if the JSON string is invalid with respect to PayrollAdjustment
  */
  public static PayrollAdjustment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollAdjustment.class);
  }

 /**
  * Convert an instance of PayrollAdjustment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

