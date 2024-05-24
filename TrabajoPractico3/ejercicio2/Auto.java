package TrabajoPractico3.ejercicio2;

public class Auto {
    private String patente;
    private String marca;
    private int modelo; // Año de fabricación
    private Motor motor;

    public Auto(String patente, String marca, int modelo, int numeroMotor, int kilometraje, String cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(numeroMotor, kilometraje, cilindrada);
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }
}
