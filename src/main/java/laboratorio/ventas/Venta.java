package laboratorio.ventas;

import java.util.HashMap;
import java.util.LinkedList;

public class Venta {

    private LinkedList<Producto> productoslist;
    private HashMap<String, Producto> productosHashMap;
    private HashMap<String, LinkedList<Producto>> productosHashMapCategoria;

    public Venta (){
        this.productoslist = new LinkedList<>();
        this.productosHashMap = new HashMap<>();
        this.productosHashMapCategoria = new HashMap<>();
    }

    //Agregar producto al inicio
    public void agregarProducto(Producto producto){
        productoslist.addFirst(producto);
        productosHashMap.put(producto.getCodigo(),producto);

        productosHashMapCategoria
                .computeIfAbsent(producto.getCategoria(), k -> new LinkedList<>())
                .addFirst(producto);
    }

    public void ordenarPrecio(){
        productoslist.sort(null);
    }

    public Producto buscarProducto(String codigo){
        return productosHashMap.get(codigo);
    }

    public LinkedList<Producto> fltrarPorCategoria(String categoria){
        return productosHashMapCategoria.get(categoria);
    }
}
