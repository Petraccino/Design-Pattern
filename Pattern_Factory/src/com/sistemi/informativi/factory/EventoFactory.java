package com.sistemi.informativi.factory;

import com.sistemi.informativi.enumeration.Giorno;

public interface EventoFactory {
    public Object getEvento(Giorno giorno);

}
