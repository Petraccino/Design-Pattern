package com.sistemi.informativi.bean;

public class Tecnologia {

    private String nome;
    private String ambito;

    public Tecnologia(String nome, String ambito) {
        this.nome = nome;
        this.ambito = ambito;
    }

    public Tecnologia() {

    }

    @Override
    public String toString() {
        return "Tecnologie{" +
                "nome='" + nome + '\'' +
                ", ambito='" + ambito + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
}
