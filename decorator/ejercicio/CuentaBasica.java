package decorator.ejercicio;

public class CuentaBasica implements Cuenta {
    private String propietario;
    private int monto;

    public CuentaBasica(String propietario, int monto) {
        this.propietario = propietario;
        this.monto = monto;
    }

    @Override
    public int getMonto() {
        return monto;
    }

    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        System.out.println("INFO> Utilizando cuenta bancaria con " + monto + "Bs de monto");
    }
}
