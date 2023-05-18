package com.sistemi.informativi.repository.mock;

import com.sistemi.informativi.bean.AziendaAcademy;
import com.sistemi.informativi.bean.Indirizzo;

import java.util.ArrayList;
import java.util.List;

public class AziendaAcademyRepositoryMockImpl implements AziendaAcademyRepositoryMock {

    @Override
    public List<AziendaAcademy> recuperaAziendeAcademy() {
        List<AziendaAcademy> aziendeAcademy = new ArrayList<>();

        Indirizzo indirizzoAzienda1 = new Indirizzo("via mario", "00012", "Roma", "Italia");
        AziendaAcademy aziendaAcademy1 = new AziendaAcademy("Azienda1", "partitaIva1", 145.320, indirizzoAzienda1);

        Indirizzo indirizzoAzienda2 = new Indirizzo("Via giovanni", "00013", "Guidonia", "Italia");
        AziendaAcademy aziendaAcademy2 = new AziendaAcademy("Azienda2", "partitaIva2", 28.90, indirizzoAzienda2);

        Indirizzo indirizzoAzienda3 = new Indirizzo("Via colombo", "00017", "Fonte Nuova", "Italia");
        AziendaAcademy aziendaAcademy3 = new AziendaAcademy("Azienda3", "partitaIva3", 149.09, indirizzoAzienda3);

        aziendeAcademy.add(aziendaAcademy1);
        aziendeAcademy.add(aziendaAcademy2);
        aziendeAcademy.add(aziendaAcademy3);

        return aziendeAcademy;
    }
}
