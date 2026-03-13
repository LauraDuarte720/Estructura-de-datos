package listaEnlazada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {

    private Node<T> nexteNode;
    private T info;

    public Node(T info) {
        this.nexteNode = null;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nexteNode=" + nexteNode +
                ", info=" + info +
                '}';
    }
}
