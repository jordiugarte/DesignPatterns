package visitor.basic.ejercicio;

import static visitor.basic.ejercicio.Constants.ENFERMEDAD1;
import static visitor.basic.ejercicio.Constants.ENFERMEDAD2;

public class Client {

    public static void main(String[] args) {
        Perro perro = new Perro(ENFERMEDAD1);
        Gato gato = new Gato(ENFERMEDAD2);
        Caballo caballo = new Caballo(ENFERMEDAD2);

        Veterinario veterinario = new Veterinario();

        System.out.println("---------------------");
        perro.accept(veterinario);

        System.out.println("---------------------");
        gato.accept(veterinario);

        System.out.println("---------------------");
        caballo.accept(veterinario);
    }
}
