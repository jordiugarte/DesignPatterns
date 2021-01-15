package bridge.ejercicio;

public class Euro implements Moneda {
    private final double cambio = 7.75;
    String nombre = "Euro";

    @Override
    public void monedaDeCambio() {
        System.out.println("Euros");
    }

    @Override
    public double getCambio() {
        return cambio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
