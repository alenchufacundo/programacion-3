package TrabajoPractico3.ejercicio5;

//hereda de Shape
public class Circulo extends Shape {
    private double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    // 3 metodos que sobreescriben
    @Override
    public void dibujar() {
        System.out.println("Dibujando el círculo con un radio de:  " + radio);
    }

    @Override
    public void redimensionar(double factorEscala) {
        radio *= factorEscala;
        System.out.println("Redimensionando el círculo, el nuevo radio es: " + radio);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo el círculo a nueva posición: (" + x + ", " + y + ")");
    }
}
