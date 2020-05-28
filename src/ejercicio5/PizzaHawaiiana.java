package ejercicio5;

public class PizzaHawaiiana extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Delgada");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("Mozzarella");
    }
}
