import java.util.Scanner;

public class Ejercicio15v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resultado;
        int numeroIngresado;

        do {
            System.out.print("Introduce un número: ");
            numeroIngresado = scanner.nextInt();

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

            System.out.print("Desea introducir más números? (S/N): ");
            resultado = scanner.next().charAt(0);
        } while (resultado != 'N' && resultado != 'n');

        scanner.close();
    }
}
