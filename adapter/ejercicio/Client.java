package adapter.ejercicio;

public class Client {

    public static void main(String[] args) {

        AutoElectrico autoElectrico = new AutoElectrico(64);

        AutoDiesel autoDiesel = new AutoDiesel(80);
        AutoGasolina autoGasolina = new AutoGasolina(20);
        AutoEspecial autoEspecial = new AutoEspecial(70);
        AdaptadorAutoElectrico adaptadorAutoElectrico = new AdaptadorAutoElectrico(autoElectrico);

        autoElectrico.cargarBateria(10);
        adaptadorAutoElectrico.cargarCombustible(20);

        System.out.println("Combustible: Auto a diesel " + autoDiesel.getCombustible());
        System.out.println("Combustible: Auto a gasolina " + autoGasolina.getCombustible());
        System.out.println("Combustible: Auto a gasolina especial " + autoEspecial.getCombustible());
        System.out.println("Combustible: Auto electrico " + adaptadorAutoElectrico.getCombustible());
    }
}
