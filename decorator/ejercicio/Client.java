package decorator.ejercicio;

public class Client {

    public static void main (String [] sada){
        Cuenta cuenta = new CuentaBasica("Carlos", 861684);
        System.out.println("--------------------------------");
        cuenta.ejecutar();

        BancaPorInternet bancaPorInternet = new BancaPorInternet(cuenta);
        bancaPorInternet.setEnable(true);
        cuenta = bancaPorInternet;

        SeguroDeCuenta seguroDeCuenta = new SeguroDeCuenta(cuenta);
        seguroDeCuenta.setDescuento(1000);
        cuenta = seguroDeCuenta;

        cuenta = new Promocion(cuenta);

        cuenta.ejecutar();
    }

}
