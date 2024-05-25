package TrabajoPractico3.ejercicio3;

public class Dormitorio {
    private int metrosCuadrados;
    private boolean BanioEnSuit;
    private int cantidadVentanas;

    public Dormitorio(int metrosCuadrados, boolean BanioEnSuit, int cantidadVentanas) {
        this.metrosCuadrados = metrosCuadrados;
        this.BanioEnSuit = BanioEnSuit;
        this.cantidadVentanas = cantidadVentanas;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public boolean isBanioEnSuit() {
        return BanioEnSuit;
    }

    public int getCantidadVentanas() {
        return cantidadVentanas;
    }
}