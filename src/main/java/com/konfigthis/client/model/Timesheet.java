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
import com.konfigthis.client.model.BasicTimesheetContract;
import com.konfigthis.client.model.BasicTimesheetPaymentCycle;
import com.konfigthis.client.model.BasicTimesheetReportedBy;
import com.konfigthis.client.model.BasicTimesheetReviewedBy;
import com.konfigthis.client.model.BasicTimesheetWorksheet;
import com.konfigthis.client.model.FileAttachmentInfo;
import com.konfigthis.client.model.TimesheetApprover;
import com.konfigthis.client.model.TimesheetStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Timesheet
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Timesheet {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TimesheetStatusEnum status;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  private OffsetDateTime dateSubmitted;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private String scale;

  public static final String SERIALIZED_NAME_CUSTOM_SCALE = "custom_scale";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SCALE)
  private String customScale;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private FileAttachmentInfo attachment;

  public static final String SERIALIZED_NAME_WORKSHEET = "worksheet";
  @SerializedName(SERIALIZED_NAME_WORKSHEET)
  private BasicTimesheetWorksheet worksheet;

  public static final String SERIALIZED_NAME_REVIEWED_BY = "reviewed_by";
  @SerializedName(SERIALIZED_NAME_REVIEWED_BY)
  private BasicTimesheetReviewedBy reviewedBy;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private BasicTimesheetContract contract;

  public static final String SERIALIZED_NAME_PAYMENT_CYCLE = "payment_cycle";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CYCLE)
  private BasicTimesheetPaymentCycle paymentCycle;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reported_by";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  private BasicTimesheetReportedBy reportedBy;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  private List<TimesheetApprover> approvers = new ArrayList<>();

  public Timesheet() {
  }

  public Timesheet description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Timesheet id(String id) {
    
    
    
    
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


  public Timesheet type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Deprecated - it is always \&quot;work\&quot;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Deprecated - it is always \"work\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public Timesheet status(TimesheetStatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TimesheetStatusEnum getStatus() {
    return status;
  }


  public void setStatus(TimesheetStatusEnum status) {
    
    
    
    this.status = status;
  }


  public Timesheet dateSubmitted(OffsetDateTime dateSubmitted) {
    
    
    
    
    this.dateSubmitted = dateSubmitted;
    return this;
  }

   /**
   * Long date-time format following ISO-8601
   * @return dateSubmitted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-05-24T09:38:46.235Z", required = true, value = "Long date-time format following ISO-8601")

  public OffsetDateTime getDateSubmitted() {
    return dateSubmitted;
  }


  public void setDateSubmitted(OffsetDateTime dateSubmitted) {
    
    
    
    this.dateSubmitted = dateSubmitted;
  }


  public Timesheet currencyCode(String currencyCode) {
    
    
    if (currencyCode != null && currencyCode.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currencyCode. Length must be greater than or equal to 3.");
    }
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GBP", required = true, value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    if (currencyCode != null && currencyCode.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currencyCode. Length must be greater than or equal to 3.");
    }
    this.currencyCode = currencyCode;
  }


  public Timesheet totalAmount(String totalAmount) {
    
    
    
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * is equal to quantity times rate of active work statement + bonus in this record
   * @return totalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200.0000", required = true, value = "is equal to quantity times rate of active work statement + bonus in this record")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    
    
    
    this.totalAmount = totalAmount;
  }


  public Timesheet quantity(Double quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

  public Timesheet quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity.doubleValue();
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    
    
    
    this.quantity = quantity;
  }


  public Timesheet createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-05-04T03:45:27.108Z", required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Timesheet scale(String scale) {
    
    
    
    
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "custom", value = "")

  public String getScale() {
    return scale;
  }


  public void setScale(String scale) {
    
    
    
    this.scale = scale;
  }


  public Timesheet customScale(String customScale) {
    
    
    
    
    this.customScale = customScale;
    return this;
  }

   /**
   * Get customScale
   * @return customScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomScale() {
    return customScale;
  }


  public void setCustomScale(String customScale) {
    
    
    
    this.customScale = customScale;
  }


  public Timesheet attachment(FileAttachmentInfo attachment) {
    
    
    
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public FileAttachmentInfo getAttachment() {
    return attachment;
  }


  public void setAttachment(FileAttachmentInfo attachment) {
    
    
    
    this.attachment = attachment;
  }


  public Timesheet worksheet(BasicTimesheetWorksheet worksheet) {
    
    
    
    
    this.worksheet = worksheet;
    return this;
  }

   /**
   * Get worksheet
   * @return worksheet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BasicTimesheetWorksheet getWorksheet() {
    return worksheet;
  }


  public void setWorksheet(BasicTimesheetWorksheet worksheet) {
    
    
    
    this.worksheet = worksheet;
  }


  public Timesheet reviewedBy(BasicTimesheetReviewedBy reviewedBy) {
    
    
    
    
    this.reviewedBy = reviewedBy;
    return this;
  }

   /**
   * Get reviewedBy
   * @return reviewedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BasicTimesheetReviewedBy getReviewedBy() {
    return reviewedBy;
  }


  public void setReviewedBy(BasicTimesheetReviewedBy reviewedBy) {
    
    
    
    this.reviewedBy = reviewedBy;
  }


  public Timesheet contract(BasicTimesheetContract contract) {
    
    
    
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BasicTimesheetContract getContract() {
    return contract;
  }


  public void setContract(BasicTimesheetContract contract) {
    
    
    
    this.contract = contract;
  }


  public Timesheet paymentCycle(BasicTimesheetPaymentCycle paymentCycle) {
    
    
    
    
    this.paymentCycle = paymentCycle;
    return this;
  }

   /**
   * Get paymentCycle
   * @return paymentCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BasicTimesheetPaymentCycle getPaymentCycle() {
    return paymentCycle;
  }


  public void setPaymentCycle(BasicTimesheetPaymentCycle paymentCycle) {
    
    
    
    this.paymentCycle = paymentCycle;
  }


  public Timesheet reportedBy(BasicTimesheetReportedBy reportedBy) {
    
    
    
    
    this.reportedBy = reportedBy;
    return this;
  }

   /**
   * Get reportedBy
   * @return reportedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BasicTimesheetReportedBy getReportedBy() {
    return reportedBy;
  }


  public void setReportedBy(BasicTimesheetReportedBy reportedBy) {
    
    
    
    this.reportedBy = reportedBy;
  }


  public Timesheet approvers(List<TimesheetApprover> approvers) {
    
    
    
    
    this.approvers = approvers;
    return this;
  }

  public Timesheet addApproversItem(TimesheetApprover approversItem) {
    this.approvers.add(approversItem);
    return this;
  }

   /**
   * Get approvers
   * @return approvers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TimesheetApprover> getApprovers() {
    return approvers;
  }


  public void setApprovers(List<TimesheetApprover> approvers) {
    
    
    
    this.approvers = approvers;
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
   * @return the Timesheet instance itself
   */
  public Timesheet putAdditionalProperty(String key, Object value) {
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
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.description, timesheet.description) &&
        Objects.equals(this.id, timesheet.id) &&
        Objects.equals(this.type, timesheet.type) &&
        Objects.equals(this.status, timesheet.status) &&
        Objects.equals(this.dateSubmitted, timesheet.dateSubmitted) &&
        Objects.equals(this.currencyCode, timesheet.currencyCode) &&
        Objects.equals(this.totalAmount, timesheet.totalAmount) &&
        Objects.equals(this.quantity, timesheet.quantity) &&
        Objects.equals(this.createdAt, timesheet.createdAt) &&
        Objects.equals(this.scale, timesheet.scale) &&
        Objects.equals(this.customScale, timesheet.customScale) &&
        Objects.equals(this.attachment, timesheet.attachment) &&
        Objects.equals(this.worksheet, timesheet.worksheet) &&
        Objects.equals(this.reviewedBy, timesheet.reviewedBy) &&
        Objects.equals(this.contract, timesheet.contract) &&
        Objects.equals(this.paymentCycle, timesheet.paymentCycle) &&
        Objects.equals(this.reportedBy, timesheet.reportedBy) &&
        Objects.equals(this.approvers, timesheet.approvers)&&
        Objects.equals(this.additionalProperties, timesheet.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, type, status, dateSubmitted, currencyCode, totalAmount, quantity, createdAt, scale, customScale, attachment, worksheet, reviewedBy, contract, paymentCycle, reportedBy, approvers, additionalProperties);
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
    sb.append("class Timesheet {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    customScale: ").append(toIndentedString(customScale)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    worksheet: ").append(toIndentedString(worksheet)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("date_submitted");
    openapiFields.add("currency_code");
    openapiFields.add("total_amount");
    openapiFields.add("quantity");
    openapiFields.add("created_at");
    openapiFields.add("scale");
    openapiFields.add("custom_scale");
    openapiFields.add("attachment");
    openapiFields.add("worksheet");
    openapiFields.add("reviewed_by");
    openapiFields.add("contract");
    openapiFields.add("payment_cycle");
    openapiFields.add("reported_by");
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("date_submitted");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("total_amount");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("attachment");
    openapiRequiredFields.add("worksheet");
    openapiRequiredFields.add("reviewed_by");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("reported_by");
    openapiRequiredFields.add("approvers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timesheet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Timesheet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timesheet is not found in the empty JSON string", Timesheet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Timesheet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if (!jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("scale").isJsonNull() && (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if (!jsonObj.get("custom_scale").isJsonNull() && (jsonObj.get("custom_scale") != null && !jsonObj.get("custom_scale").isJsonNull()) && !jsonObj.get("custom_scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_scale").toString()));
      }
      // validate the required field `attachment`
      FileAttachmentInfo.validateJsonObject(jsonObj.getAsJsonObject("attachment"));
      // validate the required field `worksheet`
      BasicTimesheetWorksheet.validateJsonObject(jsonObj.getAsJsonObject("worksheet"));
      // validate the required field `reviewed_by`
      BasicTimesheetReviewedBy.validateJsonObject(jsonObj.getAsJsonObject("reviewed_by"));
      // validate the required field `contract`
      BasicTimesheetContract.validateJsonObject(jsonObj.getAsJsonObject("contract"));
      // validate the optional field `payment_cycle`
      if (jsonObj.get("payment_cycle") != null && !jsonObj.get("payment_cycle").isJsonNull()) {
        BasicTimesheetPaymentCycle.validateJsonObject(jsonObj.getAsJsonObject("payment_cycle"));
      }
      // validate the required field `reported_by`
      BasicTimesheetReportedBy.validateJsonObject(jsonObj.getAsJsonObject("reported_by"));
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        TimesheetApprover.validateJsonObject(jsonArrayapprovers.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timesheet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timesheet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timesheet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timesheet.class));

       return (TypeAdapter<T>) new TypeAdapter<Timesheet>() {
           @Override
           public void write(JsonWriter out, Timesheet value) throws IOException {
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
           public Timesheet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Timesheet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Timesheet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timesheet
  * @throws IOException if the JSON string is invalid with respect to Timesheet
  */
  public static Timesheet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timesheet.class);
  }

 /**
  * Convert an instance of Timesheet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

