package trabajo.ventas;

import java.util.*;

public class RepoVentaL {
    private LinkedHashMap<String, Venta> ventas;

    public RepoVentaL(){
        this.ventas = new LinkedHashMap<>();
    }

    public void agregarVenta(Venta venta){
        ventas.put(venta.getCoidgo(), venta);
    }

    public Venta obtenerVenta (String codigo){
        return ventas.get(codigo);
    }

    public ArrayList<Venta> obtenerVentas(){
        return new ArrayList<>(ventas.values());
    }

    public ArrayList<Venta> obtenerVentasCodigoOrden(){
        ArrayList<Venta> ventasOrdenadas = obtenerVentas();
        ventasOrdenadas.sort(Comparator.comparing(Venta::getCoidgo));
        return ventasOrdenadas;
    }

    public ArrayList<Venta> obtenerVentasOrdenRegistros(){
        return obtenerVentas();
    }
}
