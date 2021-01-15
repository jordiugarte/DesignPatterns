package composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> lista = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public void operation() {
        for (Component componente : lista) {
            componente.operation();
            setPrecio(getPrecio() + componente.getPrecio());
        }
        if (lista.get(0) instanceof Computadora || lista.get(0) instanceof Composite) {
            System.out.println("Precio[" + getNombre() + "]: " + getPrecio() + "$");
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }

    @Override
    public void add(Component component) {
        lista.add(component);
    }

    @Override
    public void remove(Component component) {
        lista.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(lista.get(position).getPrecio());
    }
}
