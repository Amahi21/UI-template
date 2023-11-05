package com.ui.mainbackend.models.medic.supportModels;

public class BirthInfoAddInfo {
    private String familyStatus;
    private String children;

    public  BirthInfoAddInfo() {
        this.familyStatus = null;
        this.children = null;
    }

    public BirthInfoAddInfo(String familyStatus, String children) {
        this.familyStatus = familyStatus;
        this.children = children;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }
}
