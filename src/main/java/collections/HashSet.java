package collections;

import java.util.LinkedList;

public class HashSet<T> {

    private LinkedList<T>[] tabla;
    private int capacidad = 10;
    private int size = 0;

    @SuppressWarnings("unchecked") //Ignorar advertencia del compilador
    public HashSet() {
        tabla = new LinkedList[capacidad];
    }


    private int getIndice(T elemento) {
        int hash = elemento.hashCode();
        return Math.abs(hash % capacidad);
    }

    public boolean add(T elemento) {

        int indice = getIndice(elemento);

        if (tabla[indice] == null) {
            tabla[indice] = new LinkedList<>();
        }

        //Revisar duplicados usando el equals
        for (Object actual : tabla[indice]) {
            if (actual.equals(elemento)) {
                return false; // ya existe
            }
        }

        tabla[indice].add(elemento);
        size++;
        return true;
    }

    public boolean contains(T elemento) {

        int indice = getIndice(elemento);

        if (tabla[indice] == null) {
            return false;
        }

        for (T actual : tabla[indice]) {
            if (actual.equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(T elemento){
        int indice = getIndice(elemento);

        if (tabla[indice] == null){
            return false; //No existe ese elemento
        }

        for(T actual: tabla[indice]){
            if(actual.equals(elemento)){
                tabla[indice].remove(actual);
                size --;
                return true;
            }
        }

        return false;
    }

    public int size(){
        return size;
    }

}
