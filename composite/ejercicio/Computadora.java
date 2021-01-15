package composite.ejercicio;

public class Computadora extends Component {
    public Computadora(String nombre) {
        super(nombre);
        super.setPrecio(100);
    }

    @Override
    public void operation() {
        System.out.println("Precio[" + getNombre() + "]: "+ this.getPrecio() + "$");
    }

    @Override
    public void add(Component component) {
        System.out.println("Imposible");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Impoible");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Imposible");
    }
}
