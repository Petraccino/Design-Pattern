package com.sistemi.informativi.repository.mock;

import com.sistemi.informativi.bean.Competenza;
import com.sistemi.informativi.bean.Docente;

import java.util.ArrayList;
import java.util.List;

public class DocenteRepositoryMockImpl implements DocenteRepositoryMock {
    @Override
    public List<Docente> recuperaDocenti() {
        List<Docente> listaDocenti = new ArrayList<>();
        List<Competenza> listaCompetenze = new ArrayList<>();

        Competenza competenza1 = new Competenza("Salvatore Desiderio", "Front-End", 4);
        Competenza competenza2 = new Competenza("Marco Desiderio", "Back-End", 1);
        Competenza competenza3 = new Competenza("Salvatore Pastrillo", "Full-Stack", 10);

        listaCompetenze.add(competenza1);
        listaCompetenze.add(competenza2);
        listaCompetenze.add(competenza3);


        Docente docente1 = new Docente("Salvatore", "Desiderio", 47, 15, listaCompetenze);
        Docente docente2 = new Docente("Marco", "Pastrillo", 47, 15, listaCompetenze);
        Docente docente3 = new Docente("Luca", "Raimondi", 47, 15, listaCompetenze);

        listaDocenti.add(docente1);
        listaDocenti.add(docente2);
        listaDocenti.add(docente3);

        return listaDocenti;
    }
}
