package adapter.ejercicio2;

public class Client {

    public static void main(String[] args) {
        Televisor televisor = new Televisor(5, 800);
        Refrigerador refrigerador = new Refrigerador(12, 1000);
        Lavadora lavadora = new Lavadora(10, 900);

        Celular celular = new Celular(4, 500);
        Computadora computadora = new Computadora(12, 300);
        Tablet tablet = new Tablet(5, 600);

        AdaptadorLavadora adaptadorLavadora = new AdaptadorLavadora(lavadora);
        AdaptadorRefrigerador adaptadorRefrigerador = new AdaptadorRefrigerador(refrigerador);
        AdaptadorTelevisor adaptadorTelevisor = new AdaptadorTelevisor(televisor);

        celular.precio();
        computadora.precio();
        tablet.precio();
        adaptadorLavadora.precio();
        adaptadorRefrigerador.precio();
        adaptadorTelevisor.precio();
    }
}
