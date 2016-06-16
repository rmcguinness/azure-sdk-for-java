/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.store.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AppendModeType.
 */
public enum AppendModeType {
    /** Enum value autocreate. */
    AUTOCREATE("autocreate");

    /** The actual serialized value for a AppendModeType instance. */
    private String value;

    AppendModeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AppendModeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AppendModeType object, or null if unable to parse.
     */
    @JsonCreator
    public static AppendModeType fromString(String value) {
        AppendModeType[] items = AppendModeType.values();
        for (AppendModeType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
