package decorator.ejercicio;

public class Decorator implements Cuenta {

    private Cuenta componente;

    public Decorator(Cuenta componente) {
        this.componente = componente;
    }

    @Override
    public void ejecutar() {
        this.componente.ejecutar();
    }

    @Override
    public int getMonto() {
        return componente.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        componente.setMonto(monto);
    }
}
