import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroIngresado = scanner.nextInt();

        if (numeroIngresado % 2 == 0) {
            System.out.println("El número " + numeroIngresado + " es par.");
        } else {
            System.out.println("El número " + numeroIngresado + " es impar.");
        }

        scanner.close();
    }
}
