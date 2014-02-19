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

package com.microsoft.windowsazure.management.virtualnetworks.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.InetAddress;

/**
* Preview Only. A reserved IP associated with your subscription.
*/
public class NetworkReservedIPGetResponse extends OperationResponse {
    private InetAddress address;
    
    /**
    * The IP address of the reserved IP.
    * @return The Address value.
    */
    public InetAddress getAddress() {
        return this.address;
    }
    
    /**
    * The IP address of the reserved IP.
    * @param addressValue The Address value.
    */
    public void setAddress(final InetAddress addressValue) {
        this.address = addressValue;
    }
    
    private String affinityGroup;
    
    /**
    * An affinity group, which indirectly refers to the location where the
    * virtual network exists.
    * @return The AffinityGroup value.
    */
    public String getAffinityGroup() {
        return this.affinityGroup;
    }
    
    /**
    * An affinity group, which indirectly refers to the location where the
    * virtual network exists.
    * @param affinityGroupValue The AffinityGroup value.
    */
    public void setAffinityGroup(final String affinityGroupValue) {
        this.affinityGroup = affinityGroupValue;
    }
    
    private String deploymentName;
    
    /**
    * The name of the deployment the IP belongs to, if being used.
    * @return The DeploymentName value.
    */
    public String getDeploymentName() {
        return this.deploymentName;
    }
    
    /**
    * The name of the deployment the IP belongs to, if being used.
    * @param deploymentNameValue The DeploymentName value.
    */
    public void setDeploymentName(final String deploymentNameValue) {
        this.deploymentName = deploymentNameValue;
    }
    
    private String id;
    
    /**
    * A unique string identifier that represents the reserved IP.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * A unique string identifier that represents the reserved IP.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private boolean inUse;
    
    /**
    * The indicator of whether the reserved IP is being used.
    * @return The InUse value.
    */
    public boolean isInUse() {
        return this.inUse;
    }
    
    /**
    * The indicator of whether the reserved IP is being used.
    * @param inUseValue The InUse value.
    */
    public void setInUse(final boolean inUseValue) {
        this.inUse = inUseValue;
    }
    
    private String label;
    
    /**
    * The friendly identifier of the site.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * The friendly identifier of the site.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String name;
    
    /**
    * Name of the reserved IP.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Name of the reserved IP.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String serviceName;
    
    /**
    * The name of the service the IP belongs to, if being used.
    * @return The ServiceName value.
    */
    public String getServiceName() {
        return this.serviceName;
    }
    
    /**
    * The name of the service the IP belongs to, if being used.
    * @param serviceNameValue The ServiceName value.
    */
    public void setServiceName(final String serviceNameValue) {
        this.serviceName = serviceNameValue;
    }
    
    private String state;
    
    /**
    * Current status of the reserved IP. (Created, Creating, Updating,
    * Deleting, Unavailable)
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Current status of the reserved IP. (Created, Creating, Updating,
    * Deleting, Unavailable)
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
}
