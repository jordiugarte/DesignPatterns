package ejercicio1;

public class Persona {
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public void consultar(int codigo){
        Cajero.getInstance().consultar(codigo);
    }
}

