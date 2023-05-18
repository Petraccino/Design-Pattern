package com.sistemi.informativi.bean;

import java.util.List;

public class Corso {
    private String codice;
    private String titolo;
    private List<Tecnologia> tecnologia;

    private Docente docente;

    public Corso(String codice, String titolo, List<Tecnologia> tecnologia, Docente docente) {
        this.codice = codice;
        this.titolo = titolo;
        this.tecnologia = tecnologia;
        this.docente = docente;
    }

    public Corso() {

    }

    @Override
    public String toString() {
        return "Corso{" +
                "codice='" + codice + '\'' +
                ", titolo='" + titolo + '\'' +
                ", tecnologia=" + tecnologia +
                '}';
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<Tecnologia> getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(List<Tecnologia> tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
