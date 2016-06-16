/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.store.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.datalake.store.DataLakeStoreFileSystemManagementClient;
import com.microsoft.azure.management.datalake.store.FileSystems;
import com.microsoft.azure.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * Initializes a new instance of the DataLakeStoreFileSystemManagementClientImpl class.
 */
public final class DataLakeStoreFileSystemManagementClientImpl extends AzureServiceClient implements DataLakeStoreFileSystemManagementClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets the URI used as the base for all cloud service requests. */
    private String adlsFileSystemDnsSuffix;

    /**
     * Gets Gets the URI used as the base for all cloud service requests.
     *
     * @return the adlsFileSystemDnsSuffix value.
     */
    public String adlsFileSystemDnsSuffix() {
        return this.adlsFileSystemDnsSuffix;
    }

    /**
     * Sets Gets the URI used as the base for all cloud service requests.
     *
     * @param adlsFileSystemDnsSuffix the adlsFileSystemDnsSuffix value.
     * @return the service client itself
     */
    public DataLakeStoreFileSystemManagementClientImpl withAdlsFileSystemDnsSuffix(String adlsFileSystemDnsSuffix) {
        this.adlsFileSystemDnsSuffix = adlsFileSystemDnsSuffix;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public DataLakeStoreFileSystemManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public DataLakeStoreFileSystemManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public DataLakeStoreFileSystemManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The FileSystems object to access its operations.
     */
    private FileSystems fileSystems;

    /**
     * Gets the FileSystems object to access its operations.
     * @return the FileSystems object.
     */
    public FileSystems fileSystems() {
        return this.fileSystems;
    }

    /**
     * Initializes an instance of DataLakeStoreFileSystemManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public DataLakeStoreFileSystemManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://{accountName}.{adlsFileSystemDnsSuffix}", credentials);
    }

    /**
     * Initializes an instance of DataLakeStoreFileSystemManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    private DataLakeStoreFileSystemManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of DataLakeStoreFileSystemManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public DataLakeStoreFileSystemManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-10-01-preview";
        this.adlsFileSystemDnsSuffix = "azuredatalakestore.net";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.fileSystems = new FileSystemsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "DataLakeStoreFileSystemManagementClient, 2015-10-01-preview");
    }
}
