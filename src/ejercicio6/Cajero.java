package ejercicio6;

public abstract class Cajero {
    private int cantidad;
    private String tipo;
    public int montoInicial;

    public Cajero(int cantidad, String tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public void prestar() {
        System.out.println("Se requiere prestar la cantidad: " + cantidad + " para " + tipo);
        Cuenta.getInstance(montoInicial).prestar(cantidad);
    }
}
