package TrabajoPractico3.ejercicio5;

//hereda de shape.
public class Rectangulo extends Shape {
    private double ancho;
    private double alto;

    public Rectangulo(double x, double y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el rectángulo, el ancho es: " + ancho + " y el alto: " + alto);
    }

    @Override
    public void redimensionar(double factorEscala) {
        ancho *= factorEscala;
        alto *= factorEscala;
        System.out.println("Redimensionando el rectángulo, el nuevo ancho es: " + ancho + " y el nuevo alto es: " + alto);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo el rectángulo, la nueva posicion es: (" + x + ", " + y + ")");
    }
}