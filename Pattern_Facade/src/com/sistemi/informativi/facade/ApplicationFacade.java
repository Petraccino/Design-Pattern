package com.sistemi.informativi.facade;

import com.sistemi.informativi.exception.DatiException;

public interface ApplicationFacade {
    public void checkRecuperaAziendaAcademy() throws DatiException;

    public void checkRecuperaDocenti() throws DatiException;

    public void checkRecuperaCorsi() throws DatiException;

    /*
    E' il così detto indice applicativo. Contiene tutte le operazioni di check
    implememtate nel service layer

    Ogni operazione di check è implementata in una classe Service dedicata ma tale interfaccia
    le firma tutte in maniera tale da esporsi come Single Point of Access ( implememtazione del Pattern Facade )
    al sistema esterno invocante (Main/CLient)

     */

}
