package preparcial.splitStack;

import java.util.Stack;

public class SplitStack {

    public static Stack<Stack<Integer>> splitStack(Stack<Integer> stack, int index){
        Stack<Stack<Integer>> pilaTotal = new Stack<>();
        Stack<Integer> subpila1 = new Stack<>();
        Stack<Integer> subpila2 = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();
        int tamano = stack.size()-1;
        for (int i = tamano; i >= index; i--){
            int ele = stack.pop();
            auxiliar.push(ele);
        }
        while (!auxiliar.empty()){
            subpila1.push(auxiliar.pop());
        }
        for(int i = 0; i < index; i++){
            auxiliar.push(stack.pop());
        }
        while (!auxiliar.empty()){
            subpila2.push(auxiliar.pop());
        }
        pilaTotal.push(subpila2);
        pilaTotal.push(subpila1);
        return pilaTotal;
    }
}
