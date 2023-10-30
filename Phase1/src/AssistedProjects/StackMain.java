package AssistedProjects;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack after pushing elements: " + stack);
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack after popping one element: " + stack);
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        System.out.println("Stack after peeking: " + stack);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
        int stackSize = stack.size();
        System.out.println("Size of the stack: " + stackSize);
    }
}
