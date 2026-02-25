package trabajo.ventas;

public class Main {

    public static void main(String[] args) {


        // ===== Crear ventas =====
        Venta v1 = Venta.builder()
                .coidgo("V003")
                .nombre("Laptop")
                .cantidadVendida(2)
                .valortotal(50000)
                .build();

        Venta v2 = Venta.builder()
                .coidgo("V001")
                .nombre("Mouse")
                .cantidadVendida(5)
                .valortotal(20000)
                .build();

        Venta v3 = Venta.builder()
                .coidgo("V002")
                .nombre("Teclado")
                .cantidadVendida(3)
                .valortotal(30000)
                .build();

        // ===== Repo HashMap =====
        System.out.println("===== HASHMAP =====");
        RepoVentaH repoH = new RepoVentaH();

        repoH.agregarVenta(v1);
        repoH.agregarVenta(v2);
        repoH.agregarVenta(v3);

        System.out.println("Ventas registradas:");
        repoH.obtenerVentas().forEach(System.out::println);

        System.out.println("\nOrdenadas por codigo:");
        repoH.obtenerVentasCodigoOrden().forEach(System.out::println);

        System.out.println("\nOrdenadas por registro:");
        repoH.obtenerVentasOrdenRegistros().forEach(System.out::println);


        // ===== Repo LinkedHashMap =====
        System.out.println("\n===== LINKEDHASHMAP =====");
        RepoVentaL repoL = new RepoVentaL();

        repoL.agregarVenta(v1);
        repoL.agregarVenta(v2);
        repoL.agregarVenta(v3);

        System.out.println("Ventas registradas (orden insercion):");
        repoL.obtenerVentas().forEach(System.out::println);

        System.out.println("\nOrdenadas por codigo:");
        repoL.obtenerVentasCodigoOrden().forEach(System.out::println);


        // ===== Repo T =====
        System.out.println("\n===== REPO T =====");
        RepoVentaT repoT = new RepoVentaT();

        repoT.agregarVenta(v1);
        repoT.agregarVenta(v2);
        repoT.agregarVenta(v3);

        System.out.println("Ventas registradas:");
        repoT.obtenerVentas().forEach(System.out::println);

        System.out.println("\nOrdenadas por numero de registro:");
        repoT.obtenerVentasOrdenRegistros().forEach(System.out::println);
    }
}