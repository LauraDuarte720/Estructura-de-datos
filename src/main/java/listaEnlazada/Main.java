package listaEnlazada;

public class Main {

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(2);
        list.addLast(7);
        list.addLast(4);
        list.remove(1);

        for (Integer elem: list){
            System.out.println(elem);
        }

    }
}
