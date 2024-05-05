import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushing elements: " + stack);

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
