package animal;

public class Main {
    public static void main(String[] args) {
        Rifugio rifugio = new Rifugio();

        rifugio.aggiungiAnimale(new Cane("Fido"));
        rifugio.aggiungiAnimale(new Gatto("Micia"));
        rifugio.aggiungiAnimale(new Cane("Rex"));

        rifugio.stampaVersi();
    }
}

