package TrabajoPractico3.ejercicio3;

public class Cocina {
    private String tipoHorno; // "electrico" o "a gas"
    private int metrosCuadrados;

    public Cocina(String tipoHorno, int metrosCuadrados) {
        this.tipoHorno = tipoHorno;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipoHorno() {
        return tipoHorno;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
}