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

package com.microsoft.windowsazure.management.store.models;

/**
* Represents the data passed to the Update Store Resource API method.
*/
public class AddOnUpdateParameters {
    private String plan;
    
    /**
    * The selected plan for this store addon.
    * @return The Plan value.
    */
    public String getPlan() {
        return this.plan;
    }
    
    /**
    * The selected plan for this store addon.
    * @param planValue The Plan value.
    */
    public void setPlan(final String planValue) {
        this.plan = planValue;
    }
    
    private String promotionCode;
    
    /**
    * The promotion code for this store addon.
    * @return The PromotionCode value.
    */
    public String getPromotionCode() {
        return this.promotionCode;
    }
    
    /**
    * The promotion code for this store addon.
    * @param promotionCodeValue The PromotionCode value.
    */
    public void setPromotionCode(final String promotionCodeValue) {
        this.promotionCode = promotionCodeValue;
    }
    
    private String type;
    
    /**
    * The type of store item to be created.
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * The type of store item to be created.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
}
