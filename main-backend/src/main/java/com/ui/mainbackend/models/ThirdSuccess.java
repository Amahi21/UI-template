package com.ui.mainbackend.models;

import java.security.SecureRandom;
import java.util.Base64;

public class FirdSuccess {

    private final String token;
    private final Long INN;
    private final Long Snils;
    private final Long passportSeries;
    private final Long passportNumber;
    private boolean successValidation;

    private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe


    public FirdSuccess(Long inn, Long snils, Long passportSeries, Long passportNumber) {
        INN = inn;
        Snils = snils;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.token = generateNewToken();
    }

    private static String generateNewToken() {
        byte[] randomBytes = new byte[24];
        secureRandom.nextBytes(randomBytes);
        return base64Encoder.encodeToString(randomBytes);
    }

    public

    public String getToken() {
        return token;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
