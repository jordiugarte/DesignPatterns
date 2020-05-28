package ejercicio5;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return this.pizza;
    }

    public void createPizza() {
        pizza = new Pizza();
    }

    public abstract void buildMasa();

    public abstract void buildSalsa();

    public abstract void buildQueso();
}
