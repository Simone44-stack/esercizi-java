package esercizio_2;

public class Persona {

    String nome;
    String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void presentati() {
        System.out.println("Ciao, sono " + nome + " " + cognome);
    }

    @Override
    public String toString() {
        return "Persona: " + nome + " " + cognome;
    }
}
