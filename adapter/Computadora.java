package adapter.ejercicio2;

public class Computadora implements IArtefactoElectronico {
    private int tiempoDeVida;
    private int precio;

    public Computadora(int tiempoDeVida, int precio) {
        this.tiempoDeVida = tiempoDeVida;
        this.precio = precio;
    }

    @Override
    public int getTiempoDeVida() {
        return 0;
    }

    @Override
    public void precio() {
        System.out.println("El precio de la computadora es de " + precio + "$");
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
