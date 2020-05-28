package ejercicio3;

public class Mochila {
    private int nroBolsillos;
    private int tamano;

    public Mochila(int nroBolsillos, int tamano) {
        this.nroBolsillos = nroBolsillos;
        this.tamano = tamano;
    }

    public int getNroBolsillos() {
        return nroBolsillos;
    }

    public void setNroBolsillos(int nroBolsillos) {
        this.nroBolsillos = nroBolsillos;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
