package ejercicio1;

public class Cajero {
    private static Cajero instance = null;
    private int amount;
    private int codigo = 123;

    private Cajero() {
        amount = 500;
    }

    private synchronized static void makeInstance() {
        if (instance == null)
            instance = new Cajero();
    }

    public static Cajero getInstance() {
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void consultar(int codigo) {
        if (this.codigo == codigo) {
            System.out.println("Saldo: " + amount);
        }
    }
}
