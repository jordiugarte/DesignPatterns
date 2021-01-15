package chainOfResponsability.example;

public class AgenteCreditoDept implements IHandler {

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
        if (amount >= 20000 && amount < 50000){
            System.out.println("Proceso Atendido por : Agente credito dept");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
