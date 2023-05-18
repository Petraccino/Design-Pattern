package com.sistemi.informativi.service;

import com.sistemi.informativi.strategy.Strategy;

public class OperazioneSottrazione implements Strategy {

    public void operazione(double a, double b) {
        double s = a - b;
        System.out.println("Sottrazione: "+s);
    }
}
