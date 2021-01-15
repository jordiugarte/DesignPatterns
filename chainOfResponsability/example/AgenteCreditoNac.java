package chainOfResponsability.example;

public class AgenteCreditoNac implements IHandler {

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
        System.out.println("Proceso Atendido por : Agente credito nac");
    }
}
