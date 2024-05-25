package TrabajoPractico3.ejercicio3;

public class Banio {
    private boolean banera;
    private boolean antebanio;

    public Banio(boolean banera, boolean antebanio) {
        this.banera = banera;
        this.antebanio = antebanio;
    }

    public boolean hasBanera() {
        return banera;
    }

    public boolean hasAntebanio() {
        return antebanio;
    }
}