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
import com.konfigthis.client.model.AlternateEmailItem;
import com.konfigthis.client.model.ContractContainer;
import com.konfigthis.client.model.ContractDocumentContainer;
import com.konfigthis.client.model.ContractExternalIdToPatch;
import com.konfigthis.client.model.ContractInvitationToCreate;
import com.konfigthis.client.model.ContractInvitationToCreateContainer;
import com.konfigthis.client.model.ContractListContainer;
import com.konfigthis.client.model.ContractSignatureToCreate;
import com.konfigthis.client.model.ContractSignatureToCreateContainer;
import com.konfigthis.client.model.ContractStatusEnum;
import com.konfigthis.client.model.ContractTemplateListContainer;
import com.konfigthis.client.model.ContractTypeEnum;
import com.konfigthis.client.model.ContractsSortByEnum;
import com.konfigthis.client.model.EstimateFirstPayment;
import com.konfigthis.client.model.EstimateFirstPaymentContainer;
import java.io.File;
import com.konfigthis.client.model.FileObject;
import com.konfigthis.client.model.FinalPaymentCalculatedContainer;
import com.konfigthis.client.model.GenericResultCreated;
import com.konfigthis.client.model.GenericResultDeleted;
import com.konfigthis.client.model.GenericResultUpdated;
import com.konfigthis.client.model.InputToPatchContractExternalId;
import java.time.LocalDate;
import com.konfigthis.client.model.ResponseEstimateFirstPaymentContainer;
import com.konfigthis.client.model.SortDirEnum;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
@Disabled
public class ContractsApiTest {

    private static ContractsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContractsApi(apiClient);
    }

    /**
     * External Id
     *
     * Add an external Id to a Deel contract. You can use this to add a Deel contract&#39;s refernece Id in your platform. External Id can be passed as a query parameter in List contract endpoint to find this conract later.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addExternalIdTest() throws ApiException {
        ContractExternalIdToPatch data = null;
        String contractId = null;
        GenericResultCreated response = api.addExternalId(data, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Archive a contract
     *
     * Archive a terminated, cancelled or completed contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveContractTest() throws ApiException {
        String contractId = null;
        GenericResultUpdated response = api.archiveContract(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Attach a file to contract
     *
     * Attach a file to contract document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachFileToDocumentTest() throws ApiException {
        String contractId = null;
        File _file = null;
        ContractDocumentContainer response = api.attachFileToDocument(contractId)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Calculate final payment
     *
     * Calculate the final payment due to the contractor when ending the contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calculateFinalPaymentAmountTest() throws ApiException {
        String contractId = null;
        LocalDate endDate = null;
        String calculationType = null;
        String workweekStart = null;
        String workweekEnd = null;
        FinalPaymentCalculatedContainer response = api.calculateFinalPaymentAmount(contractId)
                .endDate(endDate)
                .calculationType(calculationType)
                .workweekStart(workweekStart)
                .workweekEnd(workweekEnd)
                .execute();
        // TODO: test validations
    }

    /**
     * Calculate first payment amount
     *
     * First payment is calculated from the number of working/calendar days between their start date and the start of the payment cycle.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calculateFirstPaymentAmountTest() throws ApiException {
        EstimateFirstPayment data = null;
        ResponseEstimateFirstPaymentContainer response = api.calculateFirstPaymentAmount(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Sign a contract
     *
     * Sign a contract as a client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientSignContractTest() throws ApiException {
        ContractSignatureToCreate data = null;
        String contractId = null;
        GenericResultCreated response = api.clientSignContract(data, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit the file attached to contract document.
     *
     * Overwrite the file currently attached to contract document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editFileAttachmentTest() throws ApiException {
        String contractId = null;
        File _file = null;
        ContractDocumentContainer response = api.editFileAttachment(contractId)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Find contract emails by ID
     *
     * Returns an array of alternate email objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findEmailsByIdTest() throws ApiException {
        String contractId = null;
        List<AlternateEmailItem> response = api.findEmailsById(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * List of contracts
     *
     * Retrieve a list of contracts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String afterCursor = null;
        Double limit = null;
        SortDirEnum orderDirection = null;
        List<ContractTypeEnum> types = null;
        List<ContractStatusEnum> statuses = null;
        String teamId = null;
        String externalId = null;
        List<String> countries = null;
        Object currencies = null;
        String search = null;
        ContractsSortByEnum sortBy = null;
        ContractListContainer response = api.getList()
                .afterCursor(afterCursor)
                .limit(limit)
                .orderDirection(orderDirection)
                .types(types)
                .statuses(statuses)
                .teamId(teamId)
                .externalId(externalId)
                .countries(countries)
                .currencies(currencies)
                .search(search)
                .sortBy(sortBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Get contract templates
     *
     * Retrieve a list of contract templates in your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getList_0Test() throws ApiException {
        ContractTemplateListContainer response = api.getList_0()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single contract
     *
     * Retrieve a single contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleContractTest() throws ApiException {
        String contractId = null;
        ContractContainer response = api.getSingleContract(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Send contract to worker
     *
     * Invite a worker to sign the contract. Worker will be notified via email.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inviteWorkerToSignTest() throws ApiException {
        ContractInvitationToCreate data = null;
        String contractId = null;
        GenericResultCreated response = api.inviteWorkerToSign(data, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove invite
     *
     * Remove invite in order to re-invite a worker to sign the contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeInviteTest() throws ApiException {
        String contractId = null;
        GenericResultDeleted response = api.removeInvite(contractId)
                .execute();
        // TODO: test validations
    }

}
