package collections.clientes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(3);
        System.out.println(set);

        ArrayList<Cliente> lista = new ArrayList<>();

        lista.add(new Cliente("123", "Laura", 20));
        lista.add(new Cliente("456", "Ana", 18));
        lista.add(new Cliente("789", "Carlos", 25));

        // Ordenar por edad
        Collections.sort(lista, new ComparadorEdad());

        System.out.println("Ordenado por edad:");
        System.out.println(lista);

        // Ordenar por nombre
        Collections.sort(lista, new CompararNombre());

        System.out.println("Ordenado por nombre:");
        System.out.println(lista);

        // Otra forma de crear el comparador
        Comparator<Cliente> compararPorCedula = new Comparator<Cliente>() {

            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getCedula().compareTo(c2.getCedula());
            }
        };

        Collections.sort(lista, compararPorCedula);

        System.out.println(lista);
    }
}
