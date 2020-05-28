package ejercicio3;

import java.util.List;

public class ColegialKit implements IKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private List<Cuaderno> cuadernos;

    @Override
    public void crear() {

    }

    public ColegialKit() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public List<Cuaderno> getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(List cuadernos) {
        this.cuadernos = cuadernos;
    }
}
