import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FACTORIAL");
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;

        // Utilizamos un bucle for para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
