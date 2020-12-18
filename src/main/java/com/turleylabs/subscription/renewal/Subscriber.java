package com.turleylabs.subscription.renewal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Subscriber {
    private String name;
    private String email;
    private LocalDate expirationDate;

    public Subscriber() {
    }

    public Subscriber(String name, String email, LocalDate expirationDate) {
        this.name = name;
        this.email = email;
        this.expirationDate = expirationDate;
    }

    public static List<Subscriber> findSubscribersExpiringSoon(LocalDate currentDate, Subscriber[] subscribers) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}
