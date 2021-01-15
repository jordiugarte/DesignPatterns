package adapter.ejercicio2;

public class Televisor implements IArtefactoDomestico {
    private int tiempoDeGarantia;
    private int costo;

    public Televisor(int tiempoDeGarantia, int costo) {
        this.tiempoDeGarantia = tiempoDeGarantia;
        this.costo = costo;
    }

    @Override
    public int getTiempoDeGarantia() {
        return 0;
    }

    @Override
    public void costo() {
        System.out.println("El precio del televisor es de " + costo + "$");
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
