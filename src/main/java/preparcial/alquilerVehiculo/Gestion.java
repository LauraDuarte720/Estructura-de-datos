package preparcial.alquilerVehiculo;

import java.util.List;

public class Gestion <T extends Vehiculo>{

    public void Vehiculos(List<? extends Vehiculo> vehiculos){
        for (Vehiculo vehiculo: vehiculos){
            vehiculo.alquilar();
        }
    }



}
