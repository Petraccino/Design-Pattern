package com.sistemi.informativi.factory;

import com.sistemi.informativi.bean.Concerto;
import com.sistemi.informativi.bean.ManifestazioneSportiva;
import com.sistemi.informativi.bean.Teatro;
import com.sistemi.informativi.enumeration.Giorno;

public class EventoFactoryImpl implements EventoFactory {
    @Override
    public Object getEvento(Giorno giorno) {

        Object evento = null;
        if (giorno.equals(Giorno.VENERDI)) {
            evento = new Concerto("Ultimo", "2 ore", "Roma", 55.99f);
        } else if (giorno.equals(Giorno.SABATO)) {
            evento = new ManifestazioneSportiva("calcio", "Fifa", 17.90f);
        } else if (giorno.equals(Giorno.DOMENICA)) {
            evento = new Teatro("Frankenstein", "Adam Pool", "Frank Cappello", 80.00f);
        } else {
            return null;
        }

        return evento;
    }
}