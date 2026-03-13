package generics.tarea;

public class Main {

    public static void main(String[] args) {

        Leche leche = new Leche(2000);
        Carne carne = new Carne(4000);
        Carrito<Producto> carrito = new Carrito<>();
        carrito.agregarProducto(leche);
        carrito.agregarProducto(carne);

        System.out.println(carrito);

        System.out.println(carrito.obtenerMayorPrecio());

        System.out.println(carrito.calcularTotal());

    }
}
