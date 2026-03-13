package preparcial.repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repositorio <T> implements Iterable<T>{

    private List<T> list;

    public Repositorio(){
        this.list = new ArrayList<>();
    }

    public void agregar(T elemento){
        list.add(elemento);
    }

    public T obtener(int indice){
        return list.get(indice);
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int cursor = list.size()-1;
            @Override
            public boolean hasNext() {
                return cursor !=-1;
            }

            @Override
            public T next() {
                T elem = list.get(cursor);
                cursor--;
                return elem;
            }
        };
    }
}
