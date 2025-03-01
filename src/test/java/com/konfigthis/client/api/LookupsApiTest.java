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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CountryListContainer;
import com.konfigthis.client.model.CurrencyListContainer;
import com.konfigthis.client.model.JobTitleListContainer;
import com.konfigthis.client.model.SeniorityListContainer;
import com.konfigthis.client.model.TimeoffTypeListContainer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LookupsApi
 */
@Disabled
public class LookupsApiTest {

    private static LookupsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LookupsApi(apiClient);
    }

    /**
     * Country list
     *
     * Retrieve a list of countries supported by Deel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountryListTest() throws ApiException {
        CountryListContainer response = api.getCountryList()
                .execute();
        // TODO: test validations
    }

    /**
     * Currency list
     *
     * Retrieve the list of currencies used by Deel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesListTest() throws ApiException {
        CurrencyListContainer response = api.getCurrenciesList()
                .execute();
        // TODO: test validations
    }

    /**
     * Job titles list
     *
     * Retrieve a list of pre-defined job titles in Deel platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobTitlesListTest() throws ApiException {
        Double limit = null;
        String afterCursor = null;
        JobTitleListContainer response = api.getJobTitlesList()
                .limit(limit)
                .afterCursor(afterCursor)
                .execute();
        // TODO: test validations
    }

    /**
     * Seniority levels
     *
     * Retrieve a list of pre-defined seniority level for roles in Deel platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSeniorityLevelsTest() throws ApiException {
        Double limit = null;
        SeniorityListContainer response = api.getSeniorityLevels()
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Time-off types
     *
     * Retrieve a list of pre-defined time off types to register in Deel platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeOffTypesTest() throws ApiException {
        TimeoffTypeListContainer response = api.getTimeOffTypes()
                .execute();
        // TODO: test validations
    }

}
