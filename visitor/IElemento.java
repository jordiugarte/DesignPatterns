package visitor.basic.ejercicio;

public interface IElemento {
    String enfermedad();
    void accept(IVisitor visitor);
}
