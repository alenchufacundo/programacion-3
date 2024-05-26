package TrabajoPractico3.ejercicio6;

import java.time.LocalDate;

public abstract class Empleado {
    // defino mis atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaIngreso;
    private double sueldo;

    // constructor con cada atributo
    public Empleado(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }

    // gettesr y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // metodo void que no retorna nada.
    public abstract void mostrarTareas();
}