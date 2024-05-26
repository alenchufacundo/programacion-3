package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

public class Vendedor extends Empleado {
    public Vendedor(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    @Override
    public void mostrarTareas() {
        System.out.println(getNombre() + " " + getApellido() + " realiza tareas de ventas.");
    }
}