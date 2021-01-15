package mediator.ejercicio;

public class QA extends Colleague {

    public QA(Mediator mediator) {
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
