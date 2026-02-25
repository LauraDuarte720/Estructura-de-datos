package trabajo.banco;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder

public class Cliente {
    private String id;
    private String nombre;
    private int turno;

}
