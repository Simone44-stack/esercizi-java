package es5;

import java.util.ArrayList;

public class GestioneUtenti {
    private ArrayList<Utente> utenti = new ArrayList<>();

    public void aggiungiUtente(Utente u) {
        utenti.add(u);
    }

    public void stampaPermessi() {
        for (Utente u : utenti) {
            u.stampaInfo();
            System.out.println("Permessi: " + u.getPermessi());
            System.out.println("-----------------------------");
        }
    }
}

