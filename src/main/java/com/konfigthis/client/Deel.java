package com.konfigthis.client;

import com.konfigthis.client.api.AccountingApi;
import com.konfigthis.client.api.AdjustmentsApi;
import com.konfigthis.client.api.AttachmentsApi;
import com.konfigthis.client.api.CandidatesApi;
import com.konfigthis.client.api.ContractorsApi;
import com.konfigthis.client.api.ContractsApi;
import com.konfigthis.client.api.EorApi;
import com.konfigthis.client.api.GlobalPayrollApi;
import com.konfigthis.client.api.InvoicesApi;
import com.konfigthis.client.api.LookupsApi;
import com.konfigthis.client.api.ManagersApi;
import com.konfigthis.client.api.MilestonesApi;
import com.konfigthis.client.api.OffCyclePaymentsApi;
import com.konfigthis.client.api.OrganizationsApi;
import com.konfigthis.client.api.PartnerManagedApi;
import com.konfigthis.client.api.PeopleApi;
import com.konfigthis.client.api.ServiceProviderConfigApi;
import com.konfigthis.client.api.TasksApi;
import com.konfigthis.client.api.TimeOffApi;
import com.konfigthis.client.api.TimesheetsApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.UserApi;
import com.konfigthis.client.api.WebhooksApi;

public class Deel {
    private ApiClient apiClient;
    public final AccountingApi accounting;
    public final AdjustmentsApi adjustments;
    public final AttachmentsApi attachments;
    public final CandidatesApi candidates;
    public final ContractorsApi contractors;
    public final ContractsApi contracts;
    public final EorApi eor;
    public final GlobalPayrollApi globalPayroll;
    public final InvoicesApi invoices;
    public final LookupsApi lookups;
    public final ManagersApi managers;
    public final MilestonesApi milestones;
    public final OffCyclePaymentsApi offCyclePayments;
    public final OrganizationsApi organizations;
    public final PartnerManagedApi partnerManaged;
    public final PeopleApi people;
    public final ServiceProviderConfigApi serviceProviderConfig;
    public final TasksApi tasks;
    public final TimeOffApi timeOff;
    public final TimesheetsApi timesheets;
    public final TokenApi token;
    public final UserApi user;
    public final WebhooksApi webhooks;

    public Deel() {
        this(null);
    }

    public Deel(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounting = new AccountingApi(this.apiClient);
        this.adjustments = new AdjustmentsApi(this.apiClient);
        this.attachments = new AttachmentsApi(this.apiClient);
        this.candidates = new CandidatesApi(this.apiClient);
        this.contractors = new ContractorsApi(this.apiClient);
        this.contracts = new ContractsApi(this.apiClient);
        this.eor = new EorApi(this.apiClient);
        this.globalPayroll = new GlobalPayrollApi(this.apiClient);
        this.invoices = new InvoicesApi(this.apiClient);
        this.lookups = new LookupsApi(this.apiClient);
        this.managers = new ManagersApi(this.apiClient);
        this.milestones = new MilestonesApi(this.apiClient);
        this.offCyclePayments = new OffCyclePaymentsApi(this.apiClient);
        this.organizations = new OrganizationsApi(this.apiClient);
        this.partnerManaged = new PartnerManagedApi(this.apiClient);
        this.people = new PeopleApi(this.apiClient);
        this.serviceProviderConfig = new ServiceProviderConfigApi(this.apiClient);
        this.tasks = new TasksApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
        this.timesheets = new TimesheetsApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
