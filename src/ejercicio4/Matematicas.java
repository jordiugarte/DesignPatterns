package ejercicio4;

public class Matematicas implements IMateria {
    private String profesor;
    private int duracion;
    private String tipo;
    private String materialAdicional;

    @Override
    public void crear() {

    }

    public Matematicas() {
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterialAdicional() {
        return materialAdicional;
    }

    public void setMaterialAdicional(String materialAdicional) {
        this.materialAdicional = materialAdicional;
    }
}
