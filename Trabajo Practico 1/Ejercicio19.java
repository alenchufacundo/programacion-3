import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese palabras:");

        String palabra;
        String concatenacion = "";

        while (true) {
            palabra = scanner.nextLine();

            // comprobacion
            // si la longitud de la cadena es cero, salimos del bucle
            if (palabra.length() == 0) {
                break;
            }

            concatenacion += palabra + " "; // Concatenamos la palabra a la cadena de concatenación
        }

        System.out.println("La union de las palabras ingresadas es:");
        System.out.println(concatenacion);

        scanner.close();
    }
}
