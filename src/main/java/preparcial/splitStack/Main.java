package preparcial.splitStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(6);
        stack.push(7);
        stack.push(2);
        stack.push(10);
        stack.push(14);
        stack.push(2);

        System.out.println(SplitStack.splitStack(stack,5).toString());
    }


}
