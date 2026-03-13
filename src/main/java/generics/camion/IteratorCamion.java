package generics.camion;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCamion<T> implements Iterator<T> {

    private int cursor= 0;
    private ArrayList<T> lista;

    public IteratorCamion(ArrayList<T> lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return cursor < lista.size();
    }

    @Override
    public T next() {
        T elemento = lista.get(cursor);
        cursor +=2;
        return elemento;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
