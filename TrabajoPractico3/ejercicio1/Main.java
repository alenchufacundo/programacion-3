import java.util.List;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacionInicial = new Habitacion(4);

        Paciente paciente1 = new Paciente("Facundo", "Rios", "123434534");
        Paciente paciente2 = new Paciente().setNombre("Juan").setApellido("Perz").setDni("3123123123");

        habitacionInicial.internarPaciente(paciente1);
        habitacionInicial.internarPaciente(paciente2);

        // lista de pacietnes internados
        List<Paciente> cantidadPacientes = habitacionInicial.getPacientesInternados();
        // recorre el array
        for (Paciente pac : cantidadPacientes) {
            System.out.println(pac.getNombre() + " " + pac.getApellido());
        }

        // da de alta el paciente
        habitacionInicial.altaPaciente(paciente1);

        System.out.println("Pacientes internados restantes");
        cantidadPacientes = habitacionInicial.getPacientesInternados();
        for (Paciente p : cantidadPacientes) {
            System.out.println(p.getNombre() + " " + p.getApellido());
        }

        // interno un nuevo paciente
        habitacionInicial.internarPaciente(paciente2);

    }
}
