package verificadorParentesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VerificadorParentesis {

    public static final ArrayList<Character> aperturas = new ArrayList<>(List.of('(', '{', '['));
    public static final ArrayList<Character> cierres = new ArrayList<>(List.of(')', '}', ']'));

    public static boolean validarParentesis(String expresion) {
        char[] listaExpresion = expresion.toCharArray();

        Stack<Character> pilaParentesis = new Stack<>();
        for (char el : listaExpresion) {
            if (aperturas.contains(el)) {
                pilaParentesis.push(el);
            }

            else if (cierres.contains(el)) {
                if (pilaParentesis.isEmpty()) {
                    return false;
                }
                char ultimo = pilaParentesis.pop();
                if (!coincide(ultimo,el)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean coincide(char abre, char cierra){
        if(!aperturas.contains(abre) || !cierres.contains(cierra)){
            return false;}
        return aperturas.indexOf(abre) == cierres.indexOf(cierra);
    }

    public static void main(String[] args) {
        String expresion = "(3 + 2) * {5 - [4 / (1 + 1)]}";
        System.out.println(validarParentesis(expresion));
    }
}

