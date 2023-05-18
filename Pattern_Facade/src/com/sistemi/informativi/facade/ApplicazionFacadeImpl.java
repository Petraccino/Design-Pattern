package com.sistemi.informativi.facade;

import com.sistemi.informativi.exception.DatiException;
import com.sistemi.informativi.service.mock.*;

public class ApplicazionFacadeImpl implements ApplicationFacade {

    @Override
    public void checkRecuperaAziendaAcademy() throws DatiException {
        AziendaAcademyServiceMock aziendaAcademyServiceMock = new AziendaAcademyServiceMockImpl();
        aziendaAcademyServiceMock.checkRecuperaAziendaAcademy();
        aziendaAcademyServiceMock= null;
    }

    @Override
    public void checkRecuperaDocenti() throws DatiException {
        DocenteServiceMock docenteServiceMock = new DocenteServiceMockImpl();
        docenteServiceMock.checkRecuperaDocenti();
        docenteServiceMock=null;
    }

    @Override
    public void checkRecuperaCorsi() throws DatiException {
        CorsoServiceMock corsiServiceMock = new CorsoServiceMockImpl();
        corsiServiceMock.checkRecuperaCorsi();
        corsiServiceMock=null;
    }
}
