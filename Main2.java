package esercizio_2;

public class Main2 {

	

	 public static void main(String[] args) {

	        
	        Studente studente = new Studente("Simone", "Di Fede", "S12345");
	        Professore professore = new Professore("Giulia", "Rosso", "Matematica");
	        Persona personaGenerica = new Persona("Lucio", "Testa");

	        
	        Persona[] persone = new Persona[3];
	        persone[0] = studente;
	        persone[1] = professore;
	        persone[2] = personaGenerica;

	        
	        for (Persona p : persone) {
	            p.presentati();
	        }
	    }
	}

