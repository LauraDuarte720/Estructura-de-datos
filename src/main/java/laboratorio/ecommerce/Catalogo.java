package laboratorio.ecommerce;

import generics.camion.Camion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Catalogo {

    private HashMap<String, Producto> productoHashMap;
    private TreeMap<Double, ArrayList<Producto>> doubleListTreeMap;

    public Catalogo(){
        this.productoHashMap = new HashMap<>();
        this.doubleListTreeMap = new TreeMap<>();
    }

    public Producto buscarProducto(String codigo){
        return productoHashMap.get(codigo);
    }

    public void mostrarProductosPrecio(){
        System.out.println(doubleListTreeMap.values().toString());
    }

    public void agregarProducto(Producto producto){
        productoHashMap.put(producto.getCodigo(), producto);
        doubleListTreeMap
                .computeIfAbsent(producto.getPrecio(), k -> new ArrayList<>())
                .add(producto);
    }
}
