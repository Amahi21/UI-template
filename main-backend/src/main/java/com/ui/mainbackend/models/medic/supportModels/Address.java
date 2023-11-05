package com.ui.mainbackend.models.medic.supportModels;

public class Address {
    private String country;
    private String city;
    private String street;
    private Integer home;
    private Integer floor;
    private Integer room;

    public Address() {
        country = null;
        city = null;
        street = null;
        home = null;
        floor = null;
        room = null;
    }

    public Address(String country, String city, String street, Integer home, Integer floor, Integer room) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.home = home;
        this.floor = floor;
        this.room = room;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
