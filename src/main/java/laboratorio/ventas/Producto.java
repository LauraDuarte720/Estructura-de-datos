package laboratorio.ventas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto implements Comparable<Producto>{

    private String codigo;
    private int precio;
    private String categoria;

    @Override
    public int compareTo(Producto o) {
        return precio - o.getPrecio();
    }
}
