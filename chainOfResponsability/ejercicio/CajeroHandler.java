package chainOfResponsability.ejercicio;

public class CajeroHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount, int prestamo) {
        if (amount < 0.25 * prestamo){
            System.out.println("El pago se realiza con el cajero");
        } else {
            this.next.criteriaHandler(amount, prestamo);
        }

    }
}
