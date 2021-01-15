package visitor.basic.ejercicio;

public class Perro implements IElemento {
    private String enfermedad;

    public Perro(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public String enfermedad() {
        return enfermedad;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

}
