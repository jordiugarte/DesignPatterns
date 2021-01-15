package chainOfResponsability.ejercicio;

public class AgenteHandler implements IHandler {

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
        if (amount <= prestamo * 0.5){
            System.out.println("El pago se realiza con el agente de creditos, recibe los pagos y le ofrece refinanciar su prestamo");
        } else {
            this.next.criteriaHandler(amount, prestamo);
        }

    }
}
