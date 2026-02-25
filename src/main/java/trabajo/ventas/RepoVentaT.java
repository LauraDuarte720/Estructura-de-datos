package trabajo.ventas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class RepoVentaT {
    private TreeMap<String, Venta> ventas;
    private int numeroRegistro;
    public RepoVentaT(){
        this.ventas = new TreeMap<>();
        this.numeroRegistro = 0;
    }

    public void agregarVenta(Venta venta){
        venta.setNumeroRegistro(numeroRegistro);
        ventas.put(venta.getCoidgo(), venta);
        numeroRegistro ++;
    }

    public Venta obtenerVenta (String codigo){
        return ventas.get(codigo);
    }

    public ArrayList<Venta> obtenerVentas(){
        return new ArrayList<>(ventas.values());
    }

    public ArrayList<Venta> obtenerVentasCodigoOrden(){
        return obtenerVentas();
    }

    public ArrayList<Venta> obtenerVentasOrdenRegistros(){
        ArrayList<Venta> ventasOrdenadas = obtenerVentas();
        ventasOrdenadas.sort(Comparator.comparing(Venta::getNumeroRegistro));
        return ventasOrdenadas;
    }
}
