import com.sistemi.informativi.builder.Spedizione;

public class Main {
    public static void main(String[] args) {

        //Un metodo
        Spedizione.SpedizioneBuilder spedizioneBuilder= new Spedizione.SpedizioneBuilder("Via della meccanica","Via venezia giulia");
        Spedizione spedizione = spedizioneBuilder.assicurazione("Alianz").prime(true).build();
        System.out.println(spedizione);

        //Migliore metodo per istanziare
        Spedizione spedizione1 = new Spedizione.SpedizioneBuilder("Roma","Rerona").build();
        System.out.println(spedizione1);


        Spedizione spedizione2 = new Spedizione.SpedizioneBuilder("Calabria","Vicenza").primeAssicurazione("Prima.it",false).build();
        System.out.println(spedizione2);

        Spedizione spedizione3 = new Spedizione.SpedizioneBuilder("Roma","Milano").prime(true).notPrime().build();
        System.out.println(spedizione3);

       /*
       L'oggetto spedizione da spedizione1 viene costruito nel seguente modo:
        viene invocato il costruttore di Spedizione al quale viene passato in input lo
        SpedizioneBuilder che si è occupato di costruire l'oggetto richiesto con
        il setting delle proprietà origine e destinazione.
        */

    }
}