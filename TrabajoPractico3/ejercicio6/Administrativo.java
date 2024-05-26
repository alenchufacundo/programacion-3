package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

// hereda de empleado
public class Administrativo extends Empleado {
    // hace el constructor
    public Administrativo(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    // sobresescribe el metodo padre mostrarTareas
    @Override
    public void mostrarTareas() {
        System.out.println(getNombre() + " " + getApellido() + " realiza tareas administrativas.");
    }
}
