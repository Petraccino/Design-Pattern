package com.sistemi.informativi.singleton;

public class Persona {
    private static Persona instance;
    private String nome;
    private String cognome;

    public static Persona getInstance(){
        if (instance==null){
            instance = new Persona();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
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

    private int eta;

    private Persona() {
    }
}
