package _parcial2.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setCareTaker(careTaker);

        Documento documento;

        documento = new Documento(1, "Version 1");
        originator.setState(documento);
        originator.setIndexState(documento.getID());
        careTaker.addMemento(documento.getID(), originator.createMemento());

        documento = new Documento(2, "Version 2");
        originator.setState(documento);
        originator.setIndexState(documento.getID());
        careTaker.addMemento(documento.getID(), originator.createMemento());

        documento = new Documento(3, "Version 3");
        originator.setState(documento);
        originator.setIndexState(documento.getID());
        careTaker.addMemento(documento.getID(), originator.createMemento());

        documento = new Documento(4, "Version 4");
        originator.setState(documento);
        originator.setIndexState(documento.getID());
        careTaker.addMemento(documento.getID(), originator.createMemento());

        originator.ctrlZ();
        originator.ctrlZ();
        originator.ctrlZ();
        originator.ctrlY();

    }
}
