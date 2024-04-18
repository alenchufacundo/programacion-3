import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;

        while (true) {
            System.out.print("Introduce un número o 0 para salir: ");
            numeroIngresado = scanner.nextInt();

            if (numeroIngresado == 0) {
                break;
            }

            if (numeroIngresado > 0) {
                System.out.println(numeroIngresado + " es positivo.");
            } else if (numeroIngresado < 0) {
                System.out.println(numeroIngresado + " es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            if (numeroIngresado % 2 == 0) {
                System.out.println(numeroIngresado + " es par.");
            } else {
                System.out.println(numeroIngresado + " es impar.");
            }
        }

        scanner.close();
    }
}
