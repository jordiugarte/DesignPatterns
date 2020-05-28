package ejercicio5;

public class Director {
    private PizzaBuilder builder;

    public Pizza getBuilder() {
        return builder.getPizza();
    }

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public  void buildPizza(){
        builder.createPizza();
        builder.buildMasa();
        builder.buildQueso();
        builder.buildSalsa();
    }
}