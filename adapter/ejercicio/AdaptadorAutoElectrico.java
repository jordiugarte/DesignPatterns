package adapter.ejercicio;

public class AdaptadorAutoElectrico implements IAutoConvencional {
    private AutoElectrico autoElectrico;

    public AdaptadorAutoElectrico(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public int getCombustible() {
        return autoElectrico.getEstadoDeBateria();
    }

    @Override
    public void cargarCombustible(int carga) {
        autoElectrico.cargarBateria(carga);
    }
}
