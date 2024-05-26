package TrabajoPractico3.ejercicio5;

public class Main {
    public static void main(String[] args) {
        // crea una objeto de lista de figuras
        ListaFiguras listaFiguras = new ListaFiguras();

        // instancia las 3 formas
        Shape circulo = new Circulo(0, 0, 5);
        Shape rectangulo = new Rectangulo(10, 10, 4, 6);
        Shape triangulo = new Triangulo(20, 20, 3, 4);

        // metodo para agregar a la lalista
        listaFiguras.agregarFigura(circulo);
        listaFiguras.agregarFigura(rectangulo);
        listaFiguras.agregarFigura(triangulo);

        // \n es un salto de (()linea)
        System.out.println("\nSe esta dibujando todas las figuras...");
        listaFiguras.dibujarTodas();

        System.out.println("\nRedimensionando todas las figuras:");
        listaFiguras.redimensionarTodas(2);

        System.out.println("\nMoviendo todas las figuras:");
        listaFiguras.moverTodas(5, 5);

        System.out.println("\nRedimensionando la figura en la posición 1:");
        listaFiguras.redimensionarEn(1, 0.5);

        System.out.println("\nMoviendo la figura en la posición 1:");
        listaFiguras.moverEn(1, -3, -3);

        System.out.println("\nCantidad de figuras en la lista:");
        System.out.println(listaFiguras.obtenerCantidadFiguras());

        System.out.println("\nInsertando una nueva figura en la posición 1:");

        // crea un nuevo circulo
        Shape nuevoCirculo = new Circulo(15, 15, 7);
        listaFiguras.insertarFiguraEn(1, nuevoCirculo);
        listaFiguras.dibujarTodas();

        System.out.println("\nQuitando la figura en la posición 2:");
        listaFiguras.quitarFiguraEn(2);
        listaFiguras.dibujarTodas();
    }
}
