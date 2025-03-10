package ejercicios.maven;


public class Main {

    Persona persona;

    public static void main(String[] args) {
        String json = "{\"nombre\":\"Ana\",\"edad\":25}";

        Persona persona = Persona.fromJson(json);
    }
}