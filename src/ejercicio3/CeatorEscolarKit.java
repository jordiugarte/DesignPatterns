package ejercicio3;

import java.util.ArrayList;

public class CeatorEscolarKit extends Creator{
    @Override
    public EscolarKit factoryMethodProduct() {
        EscolarKit escolarKit = new EscolarKit();
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Suspenso", "Vargas Llosa"));
        escolarKit.setLibros(listaLibros);
        escolarKit.setMochila(new Mochila(4, 20));
        escolarKit.setComputadora(new Computadora("HP", "Windows 10"));
        return escolarKit;
    }
}
