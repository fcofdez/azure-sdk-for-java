// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NotebookWorkspaceConnectionInfoResult model. */
@Immutable
public final class NotebookWorkspaceConnectionInfoResultInner {
    /*
     * Specifies auth token used for connecting to Notebook server (uses
     * token-based auth).
     */
    @JsonProperty(value = "authToken", access = JsonProperty.Access.WRITE_ONLY)
    private String authToken;

    /*
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /**
     * Get the authToken property: Specifies auth token used for connecting to Notebook server (uses token-based auth).
     *
     * @return the authToken value.
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }
}