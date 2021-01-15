package adapter.ejercicio2;

public class AdaptadorLavadora implements IArtefacto {
    private Lavadora lavadora;

    public AdaptadorLavadora(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    @Override
    public int getTiempo() {
        return lavadora.getTiempoDeGarantia();
    }

    @Override
    public void precio() {
        lavadora.costo();
    }
}
