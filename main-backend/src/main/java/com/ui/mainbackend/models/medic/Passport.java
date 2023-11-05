package com.ui.mainbackend.models.medic;

public class Passport implements ConnectInfo {
    private String key;
    private String seriesPassport;
    private String numberPassport;

    public Passport(String key) {
        this.key = key;
        this.seriesPassport = null;
        this.numberPassport = null;
    }

    public Passport(String key, String seriesPassport, String numberPassport) {
        this.key = key;
        this.seriesPassport = seriesPassport;
        this.numberPassport = numberPassport;
    }

    public String getSeriesPassport() {
        return seriesPassport;
    }

    public void setSeriesPassport(String seriesPassport) {
        this.seriesPassport = seriesPassport;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    @Override
    public String getKey() {
        return key;
    }
}
