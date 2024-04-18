public class Persona {

    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    // Constructor que acepta nombre y apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = ' ';
        this.edad = 0;
        this.ciudad = "";
    }

    // Constructor completo
    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mayorDeEdad(int anio) {
        if (anio == 0) {
            System.out.println("no se ha ingresado una edad");
        }
        if (anio >= 18) {
            System.out.println("Es mayor edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public void mostrarDatos(int anio) {
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.sexo);
        System.out.println(this.edad);
        System.out.println(this.ciudad);
        this.mayorDeEdad(anio);
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Facundo", "Rios", 'M', 26, "Bahia Blanca");
        Persona persona2 = new Persona("Ezequiel", "Martinez");

        persona1.mostrarDatos(persona1.edad);
        // persona2.mostrarDatos(persona1.edad);

    }

}

