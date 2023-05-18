package com.sistemi.informativi.bean;

public class Competenza {

    private String nome;
    private String tipologia;
    private int seniority;

    public Competenza(String nome, String tipologia, int seniority) {
        this.nome = nome;
        this.tipologia = tipologia;
        this.seniority = seniority;
    }

    public Competenza() {

    }

    @Override
    public String toString() {
        return "Competenza{" +
                "nome='" + nome + '\'' +
                ", tipologia='" + tipologia + '\'' +
                ", seniority=" + seniority +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
