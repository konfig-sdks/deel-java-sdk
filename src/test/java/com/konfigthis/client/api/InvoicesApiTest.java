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
import com.konfigthis.client.model.ContractTypeEnum;
import com.konfigthis.client.model.GenericResultCreated;
import com.konfigthis.client.model.GenericResultDeleted;
import com.konfigthis.client.model.GenericResultUpdated;
import com.konfigthis.client.model.InvoiceAdjustmentAttachmentContainer;
import com.konfigthis.client.model.InvoiceAdjustmentCreatedContainer;
import com.konfigthis.client.model.InvoiceAdjustmentListContainer;
import com.konfigthis.client.model.InvoiceAdjustmentReviewToCreate;
import com.konfigthis.client.model.InvoiceAdjustmentReviewToCreateContainer;
import com.konfigthis.client.model.InvoiceAdjustmentReviewsToCreate;
import com.konfigthis.client.model.InvoiceAdjustmentReviewsToCreateContainer;
import com.konfigthis.client.model.InvoiceAdjustmentStatusEnum;
import com.konfigthis.client.model.InvoiceAdjustmentToCreate;
import com.konfigthis.client.model.InvoiceAdjustmentToCreateContainer;
import com.konfigthis.client.model.InvoiceAdjustmentToCreateWithFile;
import com.konfigthis.client.model.InvoiceAdjustmentToUpdate;
import com.konfigthis.client.model.InvoiceAdjustmentToUpdateContainer;
import com.konfigthis.client.model.InvoiceAdjustmentTypeEnum;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Disabled
public class InvoicesApiTest {

    private static InvoicesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new InvoicesApi(apiClient);
    }

    /**
     * Create an invoice adjustment
     *
     * Create an invoice adjustment using this endpoint. For example, you can add a bonus, commission, VAT %, deduction etc. to an invoice.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAdjustmentTest() throws ApiException {
        InvoiceAdjustmentToCreate data = null;
        Boolean recurring = null;
        InvoiceAdjustmentCreatedContainer response = api.createAdjustment(data)
                .recurring(recurring)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an invoice adjustment
     *
     * Delete an existing invoice adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAdjustmentTest() throws ApiException {
        Double invoiceAdjustmentId = null;
        String reason = null;
        GenericResultDeleted response = api.deleteAdjustment(invoiceAdjustmentId)
                .reason(reason)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Attachment file url.
     *
     * Retrieve Attachment file url of specified id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentFileUrlTest() throws ApiException {
        Double invoiceAdjustmentId = null;
        InvoiceAdjustmentAttachmentContainer response = api.getAttachmentFileUrl(invoiceAdjustmentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Invoice line items by contract
     *
     * Retrieve invoice line items for a given contract id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLineItemsByContractTest() throws ApiException {
        String contractId = null;
        List<ContractTypeEnum> contractTypes = null;
        List<InvoiceAdjustmentTypeEnum> types = null;
        List<InvoiceAdjustmentStatusEnum> statuses = null;
        Double invoiceId = null;
        Double reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        Double limit = null;
        Double offset = null;
        InvoiceAdjustmentListContainer response = api.getLineItemsByContract(contractId)
                .contractTypes(contractTypes)
                .types(types)
                .statuses(statuses)
                .invoiceId(invoiceId)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * List invoice adjustments
     *
     * Retrieve invoice adjustments. You can filter the list by providing additional parameters e.g. contract_id, contract_type etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInvoiceAdjustmentsTest() throws ApiException {
        String contractId = null;
        List<ContractTypeEnum> contractTypes = null;
        List<InvoiceAdjustmentTypeEnum> types = null;
        List<InvoiceAdjustmentStatusEnum> statuses = null;
        Double invoiceId = null;
        Double reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        Double limit = null;
        Double offset = null;
        InvoiceAdjustmentListContainer response = api.listInvoiceAdjustments()
                .contractId(contractId)
                .contractTypes(contractTypes)
                .types(types)
                .statuses(statuses)
                .invoiceId(invoiceId)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk review invoice adjustments
     *
     * Review multiple invoice adjustments to approve or decline a batch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reviewMultipleTest() throws ApiException {
        InvoiceAdjustmentReviewsToCreate data = null;
        GenericResultCreated response = api.reviewMultiple(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Review an invoice adjustment
     *
     * Review an invoice adjustment to approve or decline it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitAdjustmentReviewTest() throws ApiException {
        InvoiceAdjustmentReviewToCreate data = null;
        Double invoiceAdjustmentId = null;
        GenericResultCreated response = api.submitAdjustmentReview(data, invoiceAdjustmentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an invoice adjustment
     *
     * Update an existing invoice adjustment. It is not possible to update VAT adjustments, we recommend you to delete the existing VAT adjust and create a new one.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdjustmentByIdTest() throws ApiException {
        InvoiceAdjustmentToUpdate data = null;
        Double invoiceAdjustmentId = null;
        GenericResultUpdated response = api.updateAdjustmentById(data, invoiceAdjustmentId)
                .execute();
        // TODO: test validations
    }

}
