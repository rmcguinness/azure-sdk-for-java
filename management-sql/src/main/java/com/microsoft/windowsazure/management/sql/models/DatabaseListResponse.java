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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* Response containing the list of databases for a given server.
*/
public class DatabaseListResponse extends OperationResponse implements Iterable<DatabaseListResponse.Database> {
    private ArrayList<DatabaseListResponse.Database> databases;
    
    /**
    * Gets or sets the SQL Server databases that are housed in a server.
    * @return The Databases value.
    */
    public ArrayList<DatabaseListResponse.Database> getDatabases() {
        return this.databases;
    }
    
    /**
    * Gets or sets the SQL Server databases that are housed in a server.
    * @param databasesValue The Databases value.
    */
    public void setDatabases(final ArrayList<DatabaseListResponse.Database> databasesValue) {
        this.databases = databasesValue;
    }
    
    /**
    * Initializes a new instance of the DatabaseListResponse class.
    *
    */
    public DatabaseListResponse() {
        super();
        this.databases = new ArrayList<DatabaseListResponse.Database>();
    }
    
    /**
    * Gets the sequence of Databases.
    *
    */
    public Iterator<DatabaseListResponse.Database> iterator() {
        return this.getDatabases().iterator();
    }
    
    /**
    * SQL Server database.
    */
    public static class Database {
        private String collationName;
        
        /**
        * Gets or sets the database resource's collation name.
        * @return The CollationName value.
        */
        public String getCollationName() {
            return this.collationName;
        }
        
        /**
        * Gets or sets the database resource's collation name.
        * @param collationNameValue The CollationName value.
        */
        public void setCollationName(final String collationNameValue) {
            this.collationName = collationNameValue;
        }
        
        private Calendar creationDate;
        
        /**
        * Gets or sets the date this database was created.
        * @return The CreationDate value.
        */
        public Calendar getCreationDate() {
            return this.creationDate;
        }
        
        /**
        * Gets or sets the date this database was created.
        * @param creationDateValue The CreationDate value.
        */
        public void setCreationDate(final Calendar creationDateValue) {
            this.creationDate = creationDateValue;
        }
        
        private String edition;
        
        /**
        * Gets or sets the database resource's edition.
        * @return The Edition value.
        */
        public String getEdition() {
            return this.edition;
        }
        
        /**
        * Gets or sets the database resource's edition.
        * @param editionValue The Edition value.
        */
        public void setEdition(final String editionValue) {
            this.edition = editionValue;
        }
        
        private int id;
        
        /**
        * Gets or sets the id of the database.
        * @return The Id value.
        */
        public int getId() {
            return this.id;
        }
        
        /**
        * Gets or sets the id of the database.
        * @param idValue The Id value.
        */
        public void setId(final int idValue) {
            this.id = idValue;
        }
        
        private boolean isFederationRoot;
        
        /**
        * Gets or sets a value indicating whether the database is a federation
        * root.
        * @return The IsFederationRoot value.
        */
        public boolean isFederationRoot() {
            return this.isFederationRoot;
        }
        
        /**
        * Gets or sets a value indicating whether the database is a federation
        * root.
        * @param isFederationRootValue The IsFederationRoot value.
        */
        public void setIsFederationRoot(final boolean isFederationRootValue) {
            this.isFederationRoot = isFederationRootValue;
        }
        
        private boolean isSystemObject;
        
        /**
        * Gets or sets a value indicating whether the database is a system
        * object.
        * @return The IsSystemObject value.
        */
        public boolean isSystemObject() {
            return this.isSystemObject;
        }
        
        /**
        * Gets or sets a value indicating whether the database is a system
        * object.
        * @param isSystemObjectValue The IsSystemObject value.
        */
        public void setIsSystemObject(final boolean isSystemObjectValue) {
            this.isSystemObject = isSystemObjectValue;
        }
        
        private long maximumDatabaseSizeInGB;
        
        /**
        * Gets or sets the maximum size of this database, in Gigabytes.
        * @return The MaximumDatabaseSizeInGB value.
        */
        public long getMaximumDatabaseSizeInGB() {
            return this.maximumDatabaseSizeInGB;
        }
        
        /**
        * Gets or sets the maximum size of this database, in Gigabytes.
        * @param maximumDatabaseSizeInGBValue The MaximumDatabaseSizeInGB value.
        */
        public void setMaximumDatabaseSizeInGB(final long maximumDatabaseSizeInGBValue) {
            this.maximumDatabaseSizeInGB = maximumDatabaseSizeInGBValue;
        }
        
        private String name;
        
        /**
        * Gets or sets the name of the database.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Gets or sets the name of the database.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String serviceObjectiveAssignmentErrorCode;
        
        /**
        * Gets or sets the error code for this service objective.
        * @return The ServiceObjectiveAssignmentErrorCode value.
        */
        public String getServiceObjectiveAssignmentErrorCode() {
            return this.serviceObjectiveAssignmentErrorCode;
        }
        
        /**
        * Gets or sets the error code for this service objective.
        * @param serviceObjectiveAssignmentErrorCodeValue The
        * ServiceObjectiveAssignmentErrorCode value.
        */
        public void setServiceObjectiveAssignmentErrorCode(final String serviceObjectiveAssignmentErrorCodeValue) {
            this.serviceObjectiveAssignmentErrorCode = serviceObjectiveAssignmentErrorCodeValue;
        }
        
        private String serviceObjectiveAssignmentErrorDescription;
        
        /**
        * Gets or sets the error description, if any.
        * @return The ServiceObjectiveAssignmentErrorDescription value.
        */
        public String getServiceObjectiveAssignmentErrorDescription() {
            return this.serviceObjectiveAssignmentErrorDescription;
        }
        
        /**
        * Gets or sets the error description, if any.
        * @param serviceObjectiveAssignmentErrorDescriptionValue The
        * ServiceObjectiveAssignmentErrorDescription value.
        */
        public void setServiceObjectiveAssignmentErrorDescription(final String serviceObjectiveAssignmentErrorDescriptionValue) {
            this.serviceObjectiveAssignmentErrorDescription = serviceObjectiveAssignmentErrorDescriptionValue;
        }
        
        private String serviceObjectiveAssignmentState;
        
        /**
        * Gets or sets the state of the current assignment.
        * @return The ServiceObjectiveAssignmentState value.
        */
        public String getServiceObjectiveAssignmentState() {
            return this.serviceObjectiveAssignmentState;
        }
        
        /**
        * Gets or sets the state of the current assignment.
        * @param serviceObjectiveAssignmentStateValue The
        * ServiceObjectiveAssignmentState value.
        */
        public void setServiceObjectiveAssignmentState(final String serviceObjectiveAssignmentStateValue) {
            this.serviceObjectiveAssignmentState = serviceObjectiveAssignmentStateValue;
        }
        
        private String serviceObjectiveAssignmentStateDescription;
        
        /**
        * Gets or sets the state description.
        * @return The ServiceObjectiveAssignmentStateDescription value.
        */
        public String getServiceObjectiveAssignmentStateDescription() {
            return this.serviceObjectiveAssignmentStateDescription;
        }
        
        /**
        * Gets or sets the state description.
        * @param serviceObjectiveAssignmentStateDescriptionValue The
        * ServiceObjectiveAssignmentStateDescription value.
        */
        public void setServiceObjectiveAssignmentStateDescription(final String serviceObjectiveAssignmentStateDescriptionValue) {
            this.serviceObjectiveAssignmentStateDescription = serviceObjectiveAssignmentStateDescriptionValue;
        }
        
        private String serviceObjectiveAssignmentSuccessDate;
        
        /**
        * Gets or sets the date the service's assignment succeeded.
        * @return The ServiceObjectiveAssignmentSuccessDate value.
        */
        public String getServiceObjectiveAssignmentSuccessDate() {
            return this.serviceObjectiveAssignmentSuccessDate;
        }
        
        /**
        * Gets or sets the date the service's assignment succeeded.
        * @param serviceObjectiveAssignmentSuccessDateValue The
        * ServiceObjectiveAssignmentSuccessDate value.
        */
        public void setServiceObjectiveAssignmentSuccessDate(final String serviceObjectiveAssignmentSuccessDateValue) {
            this.serviceObjectiveAssignmentSuccessDate = serviceObjectiveAssignmentSuccessDateValue;
        }
        
        private String serviceObjectiveId;
        
        /**
        * Gets or sets the id of this service objective.
        * @return The ServiceObjectiveId value.
        */
        public String getServiceObjectiveId() {
            return this.serviceObjectiveId;
        }
        
        /**
        * Gets or sets the id of this service objective.
        * @param serviceObjectiveIdValue The ServiceObjectiveId value.
        */
        public void setServiceObjectiveId(final String serviceObjectiveIdValue) {
            this.serviceObjectiveId = serviceObjectiveIdValue;
        }
        
        private String sizeMB;
        
        /**
        * Gets or sets the size of this database in megabytes (MB).
        * @return The SizeMB value.
        */
        public String getSizeMB() {
            return this.sizeMB;
        }
        
        /**
        * Gets or sets the size of this database in megabytes (MB).
        * @param sizeMBValue The SizeMB value.
        */
        public void setSizeMB(final String sizeMBValue) {
            this.sizeMB = sizeMBValue;
        }
        
        private String state;
        
        /**
        * Gets or sets the state of the database.
        * @return The State value.
        */
        public String getState() {
            return this.state;
        }
        
        /**
        * Gets or sets the state of the database.
        * @param stateValue The State value.
        */
        public void setState(final String stateValue) {
            this.state = stateValue;
        }
        
        private String type;
        
        /**
        * Gets or sets the type of resource.
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Gets or sets the type of resource.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
    }
}
