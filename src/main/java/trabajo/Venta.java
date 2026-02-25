package trabajo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class Venta {
    private String coidgo;
    private String nombre;
    private int cantidadVendida;
    private double valortotal;
    private int numeroRegistro;

}
