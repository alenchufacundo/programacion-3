package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BaseEmpleados baseEmpleados = new BaseEmpleados();

        Empleado administradorA = new Administrativo(1, "Facundo", "Rios", 25, LocalDate.of(2024, 1, 10), 40000);
        Empleado administradorB = new Administrativo(2, "Fernando", "Gomez", 35, LocalDate.of(2004, 3, 24), 32000);

        Empleado maestranza1 = new OperarioMaestranza(3, "Ezequiel", "Martinez", 40, LocalDate.of(2017, 7, 21), 25000);
        Empleado maestranza2 = new OperarioMaestranza(4, "Carlos", "Darwin", 45, LocalDate.of(2019, 5, 5), 26000);

        Empleado vendedor1 = new Vendedor(5, "Juan", "Perez", 28, LocalDate.of(2021, 2, 25), 28000);
        Empleado vendedor2 = new Vendedor(6, "joaquin", "Hernandez", 33, LocalDate.of(2022, 11, 30), 29000);

        baseEmpleados.agregarEmpleado(administradorA);
        baseEmpleados.agregarEmpleado(administradorB);
        baseEmpleados.agregarEmpleado(maestranza1);
        baseEmpleados.agregarEmpleado(maestranza2);
        baseEmpleados.agregarEmpleado(vendedor1);
        baseEmpleados.agregarEmpleado(vendedor2);

        // devuelva la lista de empleados con todos sus datos.
        System.out.println("Lista de empleados:");
        baseEmpleados.mostrarTodosLosEmpleados();

        // printea todos los empleados con rol de administrativo.
        System.out.println("\nEmpleados administrativos:");
        baseEmpleados.mostrarEmpleadosPorTipo("administrativo");

        // elimina dos empleados
        System.out.println("\nEliminando dos empleados...");
        baseEmpleados.eliminarEmpleado(1);
        baseEmpleados.eliminarEmpleado(4);
        System.out.println("\nLista actualizada de empleados");
        baseEmpleados.mostrarTodosLosEmpleados();

        System.out.println("\nBuscando empleados...");
        // se le pasa por paraemtro el nombre a buscar.
        baseEmpleados.buscarEmpleado("joaquin");

        // cantidad de empleados total
        System.out.println("\nCantidad total de empleados total: ");
        baseEmpleados.verCantidadEmpleados();
    }
}