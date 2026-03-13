package laboratorio.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
}


