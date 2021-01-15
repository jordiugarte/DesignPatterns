package chainOfResponsability.ejercicio;

public class Organizador implements IHandler {
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

        CajeroHandler handlerConcrete1 = new CajeroHandler();
        AgenteHandler handlerConcrete2 = new AgenteHandler();
        SupervisorHandler handlerConcrete3 = new SupervisorHandler();
        EncargadoDePrestamosHandler handlerConcrete4 = new EncargadoDePrestamosHandler();

        this.setNext(handlerConcrete1);
        handlerConcrete1.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete3);
        handlerConcrete3.setNext(handlerConcrete4);

        this.next.criteriaHandler(amount, prestamo);
    }
}
