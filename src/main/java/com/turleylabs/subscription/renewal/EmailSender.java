package com.turleylabs.subscription.renewal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;

public class EmailSender {
    public static String createEmailJson(List<Subscriber> subscribers) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValueAsString(aHashMap);
        return null;
    }

    public static void notifyPendingExpiration(List<Subscriber> subscribers) throws IOException, InterruptedException {
//        HttpClient httpClient = HttpClient.newHttpClient();
//
//        HttpRequest mailRequest = HttpRequest.newBuilder(URI.create(someUrl))
//                .POST(HttpRequest.BodyPublishers.ofString(someEmailJson))
//                .build();
//
//        httpClient.send(mailRequest, HttpResponse.BodyHandlers.ofString());
        }
}
