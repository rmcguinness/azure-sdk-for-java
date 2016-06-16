/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UsageState.
 */
public enum UsageState {
    /** Enum value Normal. */
    NORMAL("Normal"),

    /** Enum value Exceeded. */
    EXCEEDED("Exceeded");

    /** The actual serialized value for a UsageState instance. */
    private String value;

    UsageState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UsageState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UsageState object, or null if unable to parse.
     */
    @JsonCreator
    public static UsageState fromString(String value) {
        UsageState[] items = UsageState.values();
        for (UsageState item : items) {
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
