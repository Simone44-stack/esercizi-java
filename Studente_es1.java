package esercizio_1;

public class Studente_es1 {
	
	String nome;
	String cognome;
	int annoNascita;
	
	
	public Studente_es1(String nome, String cognome, int annoNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}
	
	
	public void stampaScheda() {
        System.out.println(nome + " " + cognome + ", nato nel " + annoNascita);
    }
}

	
	


