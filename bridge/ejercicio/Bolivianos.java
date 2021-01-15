package bridge.ejercicio;

public class Bolivianos implements Moneda {
    String nombre = "Bolivianos";

    @Override
    public void monedaDeCambio() {
        System.out.println("Bolivianos");
    }

    @Override
    public double getCambio() {
        return 1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
