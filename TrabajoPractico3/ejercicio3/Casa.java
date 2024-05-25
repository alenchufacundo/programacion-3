package TrabajoPractico3.ejercicio3;

public class Casa {
    private Dormitorio[] dormitorios;
    private Banio[] banios;
    private Patio patio;
    private Cocina cocina;

    public Casa(Dormitorio[] dormitorios, Banio[] banios, Patio patio, Cocina cocina) {
        this.dormitorios = dormitorios;
        this.banios = banios;
        this.patio = patio;
        this.cocina = cocina;
    }

    public Dormitorio[] getDormitorios() {
        return dormitorios;
    }

    public Banio[] getBanios() {
        return banios;
    }

    public Patio getPatio() {
        return patio;
    }

    public Cocina getCocina() {
        return cocina;
    }
}
