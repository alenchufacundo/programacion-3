package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

// hereda de la clase empleado
public class OperarioMaestranza extends Empleado {
    public OperarioMaestranza(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    @Override
    public void mostrarTareas() {
        System.out.println(getNombre() + " " + getApellido() + " realiza tareas de maestranza.");
    }
}