package animal;

import java.util.ArrayList;

public class Rifugio {
    private ArrayList<Animale> animali;

    public Rifugio() {
        animali = new ArrayList<>();
    }

    // Metodo per aggiungere un animale al rifugio
    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    // Metodo per stampare i versi di tutti gli animali
    public void stampaVersi() {
        for (Animale a : animali) {
            a.descrizione();      // Stampa il nome dell'animale
            a.emettiVerso();      // Stampa il verso specifico
        }
    }
}
