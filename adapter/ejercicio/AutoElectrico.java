package adapter.ejercicio;

public class AutoElectrico {
    int estadoDeBateria;

    public AutoElectrico(int estadoDeBateria) {
        this.estadoDeBateria = estadoDeBateria;
    }

    public int getEstadoDeBateria() {
        return estadoDeBateria;
    }

    public void cargarBateria(int carga) {
        if (this.estadoDeBateria + carga > 100) {
            estadoDeBateria = 100;
        } else {
            estadoDeBateria += carga;
        }
    }
}
