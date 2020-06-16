package _parcial2.memento;

public class Documento {
    private int ID;
    private String Contenido;

    public Documento(int ID, String contenido) {
        this.ID = ID;
        Contenido = contenido;
    }

    public void showData(){
        System.out.println("name : "+this.ID);
        System.out.println("state : "+this.Contenido);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }
}
