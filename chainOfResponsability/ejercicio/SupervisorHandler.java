package chainOfResponsability.ejercicio;

public class SupervisorHandler implements IHandler {

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
        if (amount < prestamo){
            System.out.println("Proceso atendido por el supervisor");
        } else {
            next.criteriaHandler(amount, prestamo);
        }
    }
}
