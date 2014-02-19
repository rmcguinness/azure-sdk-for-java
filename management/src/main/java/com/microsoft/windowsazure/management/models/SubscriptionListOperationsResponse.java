/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* The List Subscription Operations operation response.
*/
public class SubscriptionListOperationsResponse extends OperationResponse {
    private String continuationToken;
    
    /**
    * The string that can be used to return the rest of the list. Subsequent
    * requests must include this parameter to continue listing operations from
    * where the last response left off. This element exists only if the
    * complete list of subscription operations was not returned.
    * @return The ContinuationToken value.
    */
    public String getContinuationToken() {
        return this.continuationToken;
    }
    
    /**
    * The string that can be used to return the rest of the list. Subsequent
    * requests must include this parameter to continue listing operations from
    * where the last response left off. This element exists only if the
    * complete list of subscription operations was not returned.
    * @param continuationTokenValue The ContinuationToken value.
    */
    public void setContinuationToken(final String continuationTokenValue) {
        this.continuationToken = continuationTokenValue;
    }
    
    private ArrayList<SubscriptionListOperationsResponse.SubscriptionOperation> subscriptionOperations;
    
    /**
    * The list of operations that have been performed on the subscription
    * during the specified timeframe.
    * @return The SubscriptionOperations value.
    */
    public ArrayList<SubscriptionListOperationsResponse.SubscriptionOperation> getSubscriptionOperations() {
        return this.subscriptionOperations;
    }
    
    /**
    * The list of operations that have been performed on the subscription
    * during the specified timeframe.
    * @param subscriptionOperationsValue The SubscriptionOperations value.
    */
    public void setSubscriptionOperations(final ArrayList<SubscriptionListOperationsResponse.SubscriptionOperation> subscriptionOperationsValue) {
        this.subscriptionOperations = subscriptionOperationsValue;
    }
    
    /**
    * Initializes a new instance of the SubscriptionListOperationsResponse
    * class.
    *
    */
    public SubscriptionListOperationsResponse() {
        super();
        this.subscriptionOperations = new ArrayList<SubscriptionListOperationsResponse.SubscriptionOperation>();
    }
    
    /**
    * A collection of attributes that identifies the source of the operation.
    */
    public static class OperationCallerDetails {
        private InetAddress clientIPAddress;
        
        /**
        * The IP address of the client computer that initiated the operation.
        * This element is returned only if UsedServiceManagementApi is true.
        * @return The ClientIPAddress value.
        */
        public InetAddress getClientIPAddress() {
            return this.clientIPAddress;
        }
        
        /**
        * The IP address of the client computer that initiated the operation.
        * This element is returned only if UsedServiceManagementApi is true.
        * @param clientIPAddressValue The ClientIPAddress value.
        */
        public void setClientIPAddress(final InetAddress clientIPAddressValue) {
            this.clientIPAddress = clientIPAddressValue;
        }
        
        private String subscriptionCertificateThumbprint;
        
        /**
        * The thumbprint of the subscription certificate used to initiate the
        * operation.
        * @return The SubscriptionCertificateThumbprint value.
        */
        public String getSubscriptionCertificateThumbprint() {
            return this.subscriptionCertificateThumbprint;
        }
        
        /**
        * The thumbprint of the subscription certificate used to initiate the
        * operation.
        * @param subscriptionCertificateThumbprintValue The
        * SubscriptionCertificateThumbprint value.
        */
        public void setSubscriptionCertificateThumbprint(final String subscriptionCertificateThumbprintValue) {
            this.subscriptionCertificateThumbprint = subscriptionCertificateThumbprintValue;
        }
        
        private boolean usedServiceManagementApi;
        
        /**
        * Indicates whether the operation was initiated by using the Service
        * Management API. False if it was initiated by another source, such as
        * the Management Portal.
        * @return The UsedServiceManagementApi value.
        */
        public boolean isUsedServiceManagementApi() {
            return this.usedServiceManagementApi;
        }
        
        /**
        * Indicates whether the operation was initiated by using the Service
        * Management API. False if it was initiated by another source, such as
        * the Management Portal.
        * @param usedServiceManagementApiValue The UsedServiceManagementApi
        * value.
        */
        public void setUsedServiceManagementApi(final boolean usedServiceManagementApiValue) {
            this.usedServiceManagementApi = usedServiceManagementApiValue;
        }
        
        private String userEmailAddress;
        
        /**
        * The email associated with the Windows Live ID of the user who
        * initiated the operation from the Management Portal. This element is
        * returned only if UsedServiceManagementApi is false.
        * @return The UserEmailAddress value.
        */
        public String getUserEmailAddress() {
            return this.userEmailAddress;
        }
        
        /**
        * The email associated with the Windows Live ID of the user who
        * initiated the operation from the Management Portal. This element is
        * returned only if UsedServiceManagementApi is false.
        * @param userEmailAddressValue The UserEmailAddress value.
        */
        public void setUserEmailAddress(final String userEmailAddressValue) {
            this.userEmailAddress = userEmailAddressValue;
        }
    }
    
    /**
    * An operation that has been performed on the subscription during the
    * specified timeframe.
    */
    public static class SubscriptionOperation {
        private SubscriptionListOperationsResponse.OperationCallerDetails operationCaller;
        
        /**
        * A collection of attributes that identifies the source of the
        * operation.
        * @return The OperationCaller value.
        */
        public SubscriptionListOperationsResponse.OperationCallerDetails getOperationCaller() {
            return this.operationCaller;
        }
        
        /**
        * A collection of attributes that identifies the source of the
        * operation.
        * @param operationCallerValue The OperationCaller value.
        */
        public void setOperationCaller(final SubscriptionListOperationsResponse.OperationCallerDetails operationCallerValue) {
            this.operationCaller = operationCallerValue;
        }
        
        private Calendar operationCompletedTime;
        
        /**
        * The time that the operation finished executing.
        * @return The OperationCompletedTime value.
        */
        public Calendar getOperationCompletedTime() {
            return this.operationCompletedTime;
        }
        
        /**
        * The time that the operation finished executing.
        * @param operationCompletedTimeValue The OperationCompletedTime value.
        */
        public void setOperationCompletedTime(final Calendar operationCompletedTimeValue) {
            this.operationCompletedTime = operationCompletedTimeValue;
        }
        
        private String operationId;
        
        /**
        * The globally unique identifier (GUID) of the operation.
        * @return The OperationId value.
        */
        public String getOperationId() {
            return this.operationId;
        }
        
        /**
        * The globally unique identifier (GUID) of the operation.
        * @param operationIdValue The OperationId value.
        */
        public void setOperationId(final String operationIdValue) {
            this.operationId = operationIdValue;
        }
        
        private String operationName;
        
        /**
        * The name of the performed operation.
        * @return The OperationName value.
        */
        public String getOperationName() {
            return this.operationName;
        }
        
        /**
        * The name of the performed operation.
        * @param operationNameValue The OperationName value.
        */
        public void setOperationName(final String operationNameValue) {
            this.operationName = operationNameValue;
        }
        
        private String operationObjectId;
        
        /**
        * The target object for the operation. This value is equal to the URL
        * for performing an HTTP GET on the object, and corresponds to the
        * same values for the ObjectIdFilter in the request.
        * @return The OperationObjectId value.
        */
        public String getOperationObjectId() {
            return this.operationObjectId;
        }
        
        /**
        * The target object for the operation. This value is equal to the URL
        * for performing an HTTP GET on the object, and corresponds to the
        * same values for the ObjectIdFilter in the request.
        * @param operationObjectIdValue The OperationObjectId value.
        */
        public void setOperationObjectId(final String operationObjectIdValue) {
            this.operationObjectId = operationObjectIdValue;
        }
        
        private HashMap<String, String> operationParameters;
        
        /**
        * The collection of parameters for the performed operation.
        * @return The OperationParameters value.
        */
        public HashMap<String, String> getOperationParameters() {
            return this.operationParameters;
        }
        
        /**
        * The collection of parameters for the performed operation.
        * @param operationParametersValue The OperationParameters value.
        */
        public void setOperationParameters(final HashMap<String, String> operationParametersValue) {
            this.operationParameters = operationParametersValue;
        }
        
        private Calendar operationStartedTime;
        
        /**
        * The time that the operation started to execute.
        * @return The OperationStartedTime value.
        */
        public Calendar getOperationStartedTime() {
            return this.operationStartedTime;
        }
        
        /**
        * The time that the operation started to execute.
        * @param operationStartedTimeValue The OperationStartedTime value.
        */
        public void setOperationStartedTime(final Calendar operationStartedTimeValue) {
            this.operationStartedTime = operationStartedTimeValue;
        }
        
        private String operationStatus;
        
        /**
        * An object that contains information on the current status of the
        * operation. The object returned has the following XML format:
        * <OperationStatus> <ID>339c6c13-1f81-412f-9bc6-00e9c5876695</ID>
        * <Status>Succeeded</Status> <HttpStatusCode>200</HttpStatusCode>
        * </OperationStatus>  Possible values of the Status element,
        * whichholds the operation status, are: Succeeded, Failed, InProgress.
        * @return The OperationStatus value.
        */
        public String getOperationStatus() {
            return this.operationStatus;
        }
        
        /**
        * An object that contains information on the current status of the
        * operation. The object returned has the following XML format:
        * <OperationStatus> <ID>339c6c13-1f81-412f-9bc6-00e9c5876695</ID>
        * <Status>Succeeded</Status> <HttpStatusCode>200</HttpStatusCode>
        * </OperationStatus>  Possible values of the Status element,
        * whichholds the operation status, are: Succeeded, Failed, InProgress.
        * @param operationStatusValue The OperationStatus value.
        */
        public void setOperationStatus(final String operationStatusValue) {
            this.operationStatus = operationStatusValue;
        }
        
        /**
        * Initializes a new instance of the SubscriptionOperation class.
        *
        */
        public SubscriptionOperation() {
            this.operationParameters = new HashMap<String, String>();
        }
    }
}
