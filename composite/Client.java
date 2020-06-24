package composite.ejercicio;

public class Client {
    public static void main (String [] args){
        Computadora computadora1 = new Computadora("computadora1");
        Computadora computadora2 = new Computadora("computadora2");
        Computadora computadora3 = new Computadora("computadora3");
        Computadora computadora4 = new Computadora("computadora4");
        Computadora computadora5 = new Computadora("computadora5");
        Computadora computadora6 = new Computadora("computadora6");
        Computadora computadora7 = new Computadora("computadora7");
        Computadora computadora8 = new Computadora("computadora8");
        Computadora computadora9 = new Computadora("computadora9");

        Composite laboratorio1 = new Composite("laboratorio1");
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);
        laboratorio1.add(computadora3);

        Composite laboratorio2 = new Composite("laboratorio2");
        laboratorio2.add(computadora4);
        laboratorio2.add(computadora5);
        laboratorio2.add(computadora6);

        Composite laboratorio3 = new Composite("laboratorio3");
        laboratorio3.add(computadora7);
        laboratorio3.add(computadora8);
        laboratorio3.add(computadora9);

        Composite contenedor = new Composite("contenedor");
        contenedor.add(laboratorio1);
        contenedor.add(laboratorio2);
        contenedor.add(laboratorio3);

        contenedor.operation();
    }
}
