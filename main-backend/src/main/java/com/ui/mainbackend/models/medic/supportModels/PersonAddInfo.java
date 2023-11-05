package com.ui.mainbackend.models.medic.supportModels;

public class PersonAddInfo {
    private boolean criminalRecord;
    private String intimateLife;
    private String race;
    private String hobby;

    public PersonAddInfo() {
        criminalRecord = false;
        intimateLife = null;
        race = null;
        hobby = null;
    }

    public PersonAddInfo(boolean criminalRecord, String intimateLife, String race, String hobby) {
        this.criminalRecord = criminalRecord;
        this.intimateLife = intimateLife;
        this.race = race;
        this.hobby = hobby;
    }

    public boolean isCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(boolean criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getIntimateLife() {
        return intimateLife;
    }

    public void setIntimateLife(String intimateLife) {
        this.intimateLife = intimateLife;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
