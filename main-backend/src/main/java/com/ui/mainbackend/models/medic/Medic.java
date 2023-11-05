package com.ui.mainbackend.models.medic;

import java.util.ArrayList;

public class Medic implements ConnectInfo {
    private String key;
    private String dmsNumber;
    private String dmsExpirationDate;
    private String omsNumber;
    private ArrayList<String> healthStatus;


    public Medic(String key) {
        this.key = key;
        this.dmsNumber = null;
        this.dmsExpirationDate = null;
        this.omsNumber = null;
        this.healthStatus = new ArrayList<>();
    }

    public Medic(String key, String dmsNumber, String dmsExpirationDate, String omsNumber, ArrayList<String> healthStatus) {
        this.key = key;
        this.dmsNumber = dmsNumber;
        this.dmsExpirationDate = dmsExpirationDate;
        this.omsNumber = omsNumber;
        this.healthStatus = healthStatus;
    }

    public void addHealthStatus(String status) {
        this.healthStatus.add(status);
    }

    public void setHealthStatus(ArrayList<String> healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setDmsNumber(String dmsNumber) {
        this.dmsNumber = dmsNumber;
    }

    public void setDmsExpirationDate(String dmsExpirationDate) {
        this.dmsExpirationDate = dmsExpirationDate;
    }

    public void setOmsNumber(String omsNumber) {
        this.omsNumber = omsNumber;
    }

    public String getDmsNumber() {
        return dmsNumber;
    }

    public String getDmsExpirationDate() {
        return dmsExpirationDate;
    }

    public String getOmsNumber() {
        return omsNumber;
    }

    public ArrayList<String> getHealthStatus() {
        return healthStatus;
    }

    @Override
    public String getKey() {
        return key;
    }
}
