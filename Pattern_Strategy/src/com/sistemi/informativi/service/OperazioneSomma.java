package com.sistemi.informativi.service;

import com.sistemi.informativi.strategy.Strategy;

public class OperazioneSomma implements Strategy {

    @Override
    public void operazione(double a, double b) {
        double s = a + b;
        System.out.println("Somma: "+s);
    }

}
