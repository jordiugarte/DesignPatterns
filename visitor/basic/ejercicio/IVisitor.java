package visitor.basic.ejercicio;

public interface IVisitor {
    void visit(Perro perro);
    void visit(Gato gato);
    void visit(Caballo caballo);
}
