package esercizi_overload;

import java.util.ArrayList;

public class Carrello {
    private ArrayList<String> prodotti;

    public Carrello() {
        prodotti = new ArrayList<>();
    }

    // Overload 1: solo nome
    public void aggiungiProdotto(String nome) {
        prodotti.add(nome);
    }

    // Overload 2: nome + quantità
    public void aggiungiProdotto(String nome, int quantita) {
        prodotti.add(nome + " x" + quantita);
    }

    // Metodo per stampare il contenuto del carrello
    public void stampaCarrello() {
        System.out.println("Contenuto del carrello:");
        for (String prodotto : prodotti) {
            System.out.println("- " + prodotto);
        }
    }
}

