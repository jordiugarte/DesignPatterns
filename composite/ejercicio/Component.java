package composite.ejercicio;

abstract class Component {
    private int precio;
    private String nombre;

    public Component(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void operation();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void getChild(int position);

}
