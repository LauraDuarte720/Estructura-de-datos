package generics.camion;

import java.util.*;

public class Camion<T extends Paquete> implements Iterable<T>{

    private ArrayList<T> paquetes = new ArrayList<>();

    public void agregarPaquete(T paquete){
        paquetes.add(paquete);
    }

    public T descargarPaquete(){
        T paqueteDescargado = null;
        if (paquetes.isEmpty()){
            throw new RuntimeException("No hay paquetes");
        }else{
            paqueteDescargado = paquetes.remove(paquetes.size()-1);
        }
        return paqueteDescargado;
    }


    @Override
    public Iterator<T> iterator() {

        return new IteratorCamion<>(paquetes);
    }

    public T obtenerMayorPesao(){
        return Collections.max(paquetes);
    }


}
