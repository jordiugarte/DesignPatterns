package ejercicio2;

public class ContratoPrototype implements IContrato {
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean mercadoBiometrico;
    private String mercadoHoraDeEntrada;
    private String mercadoHoraDeSalida;
    private String nombre;
    private String apellido;

    public ContratoPrototype() {

    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean getCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean getMercadoBiometrico() {
        return mercadoBiometrico;
    }

    public void setMercadoBiometrico(boolean mercadoBiometrico) {
        this.mercadoBiometrico = mercadoBiometrico;
    }

    public String getMercadoHoraDeEntrada() {
        return mercadoHoraDeEntrada;
    }

    public void setMercadoHoraDeEntrada(String mercadoHoraDeEntrada) {
        this.mercadoHoraDeEntrada = mercadoHoraDeEntrada;
    }

    public String getMercadoHoraDeSalida() {
        return mercadoHoraDeSalida;
    }

    public void setMercadoHoraDeSalida(String mercadoHoraDeSalida) {
        this.mercadoHoraDeSalida = mercadoHoraDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        ContratoPrototype cloneObject = new ContratoPrototype();
        cloneObject.setAccesoPlataforma(this.accesoPlataforma);
        cloneObject.setApellido(this.apellido);
        cloneObject.setCargaHoraria(this.cargaHoraria);
        cloneObject.setCursoEducacionSuperior(this.cursoEducacionSuperior);
        cloneObject.setMercadoBiometrico(this.mercadoBiometrico);
        cloneObject.setMercadoHoraDeEntrada(this.mercadoHoraDeEntrada);
        cloneObject.setMercadoHoraDeSalida(this.mercadoHoraDeSalida);
        cloneObject.setNombre(this.nombre);

        return cloneObject;
    }

    @Override
    public void show() {
        System.out.println("------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Curso Educacion superior: " + cursoEducacionSuperior);
        System.out.println("Mercado Biometrico: " + mercadoBiometrico);
        System.out.println("Mercado Hora de Entrada: " + mercadoHoraDeEntrada);
        System.out.println("Mercado Hora de Salida: " + mercadoHoraDeSalida);
        System.out.println("Curso Educacion Superior: " + cursoEducacionSuperior);
        System.out.println("Acceso plataforma: " + accesoPlataforma);
    }
}
