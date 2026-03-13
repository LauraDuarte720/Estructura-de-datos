package preparcial.merge;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        MergeQueue<Integer> merger = new MergeQueue<>();

        // Cola 1
        Queue<Integer> cola1 = new LinkedList<>();
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);

        // Cola 2
        Queue<Integer> cola2 = new LinkedList<>();
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);

        // Intercalar
        Queue<Integer> resultado = merger.mergeQueues(cola1, cola2);

        // Imprimir resultado
        System.out.println("Cola intercalada: " + resultado);

    }
}
