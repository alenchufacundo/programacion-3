import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del día (1-7): ");
        int day = scanner.nextInt();

        // camelcase
        String nombreDelDia;
        String tipoDeDia;

        switch (day) {
            case 1:
                nombreDelDia = "Lunes";
                break;
            case 2:
                nombreDelDia = "Martes";
                break;
            case 3:
                nombreDelDia = "Miércoles";
                break;
            case 4:
                nombreDelDia = "Jueves";
                break;
            case 5:
                nombreDelDia = "Viernes";
                break;
            case 6:
                nombreDelDia = "Sábado";
                break;
            case 7:
                nombreDelDia = "Domingo";
                break;
            default:
                nombreDelDia = "Valor inválido";
                break;
        }

        // saber si es fin de semana, dia laboral o nada.
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipoDeDia = "Día laborable";
                break;
            case 6:
            case 7:
                tipoDeDia = "Fin de semana";
                break;
            default:
                tipoDeDia = "No definido";
                break;
        }

        System.out.println("Nombre del día: " + nombreDelDia);
        System.out.println("Tipo de día: " + tipoDeDia);

        scanner.close();
    }
}
