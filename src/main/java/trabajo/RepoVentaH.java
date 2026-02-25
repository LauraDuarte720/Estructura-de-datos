package trabajo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class RepoVentaH {
    private HashMap<String, Venta> ventas;
    private int numeroRegistro;
    public RepoVentaH(){
        this.ventas = new HashMap<>();
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
        ArrayList<Venta> ventasOrdenadas = obtenerVentas();
        ventasOrdenadas.sort(Comparator.comparing(Venta::getCoidgo));
        return ventasOrdenadas;
    }

    public ArrayList<Venta> obtenerVentasOrdenRegistros(){
        ArrayList<Venta> ventasOrdenadas = obtenerVentas();
        ventasOrdenadas.sort(Comparator.comparing(Venta::getNumeroRegistro));
        return ventasOrdenadas;
        }
    }



