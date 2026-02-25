import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> nombres =new ArrayList<>();
        nombres.add("Raul");
        nombres.add("Maria");
        nombres.add("Rosa");
        nombres.add("Roberto");
        nombres.add("Carlos");
        nombres.add("Andres");
        nombres.add("Ricardo");
        nombres.add("Luisa");
        nombres.add("Pedro");
        nombres.add("Renata");

        eliminarR(nombres);

        System.out.println(nombres);

        //Ordenamiento de un Array
        Double [] array = {5.6,12.4,3.5,-2.0};
        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


//Busqueda en un Array
        int [] w = {14, -5, 3, 2, 6, -4, 22, 4};
// llamada a sort() para ordenar w
        Arrays.sort(w);
// búsqueda de un elemento
        int k;
        int buscar = -5;
        k = Arrays.binarySearch(w, buscar);
        if (k >= 0)
            System.out.println("Elemento de búsqueda<" + buscar + "> en la posicion: " + k);
    }

    //Metodo para eliminar string que empiecen con R en una Arralist
    public static void eliminarR(ArrayList<String> lista){
        for (int i=0 ; i < lista.size(); i++){
            if(lista.get(i).charAt(0) == 'R'){
                lista.remove(lista.get(i));
                i--;
            }
        }
    }

    //Metodo para eliminar string que empiecen con R en una Arralist con ITERADOR

    public static void eliminarRIterator(ArrayList<String> lista){

        Iterator<String> it = lista.iterator();

        while (it.hasNext()){
            String nombre = it.next();

            if(nombre.charAt(0) == 'R'){
                it.remove();
            }
        }
    }

}
