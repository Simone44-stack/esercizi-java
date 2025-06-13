package animal;

public abstract class Animale {
    protected String nome;

    // Costruttore
    public Animale(String nome) {
        this.nome = nome;
    }

    // Metodo astratto
    public abstract void emettiVerso();

    // Metodo concreto
    public void descrizione() {
        System.out.println("Sono un animale di nome " + nome);
    }
}
