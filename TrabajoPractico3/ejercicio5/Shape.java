package TrabajoPractico3.ejercicio5;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 3 metodos abstracto generales
    public abstract void dibujar();

    public abstract void redimensionar(double factorEscala);

    public abstract void mover(double deltaX, double deltaY);
}