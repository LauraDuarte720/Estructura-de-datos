package listaEnlazada;

import java.util.Iterator;

public class SimpleLinkedList<T> implements Iterable<T>{

    private int size;
    private Node<T> firstnode;

    public SimpleLinkedList() {
        this.size = 0;
        this.firstnode = null;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            firstnode = newNode;
        }else{
            newNode.setNexteNode(firstnode);
            firstnode = newNode;
        }

        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(T data){
        Node <T> node = new Node<>(data);
        if(isEmpty()){
            firstnode = node;
        }else{
            Node<T> nodeAux = firstnode;
            while (nodeAux.getNexteNode() != null){
                nodeAux = nodeAux.getNexteNode();
            }
            nodeAux.setNexteNode(node);
        }
        size ++;
    }

    public void removeFirst(){
        if (isEmpty()){
            throw new RuntimeException("List is empty");
        }else{
            Node<T> aux = firstnode.getNexteNode();
            firstnode.setNexteNode(null); //Opcional, para ayudar el garbage
            firstnode = aux;
            size --;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            throw new RuntimeException("La lista ya esta vacia");
        }else{
            Node<T> nodeAux = firstnode;
            while (nodeAux.getNexteNode().getNexteNode() != null){
                nodeAux = nodeAux.getNexteNode();
            }
            nodeAux.setNexteNode(null);
        }
        size --;
    }

    public void print(){

    }

    public void remove(int index){
        int counter = 0;
        Node<T> aux = firstnode;
        while(counter != index -1){
            aux = aux.getNexteNode();
            counter++;
        }
        Node<T> temRemove = aux.getNexteNode();
        aux.setNexteNode(temRemove.getNexteNode());
        temRemove.setNexteNode(null);


    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> nodeAux = firstnode;
            @Override
            public boolean hasNext() {
                return nodeAux != null;
            }

            @Override
            public T next() {
                T elem = nodeAux.getInfo();
                nodeAux = nodeAux.getNexteNode();
                return elem;
            }
        };
    }
}
