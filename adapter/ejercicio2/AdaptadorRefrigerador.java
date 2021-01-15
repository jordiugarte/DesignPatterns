package adapter.ejercicio2;

public class AdaptadorRefrigerador implements IArtefacto {
    private Refrigerador refrigerador;

    public AdaptadorRefrigerador(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }

    @Override
    public int getTiempo() {
        return refrigerador.getTiempoDeGarantia();
    }

    @Override
    public void precio() {
        refrigerador.costo();
    }
}
