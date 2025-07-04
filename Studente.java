package esercizio_2;

public class Studente extends Persona {

    String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Ciao, sono " + nome + " " + cognome + ", matricola: " + matricola);
    }

    @Override
    public String toString() {
        return "Studente: " + nome + " " + cognome + ", Matricola: " + matricola;
    }
}
