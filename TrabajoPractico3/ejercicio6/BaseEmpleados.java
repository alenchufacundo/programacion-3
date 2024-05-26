package TrabajoPractico3.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class BaseEmpleados {
    private List<Empleado> empleados;

    public BaseEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
    }

    public void mostrarTodosLosEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido() + ", Fecha de ingreso: "
                    + empleado.getFechaIngreso());
        }
    }

    public void buscarEmpleado(String nombreEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombreEmpleado)) {
                System.out.println("ID: " + empleado.getId() + ", Nombre: " + empleado.getNombre() + ", Apellido: "
                        + empleado.getApellido() +
                        ", Edad: " + empleado.getEdad() + ", Fecha de ingreso: " + empleado.getFechaIngreso()
                        + ", Sueldo: " + empleado.getSueldo());
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    public void verCantidadEmpleados() {
        System.out.println("Cantidad de empleados: " + empleados.size());
    }

    public void mostrarEmpleadosPorTipo(String tipo) {
        for (Empleado empleado : empleados) {
            switch (tipo.toLowerCase()) {
                case "administrativo":
                    if (empleado instanceof Administrativo) {
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    }
                    break;
                case "maestranza":
                    if (empleado instanceof OperarioMaestranza) {
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    }
                    break;
                case "vendedor":
                    if (empleado instanceof Vendedor) {
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    }
                    break;
            }
        }
    }
}