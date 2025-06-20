package esercizi_overload;

public class Main {
    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice();

        System.out.println("Somma int (2): " + calc.somma(5, 7));
        System.out.println("Somma int (3): " + calc.somma(1, 2, 3));
        System.out.println("Somma double: " + calc.somma(2.5, 3.7));
        System.out.println("Somma stringhe: " + calc.somma("Hello, ", "world!"));
    }
}

