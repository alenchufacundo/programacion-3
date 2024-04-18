import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double millas;

        do {
            System.out.print("Ingresa las millas o 0 para salir): ");
            millas = scanner.nextDouble();

            if (millas != 0) {
                double kilometros = millas * 1.6093;
                // String.format es para formatear los valores en dos decimales antes de concatenarlo.
                System.out.println("El equivalente a " + String.format("%.2f", millas) + " millas son "
                        + String.format("%.2f", kilometros) + " kilómetros.");
            }
        } while (millas != 0);

        System.out.println("Fin");
        scanner.close();
    }
}
