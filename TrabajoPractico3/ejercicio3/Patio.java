package TrabajoPractico3.ejercicio3;

public class Patio {
    private String ubicacion;
    private int metrosCuadrados;

    public Patio(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
}
