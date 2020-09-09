// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.implementation.models.ErrorResponseException;
import com.azure.digitaltwins.core.implementation.models.EventRoute;
import com.azure.digitaltwins.core.implementation.models.EventRouteCollection;
import com.azure.digitaltwins.core.implementation.models.EventRoutesListOptions;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EventRoutes. */
public final class EventRoutesImpl {
    /** The proxy service used to perform REST calls. */
    private final EventRoutesService service;

    /** The service client containing this operation class. */
    private final AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of EventRoutesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EventRoutesImpl(AzureDigitalTwinsAPIImpl client) {
        this.service =
                RestProxy.create(EventRoutesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDigitalTwinsAPIEventRoutes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDigitalTwinsAPI")
    private interface EventRoutesService {
        @Get("/eventroutes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<EventRouteCollection>> list(
                @HostParam("$host") String host,
                @HeaderParam("x-ms-max-item-count") Integer maxItemCount,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("/eventroutes/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<EventRoute>> getById(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Put("/eventroutes/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> add(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") EventRoute eventRoute,
                Context context);

        @Delete("/eventroutes/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<EventRouteCollection>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Retrieves all event routes. Status codes: 200 (OK): Success. 400 (Bad Request): The request is invalid.
     *
     * @param eventRoutesListOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EventRoute objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EventRoute>> listSinglePageAsync(
            EventRoutesListOptions eventRoutesListOptions, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (eventRoutesListOptions != null) {
            eventRoutesListOptions.validate();
        }
        Integer maxItemCountInternal = null;
        if (eventRoutesListOptions != null) {
            maxItemCountInternal = eventRoutesListOptions.getMaxItemCount();
        }
        Integer maxItemCount = maxItemCountInternal;
        return service.list(this.client.getHost(), maxItemCount, this.client.getApiVersion(), context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Retrieves an event route. Status codes: 200 (OK): Success. 404 (Not Found): There is no event route with the
     * provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a route which directs notification and telemetry events to an endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<EventRoute>> getByIdWithResponseAsync(String id, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        return service.getById(this.client.getHost(), id, this.client.getApiVersion(), context);
    }

    /**
     * Adds or replaces an event route. Status codes: 200 (OK): Success. 400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param eventRoute A route which directs notification and telemetry events to an endpoint. Endpoints are a
     *     destination outside of Azure Digital Twins such as an EventHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> addWithResponseAsync(String id, EventRoute eventRoute, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        if (eventRoute != null) {
            eventRoute.validate();
        }
        return service.add(this.client.getHost(), id, this.client.getApiVersion(), eventRoute, context);
    }

    /**
     * Deletes an event route. Status codes: 200 (OK): Success. 404 (Not Found): There is no event route with the
     * provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        return service.delete(this.client.getHost(), id, this.client.getApiVersion(), context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EventRoute objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EventRoute>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service.listNext(nextLink, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
