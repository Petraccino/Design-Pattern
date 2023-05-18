package com.sistemi.informativi.service.mock;
import com.sistemi.informativi.bean.Corso;
import com.sistemi.informativi.exception.DatiException;
import com.sistemi.informativi.repository.mock.CorsoRepositoryMock;
import com.sistemi.informativi.repository.mock.CorsoRepositoryMockImpl;

import java.util.ArrayList;
import java.util.List;

public class CorsoServiceMockImpl implements CorsoServiceMock{

    @Override
    public void checkRecuperaCorsi() throws DatiException {
        CorsoRepositoryMock corsoRepositoryMock = new CorsoRepositoryMockImpl();
        List<Corso> listCorso = new ArrayList<>();
        listCorso = corsoRepositoryMock.recuperaCorsi();
        if (listCorso != null && !listCorso.isEmpty()) {
            System.out.println("Corsi recuperati correttamente");
            listCorso.forEach((corso)-> System.out.println(corso));
        } else {
            throw new DatiException();
        }
        listCorso= null;
        corsoRepositoryMock= null;
    }
}
