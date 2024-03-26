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
 * BenefitQuote
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BenefitQuote {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Double fee;

  public static final String SERIALIZED_NAME_FEE_USD = "fee_usd";
  @SerializedName(SERIALIZED_NAME_FEE_USD)
  private Double feeUsd;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PRICE_USD = "price_usd";
  @SerializedName(SERIALIZED_NAME_PRICE_USD)
  private Double priceUsd;

  public BenefitQuote() {
  }

  public BenefitQuote fee(Double fee) {
    
    
    
    
    this.fee = fee;
    return this;
  }

  public BenefitQuote fee(Integer fee) {
    
    
    
    
    this.fee = fee.doubleValue();
    return this;
  }

   /**
   * Fee in local currency
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in local currency")

  public Double getFee() {
    return fee;
  }


  public void setFee(Double fee) {
    
    
    
    this.fee = fee;
  }


  public BenefitQuote feeUsd(Double feeUsd) {
    
    
    
    
    this.feeUsd = feeUsd;
    return this;
  }

  public BenefitQuote feeUsd(Integer feeUsd) {
    
    
    
    
    this.feeUsd = feeUsd.doubleValue();
    return this;
  }

   /**
   * Fee in USD
   * @return feeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in USD")

  public Double getFeeUsd() {
    return feeUsd;
  }


  public void setFeeUsd(Double feeUsd) {
    
    
    
    this.feeUsd = feeUsd;
  }


  public BenefitQuote name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Benefit&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Benefit's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public BenefitQuote plan(String plan) {
    
    
    
    
    this.plan = plan;
    return this;
  }

   /**
   * Benefit&#39;s plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Benefit's plan")

  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    
    
    
    this.plan = plan;
  }


  public BenefitQuote price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public BenefitQuote price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * Price in local currency
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price in local currency")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public BenefitQuote currency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency code.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GBP", value = "Currency code.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    this.currency = currency;
  }


  public BenefitQuote priceUsd(Double priceUsd) {
    
    
    
    
    this.priceUsd = priceUsd;
    return this;
  }

  public BenefitQuote priceUsd(Integer priceUsd) {
    
    
    
    
    this.priceUsd = priceUsd.doubleValue();
    return this;
  }

   /**
   * Price in USD
   * @return priceUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price in USD")

  public Double getPriceUsd() {
    return priceUsd;
  }


  public void setPriceUsd(Double priceUsd) {
    
    
    
    this.priceUsd = priceUsd;
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
   * @return the BenefitQuote instance itself
   */
  public BenefitQuote putAdditionalProperty(String key, Object value) {
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
    BenefitQuote benefitQuote = (BenefitQuote) o;
    return Objects.equals(this.fee, benefitQuote.fee) &&
        Objects.equals(this.feeUsd, benefitQuote.feeUsd) &&
        Objects.equals(this.name, benefitQuote.name) &&
        Objects.equals(this.plan, benefitQuote.plan) &&
        Objects.equals(this.price, benefitQuote.price) &&
        Objects.equals(this.currency, benefitQuote.currency) &&
        Objects.equals(this.priceUsd, benefitQuote.priceUsd)&&
        Objects.equals(this.additionalProperties, benefitQuote.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, feeUsd, name, plan, price, currency, priceUsd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitQuote {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeUsd: ").append(toIndentedString(feeUsd)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
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
    openapiFields.add("fee");
    openapiFields.add("fee_usd");
    openapiFields.add("name");
    openapiFields.add("plan");
    openapiFields.add("price");
    openapiFields.add("currency");
    openapiFields.add("price_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BenefitQuote
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BenefitQuote.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BenefitQuote is not found in the empty JSON string", BenefitQuote.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BenefitQuote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BenefitQuote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BenefitQuote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BenefitQuote.class));

       return (TypeAdapter<T>) new TypeAdapter<BenefitQuote>() {
           @Override
           public void write(JsonWriter out, BenefitQuote value) throws IOException {
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
           public BenefitQuote read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BenefitQuote instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BenefitQuote given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BenefitQuote
  * @throws IOException if the JSON string is invalid with respect to BenefitQuote
  */
  public static BenefitQuote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BenefitQuote.class);
  }

 /**
  * Convert an instance of BenefitQuote to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

