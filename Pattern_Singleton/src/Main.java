import com.sistemi.informativi.singleton.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = Persona.getInstance();
        persona.setEta(23);
        persona.setNome("Marco");
        persona.setCognome("Petraccini");
        System.out.println(persona);
        persona.setNome("Ludovico");
        System.out.println(persona);

    }
}