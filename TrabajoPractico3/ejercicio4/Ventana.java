package TrabajoPractico3.ejercicio4;

public class Ventana {
    private Boton[] botones;
    private Barra barraVertical;
    private Barra barraHorizontal;
    private MarcoTexto marcoTexto;

    public Ventana() {
        
        // define 5 botones como array.
        botones = new Boton[5];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new Boton("Botón " + (i + 1));
        }

        //define las barras horizontal y vertical
        barraVertical = new Barra("vertical");
        barraHorizontal = new Barra("horizontal");

        // define el marco de texto con un contenido vacio
        marcoTexto = new MarcoTexto("");
    }

    //getterrs y setters
    public Boton[] getBotones() {
        return botones;
    }

    public Barra getbarraVertical() {
        return barraVertical;
    }

    public Barra getbarraHorizontal() {
        return barraHorizontal;
    }

    public MarcoTexto getMarcoTexto() {
        return marcoTexto;
    }
}
