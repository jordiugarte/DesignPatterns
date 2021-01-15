package chainOfResponsability.example;

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
    public void criteriaHandler(int amount) {

        AgenteCreditoLocal handlerConcrete1 = new AgenteCreditoLocal();
        AgenteCreditoSucursal handlerConcrete2 = new AgenteCreditoSucursal();
        AgenteCreditoDept handlerConcrete3 = new AgenteCreditoDept();
        AgenteCreditoNac handlerConcrete4 = new AgenteCreditoNac();

        this.setNext(handlerConcrete1);
        handlerConcrete1.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete3);
        handlerConcrete3.setNext(handlerConcrete4);

        this.next.criteriaHandler(amount);
    }
}
