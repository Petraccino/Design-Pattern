package com.sistemi.informativi.main;

import com.sistemi.informativi.service.OperazioneMoltiplicazione;
import com.sistemi.informativi.service.OperazioneSomma;
import com.sistemi.informativi.service.OperazioneSottrazione;
import com.sistemi.informativi.strategy.Contesto;
import com.sistemi.informativi.strategy.Strategy;

public class Main {
    public static void main(String[] args) {
        // Figlio di Strategy
        Strategy operazioneSomma= new OperazioneSomma();
        // Come parametro gli assegniamo un filgio di Strategy.
        Contesto contesto = new Contesto (operazioneSomma);
        // Qui verrà invocato il metodo implementato nel metodo operazione
        contesto.eseguiStrategia(9.0,5.6);

        Strategy operazioneSottrazione = new OperazioneSottrazione();
        Contesto contestoDifferenza = new Contesto(operazioneSottrazione);
        contestoDifferenza.eseguiStrategia(8.4,7.32);

        Strategy operazioneMoltiplicazione = new OperazioneMoltiplicazione();
        Contesto contestoMoltiplicazione = new Contesto(operazioneMoltiplicazione);
        contestoMoltiplicazione.eseguiStrategia(4.8,2.999999);

    }
}