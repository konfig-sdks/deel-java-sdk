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
import com.konfigthis.client.model.CompensationDetailsOfContractToCreateShared;
import com.konfigthis.client.model.ContractToCreateSharedClient;
import com.konfigthis.client.model.ContractToCreateSharedJobTitle;
import com.konfigthis.client.model.ContractToCreateSharedSeniority;
import com.konfigthis.client.model.ContractToCreateSharedWorker;
import com.konfigthis.client.model.ContractWhoReportsEnum;
import com.konfigthis.client.model.MetaDataOfContractToCreate;
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
 * ContractToCreatePaygMilestones
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContractToCreatePaygMilestones {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  private String scopeOfWork;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  private String specialClause;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private LocalDate terminationDate;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private ContractToCreateSharedClient client;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private ContractToCreateSharedJobTitle jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  private ContractToCreateSharedSeniority seniority;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  private Double noticePeriod = 0d;

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  private ContractWhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaDataOfContractToCreate meta;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  private ContractToCreateSharedWorker worker;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    PAYG_MILESTONES("payg_milestones");

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

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  private CompensationDetailsOfContractToCreateShared compensationDetails;

  public ContractToCreatePaygMilestones() {
  }

  public ContractToCreatePaygMilestones title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the contract.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title of the contract.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ContractToCreatePaygMilestones countryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "Country code.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    this.countryCode = countryCode;
  }


  public ContractToCreatePaygMilestones stateCode(String stateCode) {
    
    
    
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The state or province code. Use country lookup endpoint to retrieve state codes.
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province code. Use country lookup endpoint to retrieve state codes.")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    
    
    
    this.stateCode = stateCode;
  }


  public ContractToCreatePaygMilestones scopeOfWork(String scopeOfWork) {
    
    
    
    
    this.scopeOfWork = scopeOfWork;
    return this;
  }

   /**
   * Describe the work to be performed.
   * @return scopeOfWork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describe the work to be performed.")

  public String getScopeOfWork() {
    return scopeOfWork;
  }


  public void setScopeOfWork(String scopeOfWork) {
    
    
    
    this.scopeOfWork = scopeOfWork;
  }


  public ContractToCreatePaygMilestones specialClause(String specialClause) {
    
    
    
    
    this.specialClause = specialClause;
    return this;
  }

   /**
   * Enter any special clause you may have.
   * @return specialClause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enter any special clause you may have.")

  public String getSpecialClause() {
    return specialClause;
  }


  public void setSpecialClause(String specialClause) {
    
    
    
    this.specialClause = specialClause;
  }


  public ContractToCreatePaygMilestones terminationDate(LocalDate terminationDate) {
    
    
    
    
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.")

  public LocalDate getTerminationDate() {
    return terminationDate;
  }


  public void setTerminationDate(LocalDate terminationDate) {
    
    
    
    this.terminationDate = terminationDate;
  }


  public ContractToCreatePaygMilestones client(ContractToCreateSharedClient client) {
    
    
    
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContractToCreateSharedClient getClient() {
    return client;
  }


  public void setClient(ContractToCreateSharedClient client) {
    
    
    
    this.client = client;
  }


  public ContractToCreatePaygMilestones jobTitle(ContractToCreateSharedJobTitle jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContractToCreateSharedJobTitle getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(ContractToCreateSharedJobTitle jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
  }


  public ContractToCreatePaygMilestones seniority(ContractToCreateSharedSeniority seniority) {
    
    
    
    
    this.seniority = seniority;
    return this;
  }

   /**
   * Get seniority
   * @return seniority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractToCreateSharedSeniority getSeniority() {
    return seniority;
  }


  public void setSeniority(ContractToCreateSharedSeniority seniority) {
    
    
    
    this.seniority = seniority;
  }


  public ContractToCreatePaygMilestones noticePeriod(Double noticePeriod) {
    if (noticePeriod != null && noticePeriod < 0) {
      throw new IllegalArgumentException("Invalid value for noticePeriod. Must be greater than or equal to 0.");
    }
    
    
    
    this.noticePeriod = noticePeriod;
    return this;
  }

  public ContractToCreatePaygMilestones noticePeriod(Integer noticePeriod) {
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


  public ContractToCreatePaygMilestones whoReports(ContractWhoReportsEnum whoReports) {
    
    
    
    
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


  public ContractToCreatePaygMilestones meta(MetaDataOfContractToCreate meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MetaDataOfContractToCreate getMeta() {
    return meta;
  }


  public void setMeta(MetaDataOfContractToCreate meta) {
    
    
    
    this.meta = meta;
  }


  public ContractToCreatePaygMilestones externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External Id.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public ContractToCreatePaygMilestones worker(ContractToCreateSharedWorker worker) {
    
    
    
    
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractToCreateSharedWorker getWorker() {
    return worker;
  }


  public void setWorker(ContractToCreateSharedWorker worker) {
    
    
    
    this.worker = worker;
  }


  public ContractToCreatePaygMilestones type(TypeEnum type) {
    
    
    
    
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


  public ContractToCreatePaygMilestones startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ContractToCreatePaygMilestones compensationDetails(CompensationDetailsOfContractToCreateShared compensationDetails) {
    
    
    
    
    this.compensationDetails = compensationDetails;
    return this;
  }

   /**
   * Get compensationDetails
   * @return compensationDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CompensationDetailsOfContractToCreateShared getCompensationDetails() {
    return compensationDetails;
  }


  public void setCompensationDetails(CompensationDetailsOfContractToCreateShared compensationDetails) {
    
    
    
    this.compensationDetails = compensationDetails;
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
   * @return the ContractToCreatePaygMilestones instance itself
   */
  public ContractToCreatePaygMilestones putAdditionalProperty(String key, Object value) {
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
    ContractToCreatePaygMilestones contractToCreatePaygMilestones = (ContractToCreatePaygMilestones) o;
    return Objects.equals(this.title, contractToCreatePaygMilestones.title) &&
        Objects.equals(this.countryCode, contractToCreatePaygMilestones.countryCode) &&
        Objects.equals(this.stateCode, contractToCreatePaygMilestones.stateCode) &&
        Objects.equals(this.scopeOfWork, contractToCreatePaygMilestones.scopeOfWork) &&
        Objects.equals(this.specialClause, contractToCreatePaygMilestones.specialClause) &&
        Objects.equals(this.terminationDate, contractToCreatePaygMilestones.terminationDate) &&
        Objects.equals(this.client, contractToCreatePaygMilestones.client) &&
        Objects.equals(this.jobTitle, contractToCreatePaygMilestones.jobTitle) &&
        Objects.equals(this.seniority, contractToCreatePaygMilestones.seniority) &&
        Objects.equals(this.noticePeriod, contractToCreatePaygMilestones.noticePeriod) &&
        Objects.equals(this.whoReports, contractToCreatePaygMilestones.whoReports) &&
        Objects.equals(this.meta, contractToCreatePaygMilestones.meta) &&
        Objects.equals(this.externalId, contractToCreatePaygMilestones.externalId) &&
        Objects.equals(this.worker, contractToCreatePaygMilestones.worker) &&
        Objects.equals(this.type, contractToCreatePaygMilestones.type) &&
        Objects.equals(this.startDate, contractToCreatePaygMilestones.startDate) &&
        Objects.equals(this.compensationDetails, contractToCreatePaygMilestones.compensationDetails)&&
        Objects.equals(this.additionalProperties, contractToCreatePaygMilestones.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, countryCode, stateCode, scopeOfWork, specialClause, terminationDate, client, jobTitle, seniority, noticePeriod, whoReports, meta, externalId, worker, type, startDate, compensationDetails, additionalProperties);
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
    sb.append("class ContractToCreatePaygMilestones {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
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
    openapiFields.add("country_code");
    openapiFields.add("state_code");
    openapiFields.add("scope_of_work");
    openapiFields.add("special_clause");
    openapiFields.add("termination_date");
    openapiFields.add("client");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("notice_period");
    openapiFields.add("who_reports");
    openapiFields.add("meta");
    openapiFields.add("external_id");
    openapiFields.add("worker");
    openapiFields.add("type");
    openapiFields.add("start_date");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("compensation_details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractToCreatePaygMilestones
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContractToCreatePaygMilestones.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreatePaygMilestones is not found in the empty JSON string", ContractToCreatePaygMilestones.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreatePaygMilestones.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (!jsonObj.get("state_code").isJsonNull() && (jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if (!jsonObj.get("scope_of_work").isJsonNull() && (jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if (!jsonObj.get("special_clause").isJsonNull() && (jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      // validate the required field `client`
      ContractToCreateSharedClient.validateJsonObject(jsonObj.getAsJsonObject("client"));
      // validate the required field `job_title`
      ContractToCreateSharedJobTitle.validateJsonObject(jsonObj.getAsJsonObject("job_title"));
      // validate the optional field `seniority`
      if (jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) {
        ContractToCreateSharedSeniority.validateJsonObject(jsonObj.getAsJsonObject("seniority"));
      }
      // validate the required field `meta`
      MetaDataOfContractToCreate.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      if (!jsonObj.get("external_id").isJsonNull() && (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the optional field `worker`
      if (jsonObj.get("worker") != null && !jsonObj.get("worker").isJsonNull()) {
        ContractToCreateSharedWorker.validateJsonObject(jsonObj.getAsJsonObject("worker"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `compensation_details`
      CompensationDetailsOfContractToCreateShared.validateJsonObject(jsonObj.getAsJsonObject("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreatePaygMilestones.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreatePaygMilestones' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreatePaygMilestones> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePaygMilestones.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreatePaygMilestones>() {
           @Override
           public void write(JsonWriter out, ContractToCreatePaygMilestones value) throws IOException {
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
           public ContractToCreatePaygMilestones read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContractToCreatePaygMilestones instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContractToCreatePaygMilestones given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractToCreatePaygMilestones
  * @throws IOException if the JSON string is invalid with respect to ContractToCreatePaygMilestones
  */
  public static ContractToCreatePaygMilestones fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreatePaygMilestones.class);
  }

 /**
  * Convert an instance of ContractToCreatePaygMilestones to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

