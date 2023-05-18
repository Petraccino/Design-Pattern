package com.sistemi.informativi.bean;

import java.util.List;

public class Docente {

    private String nome;
    private String cognome;
    private int eta;
    private int anniEsperienza;
    private List<Competenza> competenze;

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", anniEsperienza=" + anniEsperienza +
                '}';
    }

    public Docente(String nome, String cognome, int eta, int anniEsperienza, List<Competenza> competenze) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.anniEsperienza = anniEsperienza;
        this.competenze = competenze;
    }

    public Docente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public List<Competenza> getCompetenze() {
        return competenze;
    }

    public void setCompetenze(List<Competenza> competenze) {
        this.competenze = competenze;
    }
}
