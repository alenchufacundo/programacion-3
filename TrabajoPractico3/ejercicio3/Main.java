package TrabajoPractico3.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear dormitorios
        Dormitorio[] dormitorios = {
                new Dormitorio(15, true, 2),
                new Dormitorio(10, false, 1)
        };

        // Crear baños
        Banio[] Banios = {
                new Banio(true, false),
                new Banio(false, true)
        };

        // Crear patio
        Patio patio = new Patio("fondo", 20);

        // Crear cocina
        Cocina cocina = new Cocina("a gas", 12);

        // Crear casa
        Casa casa = new Casa(dormitorios, Banios, patio, cocina);

        // Mostrar detalles de la casa
        System.out.println("Detalles de la casa:");
        System.out.println("Dormitorios:");
        for (Dormitorio dormitorio : casa.getDormitorios()) {
            System.out.println("Metros cuadrados: " + dormitorio.getMetrosCuadrados() +
                    ", Baño en suite: " + dormitorio.isBanioEnSuit() +
                    ", Cantidad de ventanas: " + dormitorio.getCantidadVentanas());
        }

        System.out.println("Baños:");
        for (Banio Banio : casa.getBanios()) {
            System.out.println("Bañera: " + Banio.hasBanera() +
                    ", Antebaño: " + Banio.hasAntebanio());
        }

        System.out.println("Patio:");
        System.out.println("Ubicación: " + casa.getPatio().getUbicacion() +
                ", Metros cuadrados: " + casa.getPatio().getMetrosCuadrados());

        System.out.println("Cocina:");
        System.out.println("Tipo de horno: " + casa.getCocina().getTipoHorno() +
                ", Metros cuadrados: " + casa.getCocina().getMetrosCuadrados());
    }
}