package ejercicio5;

public class PizzaCarnivora extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Gruesa");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Bolognesa");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("Parmessano");
    }
}
