package com.sistemi.informativi.main;

import com.sistemi.informativi.enumeration.Giorno;
import com.sistemi.informativi.factory.EventoFactory;
import com.sistemi.informativi.factory.EventoFactoryImpl;

public class Main {
    public static void main(String[] args) {
        EventoFactory eventoFactory = new EventoFactoryImpl();
        Object eventoVenerdi =  eventoFactory.getEvento(Giorno.VENERDI);
        Object eventoSabato = eventoFactory.getEvento(Giorno.SABATO);
        Object eventoDomenica = eventoFactory.getEvento(Giorno.DOMENICA);
        System.out.println(eventoVenerdi);
        System.out.println(eventoSabato);
        System.out.println(eventoDomenica);
    }
}