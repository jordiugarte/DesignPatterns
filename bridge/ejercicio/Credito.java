package bridge.ejercicio;

public class Credito implements Cuenta {

    Moneda moneda;
    private double saldo;

    public Credito(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void cambiar(Moneda moneda) {
        System.out.println("Cuenta de Credito");
        this.moneda = moneda;
        this.moneda.monedaDeCambio();
        System.out.println("Saldo: " + saldo / moneda.getCambio() + "Bs");
    }

    @Override
    public void incrementar() {
        saldo += 0;
    }
}
