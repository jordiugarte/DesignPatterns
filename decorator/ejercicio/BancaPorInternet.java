package decorator.ejercicio;

public class BancaPorInternet extends Decorator {
    public BancaPorInternet(Cuenta componente) {
        super(componente);
    }
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void ejecutar() {
        super.ejecutar();
        System.out.println(">La cuenta tiene acceso a Banca por Internet");
        if (enable) {
            System.out.println("    >[WARNING] La banca por internet esta activada");
        } else {
            System.out.println("    >[WARNING] La banca por internet esta desactivada");
        }
    }

}
