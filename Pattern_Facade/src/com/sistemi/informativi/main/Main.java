package com.sistemi.informativi.main;

import com.sistemi.informativi.exception.DatiException;
import com.sistemi.informativi.facade.ApplicationFacade;
import com.sistemi.informativi.facade.ApplicazionFacadeImpl;

public class Main {
    public static void main(String[] args) throws DatiException {

        ApplicationFacade applicationFacade = new ApplicazionFacadeImpl();
        applicationFacade.checkRecuperaCorsi();
        applicationFacade.checkRecuperaDocenti();
        applicationFacade.checkRecuperaAziendaAcademy();


    }
}