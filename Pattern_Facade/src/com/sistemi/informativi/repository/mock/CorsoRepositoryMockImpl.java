package com.sistemi.informativi.repository.mock;

import com.sistemi.informativi.bean.Corso;
import com.sistemi.informativi.bean.Docente;
import com.sistemi.informativi.bean.Tecnologia;
import com.sistemi.informativi.bean.Competenza;

import java.util.ArrayList;
import java.util.List;

public class CorsoRepositoryMockImpl implements CorsoRepositoryMock {

    @Override
    public List<Corso> recuperaCorsi() {
        List<Corso> listaCorsi = new ArrayList<>();
        List<Tecnologia> listaTecnologie = new ArrayList<>();
        List<Competenza> listaCompetenze = new ArrayList<>();

        Tecnologia tecnologia1 = new Tecnologia("Java", "Software");
        Tecnologia tecnologia2 = new Tecnologia("Spring", "Software");
        Tecnologia tecnologia3 = new Tecnologia("HTML", "Front-End");

        listaTecnologie.add(tecnologia1);
        listaTecnologie.add(tecnologia2);
        listaTecnologie.add(tecnologia3);

        Competenza competenza1 = new Competenza("Salvatore Desiderio", "Front-End", 4);
        Competenza competenza2 = new Competenza("Marco Desiderio", "Back-End", 1);
        Competenza competenza3 = new Competenza("Salvatore Pastrillo", "Full-Stack", 10);

        listaCompetenze.add(competenza1);
        listaCompetenze.add(competenza2);
        listaCompetenze.add(competenza3);


        Docente docente1 = new Docente("Salvatore", "Desiderio", 47, 15, listaCompetenze);
        Docente docente2 = new Docente("Marco", "Pastrillo", 47, 15, listaCompetenze);
        Docente docente3 = new Docente("Luca", "Raimondi", 47, 15, listaCompetenze);

        Corso corso1 = new Corso("AB404", "Software Engeneer", listaTecnologie, docente1);
        Corso corso2 = new Corso("AX5763", "Sistemista", listaTecnologie, docente2);
        Corso corso3 = new Corso("AC506", "Web Develeper", listaTecnologie, docente3);

        listaCorsi.add(corso1);
        listaCorsi.add(corso2);
        listaCorsi.add(corso3);

        return listaCorsi;
    }
}
