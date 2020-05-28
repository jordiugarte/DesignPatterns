package ejercicio1;

public class Client {
    public static void main (String []args){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Jose = new Persona("jose");
                Jose.consultar(123);
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan = new Persona("juan");
                Juan.consultar(123);
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Pedro = new Persona("pedro");
                Pedro.consultar(123);
            }
        });

        thread.start();
        thread1.start();
        thread3.start();
    }
}
