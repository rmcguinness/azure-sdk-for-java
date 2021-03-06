// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AutomaticTuningOptionModeDesired. */
public enum AutomaticTuningOptionModeDesired {
    /** Enum value Off. */
    OFF("Off"),

    /** Enum value On. */
    ON("On"),

    /** Enum value Default. */
    DEFAULT("Default");

    /** The actual serialized value for a AutomaticTuningOptionModeDesired instance. */
    private final String value;

    AutomaticTuningOptionModeDesired(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutomaticTuningOptionModeDesired instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutomaticTuningOptionModeDesired object, or null if unable to parse.
     */
    @JsonCreator
    public static AutomaticTuningOptionModeDesired fromString(String value) {
        AutomaticTuningOptionModeDesired[] items = AutomaticTuningOptionModeDesired.values();
        for (AutomaticTuningOptionModeDesired item : items) {
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
