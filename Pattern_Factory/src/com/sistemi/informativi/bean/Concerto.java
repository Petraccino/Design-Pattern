package com.sistemi.informativi.bean;

public class Concerto {
    private String artista;
    private String durata;
    private String luogo;
    private float costoBiglietto;

    public Concerto(String artista, String durata, String luogo, float costoBiglietto) {
        this.artista = artista;
        this.durata = durata;
        this.luogo = luogo;
        this.costoBiglietto = costoBiglietto;
    }

    public Concerto() {
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "artista='" + artista + '\'' +
                ", durata='" + durata + '\'' +
                ", luogo='" + luogo + '\'' +
                ", costoBiglietto=" + costoBiglietto +
                '}';
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public double getCostoBiglietto() {
        return costoBiglietto;
    }

    public void setCostoBiglietto(float costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
}
