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
import com.konfigthis.client.model.AdjustmentCreatedContainer;
import com.konfigthis.client.model.AdjustmentToCreate;
import com.konfigthis.client.model.AdjustmentToCreateContainer;
import com.konfigthis.client.model.AdjustmentToUpdate;
import com.konfigthis.client.model.AdjustmentToUpdateContainer;
import com.konfigthis.client.model.AdjustmentsCategoriesContainer;
import com.konfigthis.client.model.AdjustmentsContainer;
import com.konfigthis.client.model.GenericResultDeleted;
import com.konfigthis.client.model.GenericResultUpdated;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdjustmentsApi
 */
@Disabled
public class AdjustmentsApiTest {

    private static AdjustmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdjustmentsApi(apiClient);
    }

    /**
     * Create a new adjustment
     *
     * Create a new adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewAdjustmentTest() throws ApiException {
        AdjustmentToCreate data = null;
        AdjustmentCreatedContainer response = api.createNewAdjustment(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve adjustments
     *
     * Get all adjustments for the specific contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String contractId = null;
        LocalDate from = null;
        LocalDate to = null;
        AdjustmentsContainer response = api.getAll(contractId)
                .from(from)
                .to(to)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an adjustment
     *
     * Retrieve an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String adjustmentId = null;
        AdjustmentCreatedContainer response = api.getById(adjustmentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve categories
     *
     * Get all categories for your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        AdjustmentsCategoriesContainer response = api.getCategories()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an adjustment
     *
     * Delete an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAdjustmentTest() throws ApiException {
        String adjustmentId = null;
        GenericResultDeleted response = api.removeAdjustment(adjustmentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an adjustment
     *
     * Update an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdjustmentTest() throws ApiException {
        AdjustmentToUpdate data = null;
        String adjustmentId = null;
        GenericResultUpdated response = api.updateAdjustment(data, adjustmentId)
                .execute();
        // TODO: test validations
    }

}
