package bridge.ejercicio;

public class PlazoFijo implements Cuenta {

    private Moneda moneda;
    private double saldo;
    private double interes = 0.05;

    public PlazoFijo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void cambiar(Moneda moneda) {
        System.out.println("Cuenta de Plazo fijo");
        this.moneda = moneda;
        this.moneda.monedaDeCambio();
        System.out.println("Saldo: " + saldo / moneda.getCambio() + "Bs");
    }

    @Override
    public void incrementar() {
        saldo += interes * saldo;
    }
}
