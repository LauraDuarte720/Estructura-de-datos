package Recursividad;

public class Tarea {

    public static void main(String[] args) {
        int [] arreglo= {2,5,8,3,9};
        int x = obtenerMayorArreglo (arreglo);
        System.out.println(x);
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8}};
        imprimirMatrizR(matriz);
        System.out.println(obtenerMayorR(arreglo));
        System.out.println(sumarArreglo(arreglo));
        System.out.println(busquedaBinaria(arreglo, 9));
        System.out.println(factorial(5,1));
    }

// Metodo recursivo para encontrar el mayor en un arreglo
    public static int obtenerMayorArreglo(int [] arreglo){
        int mayorIn = arreglo [0];
        return obtenerMayorArreglo(arreglo,0, mayorIn);

    }

    private static int obtenerMayorArreglo(int [] arreglo, int n, int mayor){
        if (arreglo.length == n){
            return mayor;
        }else{
           if (mayor > arreglo[n]){
               return obtenerMayorArreglo(arreglo, n+1, mayor);
           }else{
               return obtenerMayorArreglo(arreglo, n+1, arreglo[n]);
           }
        }
    }

    //Alternativa mas limpia

    private static int obtenerMayorArreglo2(int[] arreglo, int n, int mayor) {
        if (n == arreglo.length) {
            return mayor;
        }

        return obtenerMayorArreglo(
                arreglo,
                n + 1,
                Math.max(mayor, arreglo[n])
        );
    }

    //imprimir una matriz de forma no recursiva

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {          // filas
            for (int j = 0; j < matriz[i].length; j++) {   // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatriz2(int[][] matriz){
        for (int[] ints : matriz) {          // filas
            for (int anInt : ints) {   // columnas
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    //imprimir matriz de forma recursiva

    public static void imprimirMatrizR(int[][] matriz){
        imprimirMatrizR(matriz, 0, 0);
    }
    private static void imprimirMatrizR(int[][] matriz, int n, int m){
        if (n == matriz.length) {
            return;
        }else{
            if (m == matriz[n].length){
                System.out.print("\n");
                imprimirMatrizR(matriz, n+1,  0);
            }else{
                System.out.print(matriz[n][m] + " ");
                imprimirMatrizR(matriz,n, m+1);
            }
        }
    }

    private static int sumarMatrizR(int[][] matriz, int n, int m, int acc){
        if (n == matriz.length) {
            return acc;
        }else{
            if (m == matriz[n].length){
                return sumarMatrizR(matriz, n+1,  0, acc);
            }else{
                acc += matriz[n][m];
                return sumarMatrizR(matriz,n, m+1, acc);
            }
        }
    }

    public static int obtenerMayorR(int [] arr){
        return obtenerMayorR(arr, 0, arr.length -1);
    }

    private static int obtenerMayorR(int[] arr, int ini, int fin){
        if (ini == fin){
            return arr[ini];
        }
        int mitad = (ini + fin)/2;
        int mayorIzq = obtenerMayorR(arr, ini, mitad);
        int mayorDer = obtenerMayorR(arr, mitad +1, fin);

        return Math.max(mayorIzq,mayorDer);
    }

    //metodo recursivo usando divide y vencerás que obtenga la suma de los números de un arreglo

    public static int sumarArreglo(int[] arr){
        return sumarArreglo(arr, 0, arr.length -1);
    }
    private static int sumarArreglo(int[] arr, int ini, int fin){
        if (ini == fin){
            return arr[ini];
        }
        int mitad = (ini + fin)/2;
        int sumaIzq = sumarArreglo(arr, ini, mitad);
        int sumaDer = sumarArreglo(arr, mitad +1, fin);

        return sumaIzq + sumaDer;
    }

    //metodo de busqueda binaria

    public static int busquedaBinaria(int[] arreglo, int objetivo){
        return busquedaBinaria(arreglo, 0, arreglo.length -1, objetivo);
    }

    private static int busquedaBinaria(int[] arreglo, int ini, int fin, int objetivo){
        if (ini > fin){
            return -1;
        }
        int mitad = (ini + fin)/2;
        if (arreglo[mitad] == objetivo){
            return mitad;
        }

        if (objetivo<arreglo[mitad]){
            return busquedaBinaria(arreglo,ini, mitad- 1,objetivo);
        }else{
            return busquedaBinaria(arreglo,mitad+1,fin, objetivo );
        }

    }

    public static int sumarNumeros(int n){
        if (n == 0){
            return 0;
        }else{
            return n + sumarNumeros(n-1);
        }
    }

    public static int factorial(int n, int acc){
        if (n == 1){
            return acc;
        }else{
            return factorial(n -1, acc * n);
        }
    }


}
