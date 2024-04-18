import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los tres lados del triángulo:");

        System.out.print(" a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        if (esTriangulo(a, b, c)) {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " pueden formar un triángulo.");

            if (a == b && b == c) {
                System.out.println("es equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("es isósceles.");
            } else {
                System.out.println("es escaleno.");
            }
        } else {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " no pueden formar un triángulo.");
        }

        scanner.close();
    }

    public static boolean esTriangulo(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}
