package com.sistemi.informativi.bean;

public class ManifestazioneSportiva {
    private String sport;
    private String organizzatore;
    private float costoBiglietto;

    public ManifestazioneSportiva(String sport, String organizzatore, float costoBiglietto) {
        this.sport = sport;
        this.organizzatore = organizzatore;
        this.costoBiglietto = costoBiglietto;
    }

    public ManifestazioneSportiva() {
    }

    @Override
    public String toString() {
        return "ManifestazioneSportiva{" +
                "sport='" + sport + '\'' +
                ", organizzatore='" + organizzatore + '\'' +
                ", costoBiglietto=" + costoBiglietto +
                '}';
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getOrganizzatore() {
        return organizzatore;
    }

    public void setOrganizzatore(String organizzatore) {
        this.organizzatore = organizzatore;
    }

    public float getCostoBiglietto() {
        return costoBiglietto;
    }

    public void setCostoBiglietto(float costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
}
