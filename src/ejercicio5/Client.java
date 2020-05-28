package ejercicio5;

public class Client {

    public static void main (String []args){
        Director director = new Director();

        PizzaBuilder carnivora = new PizzaCarnivora();
        PizzaBuilder hawaiiana = new PizzaHawaiiana();

        director.setBuilder(carnivora);
        director.buildPizza();
        Pizza pizza1 = director.getBuilder();

        director.setBuilder(hawaiiana);
        director.buildPizza();
        Pizza pizza2 = director.getBuilder();

        pizza1.showData();
        pizza2.showData();

    }
}