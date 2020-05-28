package ejercicio3;

import java.util.List;

public class EscolarKit implements IKit{
    private Mochila mochila;
    private List<Libro> libros;
    private Computadora computadora;

    @Override
    public void crear() {

    }

    public EscolarKit() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
