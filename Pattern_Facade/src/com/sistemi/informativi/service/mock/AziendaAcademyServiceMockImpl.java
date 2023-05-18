package com.sistemi.informativi.service.mock;

import com.sistemi.informativi.bean.AziendaAcademy;
import com.sistemi.informativi.exception.DatiException;
import com.sistemi.informativi.repository.mock.AziendaAcademyRepositoryMock;
import com.sistemi.informativi.repository.mock.AziendaAcademyRepositoryMockImpl;

import java.util.ArrayList;
import java.util.List;

public class AziendaAcademyServiceMockImpl implements AziendaAcademyServiceMock {
    @Override
    public void checkRecuperaAziendaAcademy() throws DatiException {
        AziendaAcademyRepositoryMock aziendaAcademyRepositoryMock = new AziendaAcademyRepositoryMockImpl();
        List<AziendaAcademy> listAziendeAcademy = aziendaAcademyRepositoryMock.recuperaAziendeAcademy();

        if (listAziendeAcademy != null && !listAziendeAcademy.isEmpty()) {
            System.out.println("Aziende Academy recuperate correttamente");
            listAziendeAcademy.forEach((azienda)-> System.out.println(azienda));
        } else {
            throw new DatiException();
        }
        aziendaAcademyRepositoryMock= null;
        listAziendeAcademy= null;
    }
}
