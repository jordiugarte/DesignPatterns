package bridge.ejercicio;

public class Dolar implements Moneda {
    private final double cambio = 6.92;
    String nombre = "Dolar";

    @Override
    public void monedaDeCambio() {
        System.out.println("Dolares");
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
