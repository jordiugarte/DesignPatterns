package chainOfResponsability.example;

public class AgenteCreditoLocal implements IHandler {

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
        if (amount <= 10000){
            System.out.println("Proceso Atendido por : Agente credito ocak");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
