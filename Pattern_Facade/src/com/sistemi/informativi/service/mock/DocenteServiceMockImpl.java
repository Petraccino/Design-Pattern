package com.sistemi.informativi.service.mock;

import com.sistemi.informativi.bean.Docente;
import com.sistemi.informativi.exception.DatiException;
import com.sistemi.informativi.repository.mock.DocenteRepositoryMock;
import com.sistemi.informativi.repository.mock.DocenteRepositoryMockImpl;

import java.util.ArrayList;
import java.util.List;

public class DocenteServiceMockImpl implements DocenteServiceMock{
    @Override
    public void checkRecuperaDocenti() throws DatiException {
        List<Docente> listDocenti = new ArrayList<>();
        DocenteRepositoryMock docenteRepositoryMock = new DocenteRepositoryMockImpl();
        listDocenti = docenteRepositoryMock.recuperaDocenti();

        if (listDocenti != null && !listDocenti.isEmpty()) {
            System.out.println("Docenti recuperati correttamente");
            listDocenti.forEach((docenti)-> System.out.println(docenti));
        } else {
            throw new DatiException();
        }
        listDocenti= null;
        docenteRepositoryMock= null;
    }
}
