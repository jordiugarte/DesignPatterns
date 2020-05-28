package ejercicio6;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Vivienda vivienda = new Vivienda();
                vivienda.prestar();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero negocios = new Negocios();
                negocios.prestar();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero creditos = new Creditos();
                creditos.prestar();
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero financiamiento = new Financiamiento();
                financiamiento.prestar();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
