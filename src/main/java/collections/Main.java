package collections;

public class Main {
    public static void main(String[] args) {

        HashSet2<String> conjunto = new HashSet2<>();

        // Agregar elementos
        System.out.println("Agregando elementos...");
        System.out.println(conjunto.add("Juan"));   // true
        System.out.println(conjunto.add("Pedro"));  // true
        System.out.println(conjunto.add("Maria"));  // true
        System.out.println(conjunto.add("Juan"));   // false (duplicado)

        // Buscar elementos
        System.out.println("\nBuscando elementos...");
        System.out.println("¿Existe Juan? " + conjunto.contains("Juan")); // true
        System.out.println("¿Existe Ana? " + conjunto.contains("Ana"));   // false

        // Eliminar elementos
        System.out.println("\nEliminando elementos...");
        System.out.println("Eliminar Pedro: " + conjunto.remove("Pedro")); // true
        System.out.println("Eliminar Ana: " + conjunto.remove("Ana"));     // false

        // Verificar después de eliminar
        System.out.println("\nVerificando después de eliminar...");
        System.out.println("¿Existe Pedro? " + conjunto.contains("Pedro")); // false
    }
}