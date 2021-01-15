package chainOfResponsability.ejercicio;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.criteriaHandler(125, 500);
        organizador.criteriaHandler(250, 500);
        organizador.criteriaHandler(500, 500);
        organizador.criteriaHandler(600, 500);
    }
}
