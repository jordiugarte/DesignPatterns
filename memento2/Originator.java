package ejercicios3.memento2;

public class Originator {
    private Tesis state;


    public Tesis getState() {
        return state;
    }

    public void setState(Tesis state) {
        System.out.println("Set ----> Object -----");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Object  -----");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore --- > Object  ");
        this.state.showData();
    }

}
