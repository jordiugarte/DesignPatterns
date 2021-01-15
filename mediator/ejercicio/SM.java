package mediator.ejercicio;

public class SM extends Colleague {

    public SM(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Message received: '" + msg + "'");
    }
}
