import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letraIngresada = scanner.next().charAt(0);

        if (Character.isUpperCase(letraIngresada)) {
            System.out.println("El carácter '" + letraIngresada + "' es una letra mayúscula.");
        } else {
            System.out.println("El carácter '" + letraIngresada + "' no es una letra mayúscula.");
        }

        scanner.close();
    }
}
