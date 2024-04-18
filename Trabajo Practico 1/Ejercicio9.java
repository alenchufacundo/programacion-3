import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los tres lados del triángulo:");

        System.out.print("Lado a: ");
        int a = scanner.nextInt();

        System.out.print("Lado b: ");
        int b = scanner.nextInt();

        System.out.print("Lado c: ");
        int c = scanner.nextInt();

        if (esTriangulo(a, b, c)) {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " pueden formar un triángulo.");
        } else {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " no pueden formar un triángulo.");
        }

        scanner.close();
    }

    // verifica si es un triangulo
    public static boolean esTriangulo(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}
