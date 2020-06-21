package visitor.basic.ejercicio;

public class Caballo implements IElemento {
    private String enfermedad;

    public Caballo(String enfermedad) {
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
