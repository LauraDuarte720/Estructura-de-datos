package generics.tarea;

public class Leche implements Producto {

    private int precio;

    public Leche(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Leche{" +
                "precio=" + precio +
                '}';
    }
}
