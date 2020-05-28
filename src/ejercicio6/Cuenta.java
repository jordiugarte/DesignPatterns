package ejercicio6;

public class Cuenta {
    private static Cuenta instance = null;
    private int amount;

    private static void makeInstance(int amount) {
        if (instance == null) {
            instance = new Cuenta(10000);
        }
    }

    public Cuenta(int amount) {
        this.amount = amount;
    }

    public static Cuenta getInstance(int amount) {
        if (instance == null) {
            makeInstance(amount);
        }

        return instance;
    }

    public void prestar(int cantidad) {
        if (amount < cantidad) {
            System.out.println("No hay saldo suficiente");
        } else {
            amount -= cantidad;
            System.out.println("Se logro retirar: " + amount);
        }
        System.out.println("Saldo: " + amount);
    }
}
