package chainOfResponsability.ejercicio;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(int monto, int prestamo);   // nuestra peticion

}
