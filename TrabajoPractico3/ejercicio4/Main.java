package TrabajoPractico3.ejercicio4;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();

        System.out.println("Componentes de la ventana:");
        System.out.println("Botones:");
        for (Boton boton : ventana.getBotones()) {
            System.out.println(boton.getEtiqueta());
        }

        System.out.println(
                "Barra de desplazamiento vertical: " + ventana.getbarraVertical().getOrientacion());
        System.out.println(
                "Barra de desplazamiento horizontal: " + ventana.getbarraHorizontal().getOrientacion());
        System.out.println("Marco de texto contenido: " + ventana.getMarcoTexto().getContenido());
    }
}
