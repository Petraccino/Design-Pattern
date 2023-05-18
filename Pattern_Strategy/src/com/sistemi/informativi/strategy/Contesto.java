package com.sistemi.informativi.strategy;

public class Contesto {
    private Strategy strategy;

    public Contesto(Strategy strategy) {
        this.strategy = strategy;
        /*
        tale costrutturo verrà invocato tramite l'invoker
        detterà una strategia precesia, ovverro quale operazione dovrà essere fatta.
        Tramite il nome della classe rappresentante la strategia

        OperazioneSomma operazioneSomma= new OperazioneSomma();
        Esempio: Contesto contesto = new Contesto (operazioneSomma);

        Il costruttore riuscirà tramite l'indicazione dell'invocante a convertire
        la strategya dettata nella Figlio richisto, sostanzialmente il servizio richiesto.
         */
    }

    public void eseguiStrategia(double a, double b) {

        /*
        è il tipo dell'istanza strategy a "decidere" quale
        metodo preciso invocare, tra i figli di strategy, in uno dei quali ha assunto la forma

         */
        this.strategy.operazione(a, b);
    }
}
