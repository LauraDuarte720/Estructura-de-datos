package trabajo.ventas;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class Venta {
    private String coidgo;
    private String nombre;
    private int cantidadVendida;
    private double valortotal;
    private int numeroRegistro;

}
