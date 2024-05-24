package TrabajoPractico3.ejercicio2;

public class Motor {
    private int numeroMotor;
    private int kilometraje;
    private String cilindrada;

    public Motor(int numeroMotor, int kilometraje, String cilindrada) {
        this.numeroMotor = numeroMotor;
        this.kilometraje = kilometraje;
        this.cilindrada = cilindrada;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getCilindrada() {
        return cilindrada;
    }
}