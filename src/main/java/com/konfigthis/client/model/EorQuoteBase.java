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
import com.konfigthis.client.model.BreakdownCostsQuote;
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
 * EOR quote approved by Deel
 */
@ApiModel(description = "EOR quote approved by Deel")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EorQuoteBase {
  public static final String SERIALIZED_NAME_ANNUAL_SALARY = "annual_salary";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY)
  private Double annualSalary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_BREAKDOWN_COSTS = "breakdown_costs";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_COSTS)
  private BreakdownCostsQuote breakdownCosts;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL = "severance_accrual_total";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL)
  private Double severanceAccrualTotal;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD = "severance_accrual_total_usd";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD)
  private Double severanceAccrualTotalUsd;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL = "recurring_allowance_total";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL)
  private Double recurringAllowanceTotal;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD = "recurring_allowance_total_usd";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD)
  private Double recurringAllowanceTotalUsd;

  public static final String SERIALIZED_NAME_SALARY_TOTAL = "salary_total";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL)
  private Double salaryTotal;

  public static final String SERIALIZED_NAME_SALARY_TOTAL_USD = "salary_total_usd";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL_USD)
  private Double salaryTotalUsd;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL = "employer_cost_total";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL)
  private Double employerCostTotal;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD = "employer_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD)
  private Double employerCostTotalUsd;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL = "platform_fee_total";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL)
  private Double platformFeeTotal;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD = "platform_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD)
  private Double platformFeeTotalUsd;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL = "mobility_fee_total";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL)
  private Double mobilityFeeTotal;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD = "mobility_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD)
  private Double mobilityFeeTotalUsd;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL = "monthly_cost_total";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL)
  private Double monthlyCostTotal;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD = "monthly_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD)
  private Double monthlyCostTotalUsd;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL = "gross_salary_total";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL)
  private Double grossSalaryTotal;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD = "gross_salary_total_usd";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD)
  private Double grossSalaryTotalUsd;

  public static final String SERIALIZED_NAME_CBA_TOTAL = "cba_total";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL)
  private Double cbaTotal;

  public static final String SERIALIZED_NAME_CBA_TOTAL_USD = "cba_total_usd";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL_USD)
  private Double cbaTotalUsd;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private LocalDate updatedAt;

  public EorQuoteBase() {
  }

  public EorQuoteBase annualSalary(Double annualSalary) {
    
    
    
    
    this.annualSalary = annualSalary;
    return this;
  }

  public EorQuoteBase annualSalary(Integer annualSalary) {
    
    
    
    
    this.annualSalary = annualSalary.doubleValue();
    return this;
  }

   /**
   * Annual Salary in local currency
   * @return annualSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Annual Salary in local currency")

  public Double getAnnualSalary() {
    return annualSalary;
  }


  public void setAnnualSalary(Double annualSalary) {
    
    
    
    this.annualSalary = annualSalary;
  }


  public EorQuoteBase currency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GBP", value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    this.currency = currency;
  }


  public EorQuoteBase breakdownCosts(BreakdownCostsQuote breakdownCosts) {
    
    
    
    
    this.breakdownCosts = breakdownCosts;
    return this;
  }

   /**
   * Get breakdownCosts
   * @return breakdownCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BreakdownCostsQuote getBreakdownCosts() {
    return breakdownCosts;
  }


  public void setBreakdownCosts(BreakdownCostsQuote breakdownCosts) {
    
    
    
    this.breakdownCosts = breakdownCosts;
  }


  public EorQuoteBase severanceAccrualTotal(Double severanceAccrualTotal) {
    
    
    
    
    this.severanceAccrualTotal = severanceAccrualTotal;
    return this;
  }

  public EorQuoteBase severanceAccrualTotal(Integer severanceAccrualTotal) {
    
    
    
    
    this.severanceAccrualTotal = severanceAccrualTotal.doubleValue();
    return this;
  }

   /**
   * Total severance accrual in local currency
   * @return severanceAccrualTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total severance accrual in local currency")

  public Double getSeveranceAccrualTotal() {
    return severanceAccrualTotal;
  }


  public void setSeveranceAccrualTotal(Double severanceAccrualTotal) {
    
    
    
    this.severanceAccrualTotal = severanceAccrualTotal;
  }


  public EorQuoteBase severanceAccrualTotalUsd(Double severanceAccrualTotalUsd) {
    
    
    
    
    this.severanceAccrualTotalUsd = severanceAccrualTotalUsd;
    return this;
  }

  public EorQuoteBase severanceAccrualTotalUsd(Integer severanceAccrualTotalUsd) {
    
    
    
    
    this.severanceAccrualTotalUsd = severanceAccrualTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total severance accrual in USD
   * @return severanceAccrualTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total severance accrual in USD")

  public Double getSeveranceAccrualTotalUsd() {
    return severanceAccrualTotalUsd;
  }


  public void setSeveranceAccrualTotalUsd(Double severanceAccrualTotalUsd) {
    
    
    
    this.severanceAccrualTotalUsd = severanceAccrualTotalUsd;
  }


  public EorQuoteBase recurringAllowanceTotal(Double recurringAllowanceTotal) {
    
    
    
    
    this.recurringAllowanceTotal = recurringAllowanceTotal;
    return this;
  }

  public EorQuoteBase recurringAllowanceTotal(Integer recurringAllowanceTotal) {
    
    
    
    
    this.recurringAllowanceTotal = recurringAllowanceTotal.doubleValue();
    return this;
  }

   /**
   * Total recurring allowance in local currency
   * @return recurringAllowanceTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total recurring allowance in local currency")

  public Double getRecurringAllowanceTotal() {
    return recurringAllowanceTotal;
  }


  public void setRecurringAllowanceTotal(Double recurringAllowanceTotal) {
    
    
    
    this.recurringAllowanceTotal = recurringAllowanceTotal;
  }


  public EorQuoteBase recurringAllowanceTotalUsd(Double recurringAllowanceTotalUsd) {
    
    
    
    
    this.recurringAllowanceTotalUsd = recurringAllowanceTotalUsd;
    return this;
  }

  public EorQuoteBase recurringAllowanceTotalUsd(Integer recurringAllowanceTotalUsd) {
    
    
    
    
    this.recurringAllowanceTotalUsd = recurringAllowanceTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total recurring allowance in USD
   * @return recurringAllowanceTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total recurring allowance in USD")

  public Double getRecurringAllowanceTotalUsd() {
    return recurringAllowanceTotalUsd;
  }


  public void setRecurringAllowanceTotalUsd(Double recurringAllowanceTotalUsd) {
    
    
    
    this.recurringAllowanceTotalUsd = recurringAllowanceTotalUsd;
  }


  public EorQuoteBase salaryTotal(Double salaryTotal) {
    
    
    
    
    this.salaryTotal = salaryTotal;
    return this;
  }

  public EorQuoteBase salaryTotal(Integer salaryTotal) {
    
    
    
    
    this.salaryTotal = salaryTotal.doubleValue();
    return this;
  }

   /**
   * Total salary in local currency
   * @return salaryTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total salary in local currency")

  public Double getSalaryTotal() {
    return salaryTotal;
  }


  public void setSalaryTotal(Double salaryTotal) {
    
    
    
    this.salaryTotal = salaryTotal;
  }


  public EorQuoteBase salaryTotalUsd(Double salaryTotalUsd) {
    
    
    
    
    this.salaryTotalUsd = salaryTotalUsd;
    return this;
  }

  public EorQuoteBase salaryTotalUsd(Integer salaryTotalUsd) {
    
    
    
    
    this.salaryTotalUsd = salaryTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total salary in USD
   * @return salaryTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total salary in USD")

  public Double getSalaryTotalUsd() {
    return salaryTotalUsd;
  }


  public void setSalaryTotalUsd(Double salaryTotalUsd) {
    
    
    
    this.salaryTotalUsd = salaryTotalUsd;
  }


  public EorQuoteBase employerCostTotal(Double employerCostTotal) {
    
    
    
    
    this.employerCostTotal = employerCostTotal;
    return this;
  }

  public EorQuoteBase employerCostTotal(Integer employerCostTotal) {
    
    
    
    
    this.employerCostTotal = employerCostTotal.doubleValue();
    return this;
  }

   /**
   * Total employer cost in local currency
   * @return employerCostTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total employer cost in local currency")

  public Double getEmployerCostTotal() {
    return employerCostTotal;
  }


  public void setEmployerCostTotal(Double employerCostTotal) {
    
    
    
    this.employerCostTotal = employerCostTotal;
  }


  public EorQuoteBase employerCostTotalUsd(Double employerCostTotalUsd) {
    
    
    
    
    this.employerCostTotalUsd = employerCostTotalUsd;
    return this;
  }

  public EorQuoteBase employerCostTotalUsd(Integer employerCostTotalUsd) {
    
    
    
    
    this.employerCostTotalUsd = employerCostTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total employer cost in USD
   * @return employerCostTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total employer cost in USD")

  public Double getEmployerCostTotalUsd() {
    return employerCostTotalUsd;
  }


  public void setEmployerCostTotalUsd(Double employerCostTotalUsd) {
    
    
    
    this.employerCostTotalUsd = employerCostTotalUsd;
  }


  public EorQuoteBase platformFeeTotal(Double platformFeeTotal) {
    
    
    
    
    this.platformFeeTotal = platformFeeTotal;
    return this;
  }

  public EorQuoteBase platformFeeTotal(Integer platformFeeTotal) {
    
    
    
    
    this.platformFeeTotal = platformFeeTotal.doubleValue();
    return this;
  }

   /**
   * Total platform fee in local currency
   * @return platformFeeTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total platform fee in local currency")

  public Double getPlatformFeeTotal() {
    return platformFeeTotal;
  }


  public void setPlatformFeeTotal(Double platformFeeTotal) {
    
    
    
    this.platformFeeTotal = platformFeeTotal;
  }


  public EorQuoteBase platformFeeTotalUsd(Double platformFeeTotalUsd) {
    
    
    
    
    this.platformFeeTotalUsd = platformFeeTotalUsd;
    return this;
  }

  public EorQuoteBase platformFeeTotalUsd(Integer platformFeeTotalUsd) {
    
    
    
    
    this.platformFeeTotalUsd = platformFeeTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total platform fee in USD
   * @return platformFeeTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total platform fee in USD")

  public Double getPlatformFeeTotalUsd() {
    return platformFeeTotalUsd;
  }


  public void setPlatformFeeTotalUsd(Double platformFeeTotalUsd) {
    
    
    
    this.platformFeeTotalUsd = platformFeeTotalUsd;
  }


  public EorQuoteBase mobilityFeeTotal(Double mobilityFeeTotal) {
    
    
    
    
    this.mobilityFeeTotal = mobilityFeeTotal;
    return this;
  }

  public EorQuoteBase mobilityFeeTotal(Integer mobilityFeeTotal) {
    
    
    
    
    this.mobilityFeeTotal = mobilityFeeTotal.doubleValue();
    return this;
  }

   /**
   * Total mobility fee in local currency
   * @return mobilityFeeTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total mobility fee in local currency")

  public Double getMobilityFeeTotal() {
    return mobilityFeeTotal;
  }


  public void setMobilityFeeTotal(Double mobilityFeeTotal) {
    
    
    
    this.mobilityFeeTotal = mobilityFeeTotal;
  }


  public EorQuoteBase mobilityFeeTotalUsd(Double mobilityFeeTotalUsd) {
    
    
    
    
    this.mobilityFeeTotalUsd = mobilityFeeTotalUsd;
    return this;
  }

  public EorQuoteBase mobilityFeeTotalUsd(Integer mobilityFeeTotalUsd) {
    
    
    
    
    this.mobilityFeeTotalUsd = mobilityFeeTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total mobility fee in USD
   * @return mobilityFeeTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total mobility fee in USD")

  public Double getMobilityFeeTotalUsd() {
    return mobilityFeeTotalUsd;
  }


  public void setMobilityFeeTotalUsd(Double mobilityFeeTotalUsd) {
    
    
    
    this.mobilityFeeTotalUsd = mobilityFeeTotalUsd;
  }


  public EorQuoteBase monthlyCostTotal(Double monthlyCostTotal) {
    
    
    
    
    this.monthlyCostTotal = monthlyCostTotal;
    return this;
  }

  public EorQuoteBase monthlyCostTotal(Integer monthlyCostTotal) {
    
    
    
    
    this.monthlyCostTotal = monthlyCostTotal.doubleValue();
    return this;
  }

   /**
   * Total monthly cost in local currency
   * @return monthlyCostTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total monthly cost in local currency")

  public Double getMonthlyCostTotal() {
    return monthlyCostTotal;
  }


  public void setMonthlyCostTotal(Double monthlyCostTotal) {
    
    
    
    this.monthlyCostTotal = monthlyCostTotal;
  }


  public EorQuoteBase monthlyCostTotalUsd(Double monthlyCostTotalUsd) {
    
    
    
    
    this.monthlyCostTotalUsd = monthlyCostTotalUsd;
    return this;
  }

  public EorQuoteBase monthlyCostTotalUsd(Integer monthlyCostTotalUsd) {
    
    
    
    
    this.monthlyCostTotalUsd = monthlyCostTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total monthly cost in USD
   * @return monthlyCostTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total monthly cost in USD")

  public Double getMonthlyCostTotalUsd() {
    return monthlyCostTotalUsd;
  }


  public void setMonthlyCostTotalUsd(Double monthlyCostTotalUsd) {
    
    
    
    this.monthlyCostTotalUsd = monthlyCostTotalUsd;
  }


  public EorQuoteBase grossSalaryTotal(Double grossSalaryTotal) {
    
    
    
    
    this.grossSalaryTotal = grossSalaryTotal;
    return this;
  }

  public EorQuoteBase grossSalaryTotal(Integer grossSalaryTotal) {
    
    
    
    
    this.grossSalaryTotal = grossSalaryTotal.doubleValue();
    return this;
  }

   /**
   * Total gross salary in local currency
   * @return grossSalaryTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total gross salary in local currency")

  public Double getGrossSalaryTotal() {
    return grossSalaryTotal;
  }


  public void setGrossSalaryTotal(Double grossSalaryTotal) {
    
    
    
    this.grossSalaryTotal = grossSalaryTotal;
  }


  public EorQuoteBase grossSalaryTotalUsd(Double grossSalaryTotalUsd) {
    
    
    
    
    this.grossSalaryTotalUsd = grossSalaryTotalUsd;
    return this;
  }

  public EorQuoteBase grossSalaryTotalUsd(Integer grossSalaryTotalUsd) {
    
    
    
    
    this.grossSalaryTotalUsd = grossSalaryTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total gross salary in USD
   * @return grossSalaryTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total gross salary in USD")

  public Double getGrossSalaryTotalUsd() {
    return grossSalaryTotalUsd;
  }


  public void setGrossSalaryTotalUsd(Double grossSalaryTotalUsd) {
    
    
    
    this.grossSalaryTotalUsd = grossSalaryTotalUsd;
  }


  public EorQuoteBase cbaTotal(Double cbaTotal) {
    
    
    
    
    this.cbaTotal = cbaTotal;
    return this;
  }

  public EorQuoteBase cbaTotal(Integer cbaTotal) {
    
    
    
    
    this.cbaTotal = cbaTotal.doubleValue();
    return this;
  }

   /**
   * Total CBA in local currency
   * @return cbaTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total CBA in local currency")

  public Double getCbaTotal() {
    return cbaTotal;
  }


  public void setCbaTotal(Double cbaTotal) {
    
    
    
    this.cbaTotal = cbaTotal;
  }


  public EorQuoteBase cbaTotalUsd(Double cbaTotalUsd) {
    
    
    
    
    this.cbaTotalUsd = cbaTotalUsd;
    return this;
  }

  public EorQuoteBase cbaTotalUsd(Integer cbaTotalUsd) {
    
    
    
    
    this.cbaTotalUsd = cbaTotalUsd.doubleValue();
    return this;
  }

   /**
   * Total CBA in USD
   * @return cbaTotalUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Total CBA in USD")

  public Double getCbaTotalUsd() {
    return cbaTotalUsd;
  }


  public void setCbaTotalUsd(Double cbaTotalUsd) {
    
    
    
    this.cbaTotalUsd = cbaTotalUsd;
  }


  public EorQuoteBase createdAt(LocalDate createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public EorQuoteBase updatedAt(LocalDate updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.")

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(LocalDate updatedAt) {
    
    
    
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
   * @return the EorQuoteBase instance itself
   */
  public EorQuoteBase putAdditionalProperty(String key, Object value) {
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
    EorQuoteBase eorQuoteBase = (EorQuoteBase) o;
    return Objects.equals(this.annualSalary, eorQuoteBase.annualSalary) &&
        Objects.equals(this.currency, eorQuoteBase.currency) &&
        Objects.equals(this.breakdownCosts, eorQuoteBase.breakdownCosts) &&
        Objects.equals(this.severanceAccrualTotal, eorQuoteBase.severanceAccrualTotal) &&
        Objects.equals(this.severanceAccrualTotalUsd, eorQuoteBase.severanceAccrualTotalUsd) &&
        Objects.equals(this.recurringAllowanceTotal, eorQuoteBase.recurringAllowanceTotal) &&
        Objects.equals(this.recurringAllowanceTotalUsd, eorQuoteBase.recurringAllowanceTotalUsd) &&
        Objects.equals(this.salaryTotal, eorQuoteBase.salaryTotal) &&
        Objects.equals(this.salaryTotalUsd, eorQuoteBase.salaryTotalUsd) &&
        Objects.equals(this.employerCostTotal, eorQuoteBase.employerCostTotal) &&
        Objects.equals(this.employerCostTotalUsd, eorQuoteBase.employerCostTotalUsd) &&
        Objects.equals(this.platformFeeTotal, eorQuoteBase.platformFeeTotal) &&
        Objects.equals(this.platformFeeTotalUsd, eorQuoteBase.platformFeeTotalUsd) &&
        Objects.equals(this.mobilityFeeTotal, eorQuoteBase.mobilityFeeTotal) &&
        Objects.equals(this.mobilityFeeTotalUsd, eorQuoteBase.mobilityFeeTotalUsd) &&
        Objects.equals(this.monthlyCostTotal, eorQuoteBase.monthlyCostTotal) &&
        Objects.equals(this.monthlyCostTotalUsd, eorQuoteBase.monthlyCostTotalUsd) &&
        Objects.equals(this.grossSalaryTotal, eorQuoteBase.grossSalaryTotal) &&
        Objects.equals(this.grossSalaryTotalUsd, eorQuoteBase.grossSalaryTotalUsd) &&
        Objects.equals(this.cbaTotal, eorQuoteBase.cbaTotal) &&
        Objects.equals(this.cbaTotalUsd, eorQuoteBase.cbaTotalUsd) &&
        Objects.equals(this.createdAt, eorQuoteBase.createdAt) &&
        Objects.equals(this.updatedAt, eorQuoteBase.updatedAt)&&
        Objects.equals(this.additionalProperties, eorQuoteBase.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualSalary, currency, breakdownCosts, severanceAccrualTotal, severanceAccrualTotalUsd, recurringAllowanceTotal, recurringAllowanceTotalUsd, salaryTotal, salaryTotalUsd, employerCostTotal, employerCostTotalUsd, platformFeeTotal, platformFeeTotalUsd, mobilityFeeTotal, mobilityFeeTotalUsd, monthlyCostTotal, monthlyCostTotalUsd, grossSalaryTotal, grossSalaryTotalUsd, cbaTotal, cbaTotalUsd, createdAt, updatedAt, additionalProperties);
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
    sb.append("class EorQuoteBase {\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    breakdownCosts: ").append(toIndentedString(breakdownCosts)).append("\n");
    sb.append("    severanceAccrualTotal: ").append(toIndentedString(severanceAccrualTotal)).append("\n");
    sb.append("    severanceAccrualTotalUsd: ").append(toIndentedString(severanceAccrualTotalUsd)).append("\n");
    sb.append("    recurringAllowanceTotal: ").append(toIndentedString(recurringAllowanceTotal)).append("\n");
    sb.append("    recurringAllowanceTotalUsd: ").append(toIndentedString(recurringAllowanceTotalUsd)).append("\n");
    sb.append("    salaryTotal: ").append(toIndentedString(salaryTotal)).append("\n");
    sb.append("    salaryTotalUsd: ").append(toIndentedString(salaryTotalUsd)).append("\n");
    sb.append("    employerCostTotal: ").append(toIndentedString(employerCostTotal)).append("\n");
    sb.append("    employerCostTotalUsd: ").append(toIndentedString(employerCostTotalUsd)).append("\n");
    sb.append("    platformFeeTotal: ").append(toIndentedString(platformFeeTotal)).append("\n");
    sb.append("    platformFeeTotalUsd: ").append(toIndentedString(platformFeeTotalUsd)).append("\n");
    sb.append("    mobilityFeeTotal: ").append(toIndentedString(mobilityFeeTotal)).append("\n");
    sb.append("    mobilityFeeTotalUsd: ").append(toIndentedString(mobilityFeeTotalUsd)).append("\n");
    sb.append("    monthlyCostTotal: ").append(toIndentedString(monthlyCostTotal)).append("\n");
    sb.append("    monthlyCostTotalUsd: ").append(toIndentedString(monthlyCostTotalUsd)).append("\n");
    sb.append("    grossSalaryTotal: ").append(toIndentedString(grossSalaryTotal)).append("\n");
    sb.append("    grossSalaryTotalUsd: ").append(toIndentedString(grossSalaryTotalUsd)).append("\n");
    sb.append("    cbaTotal: ").append(toIndentedString(cbaTotal)).append("\n");
    sb.append("    cbaTotalUsd: ").append(toIndentedString(cbaTotalUsd)).append("\n");
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
    openapiFields.add("annual_salary");
    openapiFields.add("currency");
    openapiFields.add("breakdown_costs");
    openapiFields.add("severance_accrual_total");
    openapiFields.add("severance_accrual_total_usd");
    openapiFields.add("recurring_allowance_total");
    openapiFields.add("recurring_allowance_total_usd");
    openapiFields.add("salary_total");
    openapiFields.add("salary_total_usd");
    openapiFields.add("employer_cost_total");
    openapiFields.add("employer_cost_total_usd");
    openapiFields.add("platform_fee_total");
    openapiFields.add("platform_fee_total_usd");
    openapiFields.add("mobility_fee_total");
    openapiFields.add("mobility_fee_total_usd");
    openapiFields.add("monthly_cost_total");
    openapiFields.add("monthly_cost_total_usd");
    openapiFields.add("gross_salary_total");
    openapiFields.add("gross_salary_total_usd");
    openapiFields.add("cba_total");
    openapiFields.add("cba_total_usd");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EorQuoteBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EorQuoteBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorQuoteBase is not found in the empty JSON string", EorQuoteBase.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `breakdown_costs`
      if (jsonObj.get("breakdown_costs") != null && !jsonObj.get("breakdown_costs").isJsonNull()) {
        BreakdownCostsQuote.validateJsonObject(jsonObj.getAsJsonObject("breakdown_costs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorQuoteBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorQuoteBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorQuoteBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorQuoteBase.class));

       return (TypeAdapter<T>) new TypeAdapter<EorQuoteBase>() {
           @Override
           public void write(JsonWriter out, EorQuoteBase value) throws IOException {
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
           public EorQuoteBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EorQuoteBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EorQuoteBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EorQuoteBase
  * @throws IOException if the JSON string is invalid with respect to EorQuoteBase
  */
  public static EorQuoteBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorQuoteBase.class);
  }

 /**
  * Convert an instance of EorQuoteBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

