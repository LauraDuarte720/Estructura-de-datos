package generics.tarea;

import java.util.ArrayList;

public class Carrito <T extends Producto>{

    ArrayList<T> productos = new ArrayList<>();

    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public T obtenerMayorPrecio(){
        if (productos.isEmpty()){
            return null;
        }
        T mayor = productos.getFirst();
        for (T producto: productos){

            if (mayor.getPrecio() < producto.getPrecio()){
                mayor = producto;
            }
        }
        return mayor;
    }

    public int calcularTotal(){
        int total = 0;
        for (T producto: productos){
            total += producto.getPrecio();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
