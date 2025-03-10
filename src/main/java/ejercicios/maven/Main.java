package ejercicios.maven;


import java.util.List;

public class Main {

    Persona persona;

    public static void main(String[] args) {
        String json = "{\"nombre\":\"Ana\",\"edad\":25}";

        Persona persona = Persona.fromJson(json);
        System.out.println(persona);
        System.out.println("");
        //-----------------------------------------------------------------------
        String json2 = "[{\"nombre\":\"Juan\",\"edad\":30}, {\"nombre\":\"Pepe\",\"edad\":25}]";

        List<Persona> personas = Persona.fromJsonList(json2);

        for (Persona personaI : personas) {
            System.out.println(personaI);
        }
    }
}