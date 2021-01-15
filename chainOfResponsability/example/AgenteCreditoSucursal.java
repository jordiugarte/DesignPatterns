package chainOfResponsability.example;

public class AgenteCreditoSucursal implements IHandler {

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
        if (amount >= 10000 && amount <= 20000){
            System.out.println("Proceso Atendio por : Agnte credito sucursal");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
