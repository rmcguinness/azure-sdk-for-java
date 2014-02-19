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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Web Space Details operation response.
*/
public class WebSpacesGetResponse extends OperationResponse {
    private WebSpaceAvailabilityState availabilityState;
    
    /**
    * Possible values are Normal or Limited.
    * @return The AvailabilityState value.
    */
    public WebSpaceAvailabilityState getAvailabilityState() {
        return this.availabilityState;
    }
    
    /**
    * Possible values are Normal or Limited.
    * @param availabilityStateValue The AvailabilityState value.
    */
    public void setAvailabilityState(final WebSpaceAvailabilityState availabilityStateValue) {
        this.availabilityState = availabilityStateValue;
    }
    
    private Integer currentNumberOfWorkers;
    
    /**
    * The current number of workers.
    * @return The CurrentNumberOfWorkers value.
    */
    public Integer getCurrentNumberOfWorkers() {
        return this.currentNumberOfWorkers;
    }
    
    /**
    * The current number of workers.
    * @param currentNumberOfWorkersValue The CurrentNumberOfWorkers value.
    */
    public void setCurrentNumberOfWorkers(final Integer currentNumberOfWorkersValue) {
        this.currentNumberOfWorkers = currentNumberOfWorkersValue;
    }
    
    private WebSpaceWorkerSize currentWorkerSize;
    
    /**
    * The current worker size. Possible values are Small, Medium, or Large.
    * @return The CurrentWorkerSize value.
    */
    public WebSpaceWorkerSize getCurrentWorkerSize() {
        return this.currentWorkerSize;
    }
    
    /**
    * The current worker size. Possible values are Small, Medium, or Large.
    * @param currentWorkerSizeValue The CurrentWorkerSize value.
    */
    public void setCurrentWorkerSize(final WebSpaceWorkerSize currentWorkerSizeValue) {
        this.currentWorkerSize = currentWorkerSizeValue;
    }
    
    private String geoLocation;
    
    /**
    * The location of the datacenter for the web space.
    * @return The GeoLocation value.
    */
    public String getGeoLocation() {
        return this.geoLocation;
    }
    
    /**
    * The location of the datacenter for the web space.
    * @param geoLocationValue The GeoLocation value.
    */
    public void setGeoLocation(final String geoLocationValue) {
        this.geoLocation = geoLocationValue;
    }
    
    private String geoRegion;
    
    /**
    * The geographical region where the webspace is located.
    * @return The GeoRegion value.
    */
    public String getGeoRegion() {
        return this.geoRegion;
    }
    
    /**
    * The geographical region where the webspace is located.
    * @param geoRegionValue The GeoRegion value.
    */
    public void setGeoRegion(final String geoRegionValue) {
        this.geoRegion = geoRegionValue;
    }
    
    private String name;
    
    /**
    * The name of the webspace.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * The name of the webspace.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String plan;
    
    /**
    * The name of the webspace.
    * @return The Plan value.
    */
    public String getPlan() {
        return this.plan;
    }
    
    /**
    * The name of the webspace.
    * @param planValue The Plan value.
    */
    public void setPlan(final String planValue) {
        this.plan = planValue;
    }
    
    private WebSpaceStatus status;
    
    /**
    * The status of the Web Space. Possible values are Ready or Limited.  Note:
    * The Limited status occurs only if the datacenter is encountering an
    * operational issue.
    * @return The Status value.
    */
    public WebSpaceStatus getStatus() {
        return this.status;
    }
    
    /**
    * The status of the Web Space. Possible values are Ready or Limited.  Note:
    * The Limited status occurs only if the datacenter is encountering an
    * operational issue.
    * @param statusValue The Status value.
    */
    public void setStatus(final WebSpaceStatus statusValue) {
        this.status = statusValue;
    }
    
    private String subscription;
    
    /**
    * The subscription ID.
    * @return The Subscription value.
    */
    public String getSubscription() {
        return this.subscription;
    }
    
    /**
    * The subscription ID.
    * @param subscriptionValue The Subscription value.
    */
    public void setSubscription(final String subscriptionValue) {
        this.subscription = subscriptionValue;
    }
    
    private WebSpaceWorkerSize workerSize;
    
    /**
    * The worker size. Possible values are Small, Medium, and Large. For JSON,
    * the equivalents are 0 = Small, 1 = Medium, 2 = Large.
    * @return The WorkerSize value.
    */
    public WebSpaceWorkerSize getWorkerSize() {
        return this.workerSize;
    }
    
    /**
    * The worker size. Possible values are Small, Medium, and Large. For JSON,
    * the equivalents are 0 = Small, 1 = Medium, 2 = Large.
    * @param workerSizeValue The WorkerSize value.
    */
    public void setWorkerSize(final WebSpaceWorkerSize workerSizeValue) {
        this.workerSize = workerSizeValue;
    }
}
