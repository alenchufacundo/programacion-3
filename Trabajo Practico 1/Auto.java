public class Auto {
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;

    public Auto(String color, String patente, int anio, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
    }

    public void encender() {
        System.out.println("El auto se incendio");
    }

    public void kilometrajeMayor() {
        if (km > 100000) {
            System.out.println("Color: " + color);
            System.out.println("Patente: " + patente);
            System.out.println("Anio: " + anio);
            System.out.println("Modelo: " + modelo);
            System.out.println("KM: " + km);
            System.out.println("Este auto es mayor a 100000km");
        }
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Blanco", "AC396TD", 2018, "Renault", 150000);
        auto1.kilometrajeMayor();
    }
}
