package _parcial2.memento;

public class Memento {
    private Documento state;

    public Memento(Documento stateSaved) {
        this.state = stateSaved;
    }

    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        this.state = state;
    }
}
