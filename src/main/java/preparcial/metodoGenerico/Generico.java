package preparcial.metodoGenerico;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Generico {

    public static <T extends Comparable<T>> T maximo(List<T> list){
        return Collections.max(list);
    }
}
