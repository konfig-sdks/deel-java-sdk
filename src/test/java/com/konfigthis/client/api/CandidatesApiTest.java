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
import com.konfigthis.client.model.CandidateToCreate;
import com.konfigthis.client.model.CandidateToCreateContainer;
import com.konfigthis.client.model.CandidateToPatch;
import com.konfigthis.client.model.CandidateToPatchContainer;
import com.konfigthis.client.model.GenericResultCreated;
import com.konfigthis.client.model.GenericResultUpdated;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CandidatesApi
 */
@Disabled
public class CandidatesApiTest {

    private static CandidatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CandidatesApi(apiClient);
    }

    /**
     * Add Candidate
     *
     * Add a candidate to Deel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCandidateToDeelTest() throws ApiException {
        CandidateToCreate data = null;
        GenericResultCreated response = api.addCandidateToDeel(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Candidate
     *
     * Update an existed candidate.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCandidateByIdTest() throws ApiException {
        CandidateToPatch data = null;
        String candidateId = null;
        GenericResultUpdated response = api.updateCandidateById(data, candidateId)
                .execute();
        // TODO: test validations
    }

}
