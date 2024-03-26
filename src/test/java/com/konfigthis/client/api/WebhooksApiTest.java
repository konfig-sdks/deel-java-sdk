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
import com.konfigthis.client.model.CreateWebhookRequest;
import com.konfigthis.client.model.PatchWebhookRequest;
import com.konfigthis.client.model.WebhookEventTypeListResponse;
import com.konfigthis.client.model.WebhookItemResponse;
import com.konfigthis.client.model.WebhookListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private static WebhooksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhooksApi(apiClient);
    }

    /**
     * Create a webhook
     *
     * Create a new webhooks subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {
        String description = null;
        String name = null;
        String status = null;
        String url = null;
        String signingKey = null;
        String apiVersion = null;
        List<String> events = null;
        WebhookItemResponse response = api.createSubscription(description, name, status, url, signingKey, apiVersion, events)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a webhook
     *
     * Delete a webhook subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String id = null;
        api.deleteById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a webhook
     *
     * Edit a webhook subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editByIdTest() throws ApiException {
        String description = null;
        String name = null;
        String status = null;
        String url = null;
        String signingKey = null;
        List<String> events = null;
        String id = null;
        String apiVersion = null;
        WebhookItemResponse response = api.editById(description, name, status, url, signingKey, events, id)
                .apiVersion(apiVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single webhook
     *
     * Retrieve a single webhook subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        WebhookItemResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List of webhook event types
     *
     * Retrieve a list of webhook event types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEventTypesTest() throws ApiException {
        WebhookEventTypeListResponse response = api.listEventTypes()
                .execute();
        // TODO: test validations
    }

    /**
     * List of webhooks
     *
     * Retrieve a list of webhook subscriptions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhookSubscriptionsTest() throws ApiException {
        WebhookListResponse response = api.listWebhookSubscriptions()
                .execute();
        // TODO: test validations
    }

}
