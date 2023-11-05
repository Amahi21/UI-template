package com.ui.mainbackend.models.medic;

import com.ui.mainbackend.models.medic.supportModels.Address;
import com.ui.mainbackend.models.medic.supportModels.PersonAddInfo;

import java.util.Base64;

public class Person implements ConnectInfo {
    private String key;
    private String firstName;
    private String middleName;
    private String lastName;

    private String snils;
    private Address address;
    private String email;
    private String phoneNumber;
    private boolean validation;
    private PersonAddInfo addInfo;

    public Person(String firstName, String middleName, String lastName, String snils) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.snils = snils;
        byte[] bigString =  (firstName + middleName + lastName + snils).getBytes();
        this.key = Base64.getEncoder().encodeToString(bigString);
        this.addInfo = new PersonAddInfo();
    }

    public Person(String firstName, String middleName, String lastName, String snils, Address address, String email, String phoneNumber, boolean validation, PersonAddInfo addInfo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.snils = snils;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.validation = validation;
        this.addInfo = addInfo;
        byte[] bigString =  (firstName + middleName + lastName + snils).getBytes();
        this.key = Base64.getEncoder().encodeToString(bigString);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public void setAddInfo(PersonAddInfo addInfo) {
        this.addInfo = addInfo;
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

    public String getSnils() {
        return snils;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isValidation() {
        return validation;
    }

    public PersonAddInfo getAddInfo() {
        return addInfo;
    }

    @Override
    public String getKey() {
        return key;
    }
}
