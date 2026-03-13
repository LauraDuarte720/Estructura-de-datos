package laboratorio.ventas;

import java.util.Random;

public class BenchmarkVentas {

    static final String[] CATEGORIAS = {"Electronica", "Ropa", "Hogar", "Juguetes", "Deportes"};
    static final Random RANDOM = new Random();

    static Producto productoAleatorio(int index) {
        String codigo = "COD-" + index;
        int precio = RANDOM.nextInt(100000) + 1000;
        String categoria = CATEGORIAS[RANDOM.nextInt(CATEGORIAS.length)];
        return new Producto(codigo, precio, categoria);
    }

    static long memoriaUsadaKB() {
        Runtime rt = Runtime.getRuntime();
        return (rt.totalMemory() - rt.freeMemory()) / 1024;
    }

    static void medirOperacion(String nombre, Runnable operacion) {
        System.gc();
        long memAntes  = memoriaUsadaKB();
        long inicio    = System.nanoTime();

        operacion.run();

        long tiempoMs  = (System.nanoTime() - inicio) / 1_000_000;
        long memDespues = memoriaUsadaKB();
        long difMem     = memDespues - memAntes;

        System.out.println("  [" + nombre + "]");
        System.out.println("    Tiempo de ejecucion : " + tiempoMs + " ms");
        System.out.println("    Memoria antes       : " + memAntes   + " KB");
        System.out.println("    Memoria despues     : " + memDespues + " KB");
        System.out.println("    Diferencia memoria  : " + (difMem >= 0 ? "+" : "") + difMem + " KB");
        System.out.println();
    }

    static void ejecutarPrueba(int n) {
        System.out.println("========================================");
        System.out.println("  Prueba con n = " + n + " productos");
        System.out.println("========================================");

        Venta venta = new Venta();

        // Preparar productos fuera de la medición
        Producto[] productosPreparados = new Producto[n];
        for (int i = 0; i < n; i++) {
            productosPreparados[i] = productoAleatorio(i);
        }

        // 1. Inserción al inicio
        medirOperacion("Insercion al inicio (" + n + " productos)", () -> {
            for (Producto p : productosPreparados) {
                venta.agregarProducto(p);
            }
        });

        // 2. Búsqueda por código
        int cantBusquedas = Math.min(n, 1000);
        int[] indices = new int[cantBusquedas];
        for (int i = 0; i < cantBusquedas; i++) indices[i] = RANDOM.nextInt(n);

        medirOperacion("Busqueda por codigo (" + cantBusquedas + " busquedas)", () -> {
            for (int idx : indices) {
                venta.buscarProducto("COD-" + idx);
            }
        });

        // 3. Ordenar por precio
        medirOperacion("Ordenar por precio", () -> {
            venta.ordenarPrecio();
        });

        // 4. Filtrar por categoría
        medirOperacion("Filtrar por categoria (" + CATEGORIAS.length + " categorias)", () -> {
            for (String cat : CATEGORIAS) {
                venta.fltrarPorCategoria(cat);
            }
        });

        System.out.println();
    }

    public static void main(String[] args) {
        int[] tamanios = {100, 1_000, 10_000, 100_000};

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   BENCHMARK — Plataforma Ventas Masivas  ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        for (int n : tamanios) {
            ejecutarPrueba(n);
        }

        System.out.println("========================================");
        System.out.println("  Benchmark finalizado");
        System.out.println("========================================");
    }
}