package trabajo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class RepoVentaT {
    private LinkedHashMap<String, Venta> ventas;
    private int numeroRegistro;
    public RepoVentaT(){
        this.ventas = new LinkedHashMap<>();
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
        return (ArrayList<Venta>) ventas.values();
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
