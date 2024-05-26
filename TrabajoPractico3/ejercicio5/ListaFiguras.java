package TrabajoPractico3.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class ListaFiguras {
    //crea una lista
    private List<Shape> figuras;

    public ListaFiguras() {
        figuras = new ArrayList<>();
    }

    public void dibujarTodas() {
        for (Shape figura : figuras) {
            figura.dibujar();
        }
    }

    public void redimensionarTodas(double factorEscala) {
        for (Shape figura : figuras) {
            figura.redimensionar(factorEscala);
        }
    }

    public void moverTodas(double deltaX, double deltaY) {
        for (Shape figura : figuras) {
            figura.mover(deltaX, deltaY);
        }
    }

    public void redimensionarEn(int indice, double factorEscala) {
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).redimensionar(factorEscala);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void moverEn(int indice, double deltaX, double deltaY) {
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).mover(deltaX, deltaY);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void agregarFigura(Shape figura) {
        figuras.add(figura);
    }

    public void insertarFiguraEn(int indice, Shape figura) {
        if (indice >= 0 && indice <= figuras.size()) {
            figuras.add(indice, figura);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public int obtenerCantidadFiguras() {
        return figuras.size();
    }

    public void quitarFiguraEn(int indice) {
        if (indice >= 0 && indice < figuras.size()) {
            figuras.remove(indice);
        } else {
            System.out.println("error, fuera de rango.");
        }
    }
}