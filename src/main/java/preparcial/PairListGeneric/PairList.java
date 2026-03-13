package preparcial.PairListGeneric;

import java.util.ArrayList;

public class PairList <T extends Pair<K,V>, K, V> {

    private ArrayList<T> pairs;

    public PairList() {
        this.pairs = new ArrayList<>();
    }

    public void agregarPar(T pair){
        pairs.add(pair);
    }

    public void eliminiarPar(K key){
        pairs.removeIf(pair -> pair.getKey().equals(key));

    }

    public ArrayList<T> obtenerPares(){
        return pairs;
    }
}
