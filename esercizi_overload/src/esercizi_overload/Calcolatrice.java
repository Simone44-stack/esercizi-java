package esercizi_overload;

public class Calcolatrice {

    // Somma di 2 interi
    public int somma(int a, int b) {
        return a + b;
    }

    // Somma di 3 interi
    public int somma(int a, int b, int c) {
        return a + b + c;
    }

    // Somma di 2 double
    public double somma(double a, double b) {
        return a + b;
    }

    // Concatenazione di 2 stringhe
    public String somma(String a, String b) {
        return a + b;
    }
}

