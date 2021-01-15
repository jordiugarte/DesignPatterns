package bridge.ejercicio;

public class Ahorro implements Cuenta {

    private Moneda moneda;
    private double interes = 0.02;
    private double saldo;

    public Ahorro(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void cambiar(Moneda moneda) {
        System.out.println("Cuenta de Ahorro");
        this.moneda = moneda;
        this.moneda.monedaDeCambio();
        System.out.println("Saldo: " + saldo / moneda.getCambio() + "Bs");
    }

    @Override
    public void incrementar() {
        saldo += interes*saldo;
    }
}