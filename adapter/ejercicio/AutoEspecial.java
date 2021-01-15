package adapter.ejercicio;

public class AutoEspecial implements IAutoConvencional {
    private int combustible;

    public AutoEspecial(int combustible) {
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
