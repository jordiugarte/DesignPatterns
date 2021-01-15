package decorator.ejercicio;

import java.util.concurrent.ThreadLocalRandom;

public class Promocion extends Decorator {
    private Cuenta componente;

    public Promocion(Cuenta componente) {
        super(componente);
        this.componente = componente;
    }

    public void ejecutar() {
        super.ejecutar();
        System.out.println(">La cuenta tiene promocion");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        if (randomNum == 5) {
            componente.setMonto(componente.getMonto() * 2);
            System.out.println("    >[NOTIFICATION] Usted gano el sorteo, ahora tiene " + componente.getMonto() + "Bs en su cuenta");
        } else {
            System.out.println("    >[NOTIFICATION] Usted no gano el sorteo");
        }
    }

}
