package TrabajoPractico3.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class BaseEmpleados {
    private List<Empleado> empleados;

    // constructor que crea un arraylist
    public BaseEmpleados() {
        empleados = new ArrayList<>();
    }

    // ABM
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        for (int i = 0; i < empleados.size(); i++) {
            // obtiene el id y lo compara.
            if (empleados.get(i).getId() == id) {
                empleados.remove(i);
                break;
            }
        }
    }

    public void mostrarTodosLosEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido() + ", fecha de ingreso: "
                    + empleado.getFechaIngreso());
        }
    }

    public void buscarEmpleado(String nombreEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombreEmpleado)) {
                System.out.println("ID: " + empleado.getId() + ", nobmre: " + empleado.getNombre() + ", apellido: "
                        + empleado.getApellido() +
                        ", edad: " + empleado.getEdad() + ", fecha de ingreso: " + empleado.getFechaIngreso()
                        + ", sueldo: " + empleado.getSueldo());
                return;
            }
        }
        System.out.println("El empleado no ha sido encontrado.");
    }

    public void verCantidadEmpleados() {
        //deterimna la long de la lista.
        System.out.println("La cantidad de empleados es: " + empleados.size());
    }

    public void mostrarEmpleadosPorTipo(String tipo) {
        for (Empleado empleado : empleados) {
            // SWITCH
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