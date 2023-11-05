package com.ui.mainbackend.models.medic;

import com.ui.mainbackend.models.medic.supportModels.BirthInfoAddInfo;

public class BirthInfo implements ConnectInfo {
    private String key;
    private String gender;
    private String birthdate;

    private BirthInfoAddInfo addInfo;

    public BirthInfo(String key) {
        this.key = key;
        this.gender = null;
        this.birthdate = null;
        this.addInfo = new BirthInfoAddInfo();
    }

    public BirthInfo(String key, String gender, String birthdate, BirthInfoAddInfo addInfo) {
        this.key = key;
        this.gender = gender;
        this.birthdate = birthdate;
        this.addInfo = addInfo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public BirthInfoAddInfo getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(BirthInfoAddInfo addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public String getKey() {
        return key;
    }
}
