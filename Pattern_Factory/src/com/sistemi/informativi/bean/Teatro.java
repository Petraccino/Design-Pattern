package com.sistemi.informativi.bean;

public class Teatro {
    private String titolo;
    private String regista;
    private String attoreProtagonista;
    private float costoBiglietto;

    public Teatro(String titolo, String regista, String attoreProtagonista, float costoBiglietto) {
        this.titolo = titolo;
        this.regista = regista;
        this.attoreProtagonista = attoreProtagonista;
        this.costoBiglietto = costoBiglietto;
    }

    public Teatro() {
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "titolo='" + titolo + '\'' +
                ", regista='" + regista + '\'' +
                ", attoreProtagonista='" + attoreProtagonista + '\'' +
                ", costoBiglietto=" + costoBiglietto +
                '}';
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getAttoreProtagonista() {
        return attoreProtagonista;
    }

    public void setAttoreProtagonista(String attoreProtagonista) {
        this.attoreProtagonista = attoreProtagonista;
    }

    public float getCostoBiglietto() {
        return costoBiglietto;
    }

    public void setCostoBiglietto(float costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
}
