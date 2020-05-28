package ejercicio6;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Vivienda vivienda = new Vivienda();
                vivienda.montoInicial = 10000;
                vivienda.prestar();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero negocios = new Negocios();
                negocios.montoInicial = 5000;
                negocios.prestar();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero creditos = new Creditos();
                creditos.montoInicial = 5000;
                creditos.prestar();
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero financiamiento = new Financiamiento();
                financiamiento.montoInicial = 10000;
                financiamiento.prestar();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
