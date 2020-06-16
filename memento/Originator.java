package _parcial2.memento;

public class Originator {
    private Documento state;
    private int indexState;
    private CareTaker careTaker;

    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        System.out.println("Set ----> Object -----");
        state.showData();
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("Guardar cambio");
        state.showData();
        return new Memento(this.state);
    }

    public void ctrlZ() {
        this.indexState--;
        Memento n = careTaker.getMemento(indexState);
        this.state = n.getState();
        System.out.println("Undo --- >");
        this.state.showData();
    }

    public void ctrlY() {
        this.indexState++;
        Memento n = careTaker.getMemento(indexState);
        this.state = n.getState();
        System.out.println("Redo --- >");
        this.state.showData();
    }

    public int getIndexState() {
        return indexState;
    }

    public void setIndexState(int indexState) {
        this.indexState = indexState;
    }

    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;
    }
}
