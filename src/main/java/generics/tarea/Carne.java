package generics.tarea;

public class Carne implements Producto {

    private int precio;

    public Carne(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carne{" +
                "precio=" + precio +
                '}';
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
