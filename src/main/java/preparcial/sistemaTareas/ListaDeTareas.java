package preparcial.sistemaTareas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListaDeTareas <T extends Tarea>{

    private ArrayList<T> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTareas(T tarea){
        tareas.add(tarea);
    }

    public ArrayList<T> obtenerTareasPrioridad(int prioridad){
        ArrayList<T> tareasPrioridad = new ArrayList<>();
        for (T tarea: tareas){
            if (tarea.getPrioridad() == prioridad){
                tareasPrioridad.add(tarea);
            }
        }
        return tareasPrioridad;
    }

    public void ordenarFechaVencimiento(){
        Collections.sort(tareas);
    }
}
