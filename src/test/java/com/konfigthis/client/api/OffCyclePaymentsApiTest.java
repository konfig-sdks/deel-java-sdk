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
import com.konfigthis.client.model.GenericResultCreatedWithId;
import com.konfigthis.client.model.OffCyclePaymentContainer;
import com.konfigthis.client.model.OffCyclePaymentListContainer;
import com.konfigthis.client.model.OffCyclePaymentToCreate;
import com.konfigthis.client.model.OffCyclePaymentToCreateContainer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OffCyclePaymentsApi
 */
@Disabled
public class OffCyclePaymentsApiTest {

    private static OffCyclePaymentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OffCyclePaymentsApi(apiClient);
    }

    /**
     * Add off-cycle payment
     *
     * Add a new invoice line-item for the purpose of off-cycle payment for a given contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPaymentInvoiceTest() throws ApiException {
        OffCyclePaymentToCreate data = null;
        String contractId = null;
        GenericResultCreatedWithId response = api.addPaymentInvoice(data, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * List of off-cycle payments
     *
     * Retrieve a list of off-cycle payments for the given contract id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String contractId = null;
        OffCyclePaymentListContainer response = api.getList(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single off-cycle payment
     *
     * Retrieve a single off-cycle payment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSinglePaymentTest() throws ApiException {
        String contractId = null;
        String offcyclePaymentId = null;
        OffCyclePaymentContainer response = api.getSinglePayment(contractId, offcyclePaymentId)
                .execute();
        // TODO: test validations
    }

}
