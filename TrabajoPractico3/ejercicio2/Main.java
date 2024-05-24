package TrabajoPractico3.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear un auto con su motor
        Auto auto = new Auto("AC396TD", "Renault", 2020, 123456, 3000, "Nafta");

        // Crear un motor solo
        Motor motor = new Motor(34234, 3500, "30");

        // Mostrar detalles del auto
        System.out.println("Detalles del Auto:");
        System.out.println("Patente: " + auto.getPatente());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Número de motor: " + auto.getMotor().getNumeroMotor());
        System.out.println("Kilometraje: " + auto.getMotor().getKilometraje());
        System.out.println("Cilindrada: " + auto.getMotor().getCilindrada());

        // Mostrar detalles del motor solo
        System.out.println("\nDetalles del Motor:");
        System.out.println("Número de motor: " + motor.getNumeroMotor());
        System.out.println("Kilometraje: " + motor.getKilometraje());
        System.out.println("Cilindrada: " + motor.getCilindrada());
    }
}
