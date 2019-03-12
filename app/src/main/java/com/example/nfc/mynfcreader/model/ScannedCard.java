package com.example.nfc.mynfcreader.model;

public class ScannedCard {
    private String ScannedCardUid;

    public ScannedCard(String scannedCardUid) {
        ScannedCardUid = scannedCardUid;
    }

    public String getScannedCardUid() {
        return ScannedCardUid;
    }

    public void setScannedCardUid(String scannedCardUid) {
        ScannedCardUid = scannedCardUid;
    }
}
