package ejercicio5;

public class Pizza {
    String masa;
    String salsa;
    String tipoQueso;

    public Pizza(){

    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void showData(){
        System.out.println("----------------");
        System.out.println("Masa: " + masa);
        System.out.println("Salsa: "+ salsa);
        System.out.println("Queso: "+ tipoQueso);

    }
}
