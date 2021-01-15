package decorator.ejercicio;

public class SeguroDeCuenta extends Decorator {
    private Cuenta componente;
    private int descuento;

    public SeguroDeCuenta(Cuenta componente) {
        super(componente);
        this.componente = componente;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void ejecutar() {
        super.ejecutar();
        System.out.println(">La cuenta tiene acceso a Banca por Internet:\n>Procesando transaccion de seguro");
        if (componente.getMonto() - descuento < 0) {
            System.out.println("    >[WARNING] Fondos insuficientes");
        } else {
            componente.setMonto(componente.getMonto() - descuento);
            System.out.println("    >[ACCEPTED] Se desconto " + descuento + "Bs de la cuenta");
        }
    }

}
