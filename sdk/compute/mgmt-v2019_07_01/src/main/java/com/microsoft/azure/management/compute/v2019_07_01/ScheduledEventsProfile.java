/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScheduledEventsProfile model.
 */
public class ScheduledEventsProfile {
    /**
     * Specifies Terminate Scheduled Event related configurations.
     */
    @JsonProperty(value = "terminateNotificationProfile")
    private TerminateNotificationProfile terminateNotificationProfile;

    /**
     * Get specifies Terminate Scheduled Event related configurations.
     *
     * @return the terminateNotificationProfile value
     */
    public TerminateNotificationProfile terminateNotificationProfile() {
        return this.terminateNotificationProfile;
    }

    /**
     * Set specifies Terminate Scheduled Event related configurations.
     *
     * @param terminateNotificationProfile the terminateNotificationProfile value to set
     * @return the ScheduledEventsProfile object itself.
     */
    public ScheduledEventsProfile withTerminateNotificationProfile(TerminateNotificationProfile terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
        return this;
    }

}
