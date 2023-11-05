package com.ui.mainbackend.models.medic;

import java.util.ArrayList;

public class Other implements ConnectInfo {
    private String key;
    private ArrayList<String> scannedDocuments;
    private String militaryID;
    private String registrationCertificate;
    private String lackOfSubstantiation;
    private boolean verificationOfTheReliability;

    public Other(String key) {
        this.key = key;
        this.scannedDocuments = new ArrayList<>();
        this.militaryID = null;
        this.registrationCertificate = null;
        this.lackOfSubstantiation = null;
        this.verificationOfTheReliability = false;
    }

    public Other(String key, ArrayList<String> scannedDocuments, String militaryID, String registrationCertificate, String lackOfSubstantiation, boolean verificationOfTheReliability) {
        this.key = key;
        this.scannedDocuments = scannedDocuments;
        this.militaryID = militaryID;
        this.registrationCertificate = registrationCertificate;
        this.lackOfSubstantiation = lackOfSubstantiation;
        this.verificationOfTheReliability = verificationOfTheReliability;
    }

    public void addScannedDocument(String pathScannedDocument) {
        this.scannedDocuments.add(pathScannedDocument);
    }

    public void setScannedDocuments(ArrayList<String> scannedDocuments) {
        this.scannedDocuments = scannedDocuments;
    }

    public void setMilitaryID(String militaryID) {
        this.militaryID = militaryID;
    }

    public void setRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    public void setLackOfSubstantiation(String lackOfSubstantiation) {
        this.lackOfSubstantiation = lackOfSubstantiation;
    }

    public void setVerificationOfTheReliability(boolean verificationOfTheReliability) {
        this.verificationOfTheReliability = verificationOfTheReliability;
    }

    public ArrayList<String> getScannedDocuments() {
        return scannedDocuments;
    }

    public String getMilitaryID() {
        return militaryID;
    }

    public String getRegistrationCertificate() {
        return registrationCertificate;
    }

    public String getLackOfSubstantiation() {
        return lackOfSubstantiation;
    }

    public boolean isVerificationOfTheReliability() {
        return verificationOfTheReliability;
    }

    @Override
    public String getKey() {
        return key;
    }
}
