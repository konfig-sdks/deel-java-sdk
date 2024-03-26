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
import com.konfigthis.client.model.ClientOfBasicContract;
import com.konfigthis.client.model.ContractStatusEnum;
import com.konfigthis.client.model.ContractTypeEnum;
import com.konfigthis.client.model.ContractWhoReportsEnum;
import com.konfigthis.client.model.InvitationsOfBasicContract;
import com.konfigthis.client.model.SignaturesOfBasicContract;
import com.konfigthis.client.model.WorkerOfBasicContract;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * BasicContract
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BasicContract {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ContractTypeEnum type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ContractStatusEnum status;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private ClientOfBasicContract client;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  private WorkerOfBasicContract worker;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  private InvitationsOfBasicContract invitations;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private SignaturesOfBasicContract signatures;

  public static final String SERIALIZED_NAME_IS_SHIELDED = "is_shielded";
  @SerializedName(SERIALIZED_NAME_IS_SHIELDED)
  private Boolean isShielded;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private OffsetDateTime terminationDate;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  private Double noticePeriod = 0d;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private String scale;

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  private ContractWhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public BasicContract() {
  }

  public BasicContract title(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    this.title = title;
  }


  public BasicContract id(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    this.id = id;
  }


  public BasicContract type(ContractTypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContractTypeEnum getType() {
    return type;
  }


  public void setType(ContractTypeEnum type) {
    
    
    
    this.type = type;
  }


  public BasicContract status(ContractStatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContractStatusEnum getStatus() {
    return status;
  }


  public void setStatus(ContractStatusEnum status) {
    
    
    
    this.status = status;
  }


  public BasicContract client(ClientOfBasicContract client) {
    
    
    
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClientOfBasicContract getClient() {
    return client;
  }


  public void setClient(ClientOfBasicContract client) {
    
    
    
    this.client = client;
  }


  public BasicContract worker(WorkerOfBasicContract worker) {
    
    
    
    
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public WorkerOfBasicContract getWorker() {
    return worker;
  }


  public void setWorker(WorkerOfBasicContract worker) {
    
    
    
    this.worker = worker;
  }


  public BasicContract invitations(InvitationsOfBasicContract invitations) {
    
    
    
    
    this.invitations = invitations;
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InvitationsOfBasicContract getInvitations() {
    return invitations;
  }


  public void setInvitations(InvitationsOfBasicContract invitations) {
    
    
    
    this.invitations = invitations;
  }


  public BasicContract signatures(SignaturesOfBasicContract signatures) {
    
    
    
    
    this.signatures = signatures;
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SignaturesOfBasicContract getSignatures() {
    return signatures;
  }


  public void setSignatures(SignaturesOfBasicContract signatures) {
    
    
    
    this.signatures = signatures;
  }


  public BasicContract isShielded(Boolean isShielded) {
    
    
    
    
    this.isShielded = isShielded;
    return this;
  }

   /**
   * Get isShielded
   * @return isShielded
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsShielded() {
    return isShielded;
  }


  public void setIsShielded(Boolean isShielded) {
    
    
    
    this.isShielded = isShielded;
  }


  public BasicContract isArchived(Boolean isArchived) {
    
    
    
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Get isArchived
   * @return isArchived
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsArchived() {
    return isArchived;
  }


  public void setIsArchived(Boolean isArchived) {
    
    
    
    this.isArchived = isArchived;
  }


  public BasicContract createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Long date-time format following ISO-8601
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-05-24T09:38:46.235Z", required = true, value = "Long date-time format following ISO-8601")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public BasicContract terminationDate(OffsetDateTime terminationDate) {
    
    
    
    
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Long date-time format following ISO-8601
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-05-24T09:38:46.235Z", required = true, value = "Long date-time format following ISO-8601")

  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }


  public void setTerminationDate(OffsetDateTime terminationDate) {
    
    
    
    this.terminationDate = terminationDate;
  }


  public BasicContract noticePeriod(Double noticePeriod) {
    if (noticePeriod != null && noticePeriod < 0) {
      throw new IllegalArgumentException("Invalid value for noticePeriod. Must be greater than or equal to 0.");
    }
    
    
    
    this.noticePeriod = noticePeriod;
    return this;
  }

  public BasicContract noticePeriod(Integer noticePeriod) {
    if (noticePeriod != null && noticePeriod < 0) {
      throw new IllegalArgumentException("Invalid value for noticePeriod. Must be greater than or equal to 0.");
    }
    
    
    
    this.noticePeriod = noticePeriod.doubleValue();
    return this;
  }

   /**
   * Days before to notice the termination of contract for eather party.
   * minimum: 0
   * @return noticePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "Days before to notice the termination of contract for eather party.")

  public Double getNoticePeriod() {
    return noticePeriod;
  }


  public void setNoticePeriod(Double noticePeriod) {
    if (noticePeriod != null && noticePeriod < 0) {
      throw new IllegalArgumentException("Invalid value for noticePeriod. Must be greater than or equal to 0.");
    }
    
    
    this.noticePeriod = noticePeriod;
  }


  public BasicContract scale(String scale) {
    
    
    
    
    this.scale = scale;
    return this;
  }

   /**
   * The payment scale (e.g., hourly, weekly, monthly, etc.)
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment scale (e.g., hourly, weekly, monthly, etc.)")

  public String getScale() {
    return scale;
  }


  public void setScale(String scale) {
    
    
    
    this.scale = scale;
  }


  public BasicContract whoReports(ContractWhoReportsEnum whoReports) {
    
    
    
    
    this.whoReports = whoReports;
    return this;
  }

   /**
   * Get whoReports
   * @return whoReports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractWhoReportsEnum getWhoReports() {
    return whoReports;
  }


  public void setWhoReports(ContractWhoReportsEnum whoReports) {
    
    
    
    this.whoReports = whoReports;
  }


  public BasicContract externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique identifier for the object provided by an external system.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the object provided by an external system.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
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
   * @return the BasicContract instance itself
   */
  public BasicContract putAdditionalProperty(String key, Object value) {
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
    BasicContract basicContract = (BasicContract) o;
    return Objects.equals(this.title, basicContract.title) &&
        Objects.equals(this.id, basicContract.id) &&
        Objects.equals(this.type, basicContract.type) &&
        Objects.equals(this.status, basicContract.status) &&
        Objects.equals(this.client, basicContract.client) &&
        Objects.equals(this.worker, basicContract.worker) &&
        Objects.equals(this.invitations, basicContract.invitations) &&
        Objects.equals(this.signatures, basicContract.signatures) &&
        Objects.equals(this.isShielded, basicContract.isShielded) &&
        Objects.equals(this.isArchived, basicContract.isArchived) &&
        Objects.equals(this.createdAt, basicContract.createdAt) &&
        Objects.equals(this.terminationDate, basicContract.terminationDate) &&
        Objects.equals(this.noticePeriod, basicContract.noticePeriod) &&
        Objects.equals(this.scale, basicContract.scale) &&
        Objects.equals(this.whoReports, basicContract.whoReports) &&
        Objects.equals(this.externalId, basicContract.externalId)&&
        Objects.equals(this.additionalProperties, basicContract.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, type, status, client, worker, invitations, signatures, isShielded, isArchived, createdAt, terminationDate, noticePeriod, scale, whoReports, externalId, additionalProperties);
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
    sb.append("class BasicContract {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    isShielded: ").append(toIndentedString(isShielded)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("client");
    openapiFields.add("worker");
    openapiFields.add("invitations");
    openapiFields.add("signatures");
    openapiFields.add("is_shielded");
    openapiFields.add("is_archived");
    openapiFields.add("created_at");
    openapiFields.add("termination_date");
    openapiFields.add("notice_period");
    openapiFields.add("scale");
    openapiFields.add("who_reports");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("worker");
    openapiRequiredFields.add("invitations");
    openapiRequiredFields.add("signatures");
    openapiRequiredFields.add("is_shielded");
    openapiRequiredFields.add("is_archived");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("termination_date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BasicContract
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BasicContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasicContract is not found in the empty JSON string", BasicContract.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BasicContract.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `client`
      ClientOfBasicContract.validateJsonObject(jsonObj.getAsJsonObject("client"));
      // validate the required field `worker`
      WorkerOfBasicContract.validateJsonObject(jsonObj.getAsJsonObject("worker"));
      // validate the required field `invitations`
      InvitationsOfBasicContract.validateJsonObject(jsonObj.getAsJsonObject("invitations"));
      // validate the required field `signatures`
      SignaturesOfBasicContract.validateJsonObject(jsonObj.getAsJsonObject("signatures"));
      if (!jsonObj.get("scale").isJsonNull() && (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if (!jsonObj.get("external_id").isJsonNull() && (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasicContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasicContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasicContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasicContract.class));

       return (TypeAdapter<T>) new TypeAdapter<BasicContract>() {
           @Override
           public void write(JsonWriter out, BasicContract value) throws IOException {
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
           public BasicContract read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BasicContract instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BasicContract given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BasicContract
  * @throws IOException if the JSON string is invalid with respect to BasicContract
  */
  public static BasicContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasicContract.class);
  }

 /**
  * Convert an instance of BasicContract to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

