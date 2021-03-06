// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.sql;

import com.azure.core.http.HttpPipeline;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.fluentcore.profile.AzureProfile;
import com.azure.management.resources.fluentcore.utils.SdkContext;
import com.azure.management.resources.implementation.ResourceManager;
import com.azure.management.sql.implementation.SqlServerManager;
import com.azure.management.storage.implementation.StorageManager;

public abstract class SqlServerTest extends TestBase {
    protected ResourceManager resourceManager;
    protected SqlServerManager sqlServerManager;
    protected StorageManager storageManager;
    protected String rgName = "";
    protected String sqlServerName = "";

    @Override
    protected void initializeClients(HttpPipeline httpPipeline, AzureProfile profile) {
        rgName = generateRandomResourceName("rgsql", 20);
        sqlServerName = generateRandomResourceName("javasqlserver", 20);

        resourceManager =
            ResourceManager.authenticate(httpPipeline, profile).withSdkContext(sdkContext).withDefaultSubscription();

        sqlServerManager = SqlServerManager.authenticate(httpPipeline, profile, sdkContext);

        storageManager = StorageManager.authenticate(httpPipeline, profile, sdkContext);
    }

    @Override
    protected void cleanUpResources() {
        SdkContext.sleep(1000);
        resourceManager.resourceGroups().beginDeleteByName(rgName);
    }
}
