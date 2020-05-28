package ejercicio3;

import ejercicio2.ContratoPrototype;

public class Client {
    public static void main(String[] args) {
       ColegialKit abc= new CreatorColegialKit().factoryMethodProduct();

       EscolarKit abdc = new CeatorEscolarKit().factoryMethodProduct();
    }
}
