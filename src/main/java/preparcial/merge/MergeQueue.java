package preparcial.merge;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeQueue<T> {

    public  Queue<T> mergeQueues(Queue<T> cola1, Queue<T> cola2){
        Queue<T> colaIntercalada = new LinkedList<>();
        while (!cola1.isEmpty() && !cola2.isEmpty()){
            T el1 = cola1.poll();
            T el2 = cola2.poll();
            colaIntercalada.add(el1);
            colaIntercalada.add(el2);
        }
        return colaIntercalada;
    }
}
