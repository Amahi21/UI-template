package com.ui.mainbackend.models.medic;

public class WorkInfo implements ConnectInfo {
    private String key;

    private String company;
    private String position;
    private String education;

    public WorkInfo(String key) {
        this.key = key;
        this.company = null;
        this.position = null;
        this.education = null;
    }

    public WorkInfo(String key, String company, String position, String education) {
        this.key = key;
        this.company = company;
        this.position = position;
        this.education = education;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String getKey() {
        return key;
    }
}
