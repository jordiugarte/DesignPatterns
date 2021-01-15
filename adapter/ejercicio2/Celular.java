package adapter.ejercicio2;

public class Celular implements IArtefactoElectronico {
    private int tiempoDeVida;
    private int precio;

    public Celular(int tiempoDeVida, int precio) {
        this.tiempoDeVida = tiempoDeVida;
        this.precio = precio;
    }

    @Override
    public int getTiempoDeVida() {
        return 0;
    }

    @Override
    public void precio() {
        System.out.println("El precio del celular es de " + precio + "$");
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