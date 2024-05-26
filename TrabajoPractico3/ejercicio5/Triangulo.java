package TrabajoPractico3.ejercicio5;

public class Triangulo extends Shape {
    private double base;
    private double altura;

    public Triangulo(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    // 3 metodos que se sobreescriben
    @Override
    public void dibujar() {
        System.out.println("Dibujando el triangulo, la base es: " + base + " y altura: " + altura);
    }

    @Override
    public void redimensionar(double factorEscala) {
        base *= factorEscala;
        altura *= factorEscala;
        System.out.println("Redimensionando el triángulo, la nueva base es:  " + base + " y su nueva altura es: " + altura);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo, posicion nueva: (" + x + ", " + y + ")");
    }
}
