package com.sistemi.informativi.bean;

public class AziendaAcademy {

    private String ragioneSociale;
    private String partitaIVA;

    private double fondo;

    private Indirizzo indirizzo;

    public AziendaAcademy(String ragioneSociale, String partitaIVA, double fondo, Indirizzo indirizzo) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIVA = partitaIVA;
        this.fondo = fondo;
        this.indirizzo = indirizzo;
    }

    public AziendaAcademy() {

    }

    @Override
    public String toString() {
        return "AziendaAcademy{" + "ragioneSociale='" + ragioneSociale + '\'' + ", partitaIVA='" + partitaIVA + '\'' + ", fondo=" + fondo + '}';
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
}
