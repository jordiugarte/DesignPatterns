package chainOfResponsability.ejercicio;

public class EncargadoDePrestamosHandler implements IHandler {

    @Override
    public void setNext(IHandler handler) {

    }

    @Override
    public IHandler next() {
        return null;
    }

    @Override
    public void criteriaHandler(int monto, int prestamo) {
        if (monto > prestamo) {
            System.out.println("El monto es mayor al prestamo");
        } else {
            System.out.println("El encargado de prestamos devuelve todos los documentos al cliente");
        }
    }
}
