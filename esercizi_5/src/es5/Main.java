package es5;

public class Main {
    public static void main(String[] args) {
        GestioneUtenti gestione = new GestioneUtenti();

        
        Utente admin1 = new Admin("admin1", "admin1@example.com");
        Utente admin2 = new Admin("admin2", "admin2@example.com");

        
        Utente cliente1 = new Cliente("cliente1", "cliente1@example.com");
        Utente cliente2 = new Cliente("cliente2", "cliente2@example.com");

        
        gestione.aggiungiUtente(admin1);
        gestione.aggiungiUtente(admin2);
        gestione.aggiungiUtente(cliente1);
        gestione.aggiungiUtente(cliente2);

        
        gestione.stampaPermessi();
    }
}

