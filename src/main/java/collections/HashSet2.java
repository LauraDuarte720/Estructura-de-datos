package collections;

import java.util.Arrays;

public class HashSet2<T> {

    private Nodo<T>[] tabla;
    private int capacidad = 10;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public HashSet2() {
        tabla = new Nodo[capacidad];
    }

    private int getIndice(T elemento) {
        int hash = elemento.hashCode();
        return Math.abs(hash % capacidad);
    }

    public boolean add(T elemento) {
        int indice = getIndice(elemento);

        Nodo<T> actual = tabla[indice];

        // Revisar duplicados
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                return false; // ya existe
            }
            actual = actual.siguiente;
        }

        // Insertar al inicio
        Nodo<T> nuevo = new Nodo<>(elemento); //Crea el nuevo nodo
        nuevo.siguiente = tabla[indice]; //Apuntar al nuevo nodo al que ya estab en posicion (Tu siguiente será el primer nodo que ya estaba en ese bucket)
        tabla[indice] = nuevo; //Hacer que la tabla apunte al nuevo nodo

        size++;
        return true;
    }

    public boolean contains(T elemento) {

        int indice = getIndice(elemento);

        Nodo<T> actual = tabla[indice];

        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public boolean remove(T elemento) {

        int indice = getIndice(elemento);

        Nodo<T> actual = tabla[indice];
        Nodo<T> anterior = null;

        while (actual != null) {

            if (actual.dato.equals(elemento)) {

                if (anterior == null) {
                    tabla[indice] = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }

                size--;
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        return false;
    }

}
