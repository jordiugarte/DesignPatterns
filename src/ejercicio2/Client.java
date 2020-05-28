package ejercicio2;

public class Client {
    public static void main(String[] args) {
        ContratoPrototype contrato = new ContratoPrototype();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMercadoBiometrico(false);
        contrato.setMercadoHoraDeEntrada("8:00");
        contrato.setMercadoHoraDeSalida("18:00");

        ContratoPrototype contrato1 = (ContratoPrototype) contrato.clone();
        contrato1.setNombre("Faustino");
        contrato1.setApellido("Gutierrez");
        ContratoPrototype contrato2 = (ContratoPrototype) contrato.clone();
        contrato2.setNombre("Romel");
        contrato2.setApellido("Quinonez");
        ContratoPrototype contrato3 = (ContratoPrototype) contrato.clone();
        contrato3.setNombre("Andres");
        contrato3.setApellido("Prada");
        ContratoPrototype contrato4 = (ContratoPrototype) contrato.clone();
        contrato4.setNombre("Sebastian");
        contrato4.setApellido("Aguirre");
        ContratoPrototype contrato5 = (ContratoPrototype) contrato.clone();
        contrato5.setNombre("Estefania");
        contrato5.setApellido("Hurtado");
        ContratoPrototype contrato6 = (ContratoPrototype) contrato.clone();
        contrato6.setNombre("Valentina");
        contrato6.setApellido("Nunez");
        ContratoPrototype contrato7 = (ContratoPrototype) contrato.clone();
        contrato7.setNombre("Mauricio");
        contrato7.setApellido("Ayllon");
        ContratoPrototype contrato8 = (ContratoPrototype) contrato.clone();
        contrato8.setNombre("Pablo");
        contrato8.setApellido("Espana");
        ContratoPrototype contrato9 = (ContratoPrototype) contrato.clone();
        contrato9.setNombre("Belen");
        contrato9.setApellido("Iniguez");
        ContratoPrototype contrato10 = (ContratoPrototype) contrato.clone();
        contrato10.setNombre("Belen");
        contrato10.setApellido("Aranibar");
        ContratoPrototype contrato11 = (ContratoPrototype) contrato.clone();
        contrato11.setNombre("Patrick");
        contrato11.setApellido("Buckner");
        ContratoPrototype contrato12 = (ContratoPrototype) contrato.clone();
        contrato12.setNombre("Sergio");
        contrato12.setApellido("Laguna");
        ContratoPrototype contrato13 = (ContratoPrototype) contrato.clone();
        contrato13.setNombre("Adrian");
        contrato13.setApellido("Blanco");
        ContratoPrototype contrato14 = (ContratoPrototype) contrato.clone();
        contrato14.setNombre("Erick");
        contrato14.setApellido("Wantig");
        ContratoPrototype contrato15 = (ContratoPrototype) contrato.clone();
        contrato15.setNombre("Sergio");
        contrato15.setApellido("Jauregui");

        contrato1.show();
        contrato2.show();
        contrato3.show();
        contrato4.show();
        contrato5.show();
        contrato6.show();
        contrato7.show();
        contrato8.show();
        contrato9.show();
        contrato10.show();
        contrato11.show();
        contrato12.show();
        contrato13.show();
        contrato14.show();
        contrato15.show();
    }
}
