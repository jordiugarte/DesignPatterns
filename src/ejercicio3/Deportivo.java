package ejercicio3;

public class Deportivo {
    private int talla;
    private String color;
    private int nroPrendas;

    public Deportivo(int talla, String color, int nroPrendas) {
        this.talla = talla;
        this.color = color;
        this.nroPrendas = nroPrendas;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroPrendas() {
        return nroPrendas;
    }

    public void setNroPrendas(int nroPrendas) {
        this.nroPrendas = nroPrendas;
    }
}
