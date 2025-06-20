package esercizi_overload;

public class Main_2 {

	public static void main(String[] args) {
        Carrello carrello = new Carrello();

        carrello.aggiungiProdotto("Pane");
        carrello.aggiungiProdotto("Latte", 2);
        carrello.aggiungiProdotto("Uova", 12);

        carrello.stampaCarrello();
    }
	
	
}
