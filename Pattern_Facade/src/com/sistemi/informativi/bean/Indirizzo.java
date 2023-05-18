package com.sistemi.informativi.bean;

public class Indirizzo {
    private String via;
    private String cap;
    private String citta;
    private String nazione;


    public Indirizzo(String via, String cap, String citta, String nazione) {
        this.via = via;
        this.cap = cap;
        this.citta = citta;
        this.nazione = nazione;
    }

    public Indirizzo() {
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }
}
