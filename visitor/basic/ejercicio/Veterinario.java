package visitor.basic.ejercicio;

import static visitor.basic.ejercicio.Constants.ENFERMEDAD1;
import static visitor.basic.ejercicio.Constants.ENFERMEDAD2;

public class Veterinario implements IVisitor {
    @Override
    public void visit(Perro perro) {
        System.out.print("Recetando cura a perro para tratar ");
        curar(perro.enfermedad());
    }

    @Override
    public void visit(Gato gato) {
        System.out.print("Recetando cura a gato para tratar ");
        curar(gato.enfermedad());
    }

    @Override
    public void visit(Caballo caballo) {
        System.out.print("Recetando cura a caballo para tratar ");
        curar(caballo.enfermedad());
    }

    private void curar(String enfermedad) {
        if (enfermedad.equals(ENFERMEDAD1)) {
            System.out.println("enfermedad 1");
        } else if (enfermedad.equals(ENFERMEDAD2)) {
            System.out.println("enfermedad 2");
        } else {
            System.out.println("enfermedad desconocida");
        }
    }
}
