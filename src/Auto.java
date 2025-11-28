public class Auto implements Runnable {

  private int numero;
  private double velocita;
  private double distanzaPercorsa;
  private boolean inBox;
  private Giudice podio;
  private double distanzaGara;

    public Auto(int numero, double velocita, double distanzaGara, Giudice podio) {
        this.numero = numero;
        this.velocita = velocita;
        this.distanzaGara = distanzaGara;
        this.podio = podio;
    }

    public void run() {

    }
    public void pitStop() {

    }
}

