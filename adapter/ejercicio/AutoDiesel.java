package adapter.ejercicio;

public class AutoDiesel implements IAutoConvencional {
    private int combustible;

    public AutoDiesel(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public int getCombustible() {
        return combustible;
    }

    @Override
    public void cargarCombustible(int carga) {
        if (this.combustible + carga > 100) {
            combustible = 100;
        } else if (carga > 0) {
            combustible += carga;
        }
    }
}