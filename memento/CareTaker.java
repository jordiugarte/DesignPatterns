package ejercicios3.memento;

import java.util.ArrayList;

public class CareTaker {
    private Originator originator;

    public CareTaker(Originator originator) {
        this.originator = originator;
    }

    private ArrayList<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.savedStates.add(memento);
        memento.getState().showData();
    }

    public Memento getMemento(int index) {
        return this.savedStates.get(index);
    }
}