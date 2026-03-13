package generics.camion;

public class Main {

    public static void main(String[] args) {

        // Crear camión
        Camion<Paquete> camion = new Camion<>();

        // Crear paquetes
        Paquete p1 = new Paquete("Ropa", 30.5);
        Paquete p2 = new Paquete("Electrodoméstico", 40.2);
        Paquete p3 = new Paquete("Zapatos", 15.9);


        // Agregar paquetes
        camion.agregarPaquete(p1);
        camion.agregarPaquete(p2);
        camion.agregarPaquete(p3);

        System.out.println("Paquetes agregados correctamente.");

        for(Paquete paquete: camion){
            System.out.println(paquete.toString());
        }


        // Descargar paquete
        System.out.println("Se descargó el paquete: " + camion.descargarPaquete());

        //Obtener Mayor
        System.out.println(camion.obtenerMayorPesao());

        System.out.println("Proceso finalizado.");



    }

    public static double pesoTotal(Camion<? extends Paquete> paquetes){
        double total = 0;

        for(Paquete p : paquetes){
            total += p.getPeso();
        }

        return total;
    }

}
