package ejercicio3;

import java.util.ArrayList;

public class CreatorColegialKit extends Creator {
    @Override
    public ColegialKit factoryMethodProduct() {
        ColegialKit colegialKit = new ColegialKit();
        ArrayList<Cuaderno> listaCuadernos = new ArrayList<>();
        listaCuadernos.add(new Cuaderno("Pequeno", 500));
        colegialKit.setCuadernos(listaCuadernos);
        colegialKit.setDeportivo(new Deportivo(20, "Rojo", 3));
        colegialKit.setMochila(new Mochila(6, 30));

        return colegialKit;
    }
}
