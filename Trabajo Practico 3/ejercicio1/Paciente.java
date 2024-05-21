// Clase Paciente
class Paciente {
    private String nombre;
    private String apellido;
    private String dni;

    public Paciente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Paciente() {

    }

    public String getNombre() {
        return nombre;
    }

    public Paciente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Paciente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Paciente setDni(String dni) {
        this.dni = dni;
        return this;
    }

}