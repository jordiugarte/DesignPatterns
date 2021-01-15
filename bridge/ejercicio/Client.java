package bridge.ejercicio;


public class Client {
    public static void main(String[] args) {
        Bolivianos bolivianos = new Bolivianos();
        Dolar dolar = new Dolar();
        Credito credito = new Credito(500);
        credito.cambiar(dolar);
    }
}