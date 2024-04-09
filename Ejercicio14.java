import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Introduce nmero A: ");
            a = scanner.nextInt();

            System.out.print("Introduce numero B (mayor que A): ");
            b = scanner.nextInt();

            if (a >= b) {
                System.out.println("Error: A debe ser menor que B. Introduce valores nuevamente.");
            }
        } while (a >= b);

        System.out.println("Números pares entre " + a + " y " + b + ":");

        // for para mostrfar los numeros pares entre a y el b
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i); 
            }
        }

        scanner.close();
    }
}
