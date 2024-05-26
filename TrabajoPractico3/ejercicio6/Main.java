package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BaseEmpleados baseEmpleados = new BaseEmpleados();

        Empleado admin1 = new Administrativo(1, "Juan", "Perez", 30, LocalDate.of(2020, 1, 15), 30000);
        Empleado admin2 = new Administrativo(2, "Ana", "Gomez", 35, LocalDate.of(2018, 3, 10), 32000);

        Empleado maestranza1 = new OperarioMaestranza(3, "Luis", "Martinez", 40, LocalDate.of(2017, 7, 21), 25000);
        Empleado maestranza2 = new OperarioMaestranza(4, "Carlos", "Sanchez", 45, LocalDate.of(2019, 5, 5), 26000);

        Empleado vendedor1 = new Vendedor(5, "Maria", "Lopez", 28, LocalDate.of(2021, 2, 25), 28000);
        Empleado vendedor2 = new Vendedor(6, "Pedro", "Fernandez", 33, LocalDate.of(2022, 11, 30), 29000);

        baseEmpleados.agregarEmpleado(admin1);
        baseEmpleados.agregarEmpleado(admin2);
        baseEmpleados.agregarEmpleado(maestranza1);
        baseEmpleados.agregarEmpleado(maestranza2);
        baseEmpleados.agregarEmpleado(vendedor1);
        baseEmpleados.agregarEmpleado(vendedor2);

        System.out.println("Lista de todos los empleados:");
        baseEmpleados.mostrarTodosLosEmpleados();

        System.out.println("\nEmpleados administrativos:");
        baseEmpleados.mostrarEmpleadosPorTipo("administrativo");

        System.out.println("\nEliminando dos empleados:");
        baseEmpleados.eliminarEmpleado(1);
        baseEmpleados.eliminarEmpleado(4);

        System.out.println("\nLista de todos los empleados después de eliminar:");
        baseEmpleados.mostrarTodosLosEmpleados();

        System.out.println("\nBuscando empleado por nombre 'Maria':");
        baseEmpleados.buscarEmpleado("Maria");

        System.out.println("\nCantidad de empleados:");
        baseEmpleados.verCantidadEmpleados();
    }
}