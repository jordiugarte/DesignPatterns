package _parcial2.memento;

import java.util.HashMap;

public class CareTaker {
    private HashMap<Integer, Memento> savedStates = new HashMap<>();

    public void addMemento(Integer s, Memento memento) {
        this.savedStates.put(s, memento);
    }

    public Memento getMemento(int s) {
        return this.savedStates.get(s);
    }
}