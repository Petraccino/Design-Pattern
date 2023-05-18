package com.sistemi.informativi.service;

import com.sistemi.informativi.strategy.Strategy;

public class OperazioneMoltiplicazione implements Strategy {

    @Override
    public void operazione(double a, double b) {
        double m = a * b;
        System.out.println("Moltiplicazione: " + m);
    }
}
