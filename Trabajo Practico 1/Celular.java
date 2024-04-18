public class Celular {
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    // constructor por defecto
    public Celular() {

    }

    // constructor que acepta modelo y marca
    public Celular(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void realizarLlamada() {
        System.out.println("Llamando...");
    }

    public void cortarLlamada() {
        System.out.println("Llamada terminada");
    }

    public static void main(String[] args) {
        Celular celular = new Celular("13 pro MAX", "Iphone");
        celular.realizarLlamada();
        celular.cortarLlamada();
    }

}
