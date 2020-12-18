package com.turleylabs.subscription.renewal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SubscriberRetriever {
    public static String getSubscribers() throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest subscribersRequest = HttpRequest.newBuilder(URI.create(someUrl))
//                .header("accept", "application/json")
//                .GET()
//                .build();
//        client.send(subscribersRequest, HttpResponse.BodyHandlers.ofString());

        return null;
    }

    public static Subscriber[] parseSubscriberJson(String json) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new JavaTimeModule());
//        objectMapper.readValue(someJson, WhateverClassWeWantReturned.class);
        return null;
    }

}
