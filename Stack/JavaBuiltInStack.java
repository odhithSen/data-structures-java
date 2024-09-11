import java.util.Stack;

public class JavaBuiltInStack {
    public static void main(String[] args) {
        // 1. Java Stack class (part of the Java Collections Framework)
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements to the Stack
        stack.push(1);
        stack.push(2);
        System.out.println("Stack: " + stack);

        // Pop elements from the Stack
        stack.pop();
        System.out.println("Stack: " + stack);

        // Peek the top element of the Stack
        System.out.println("Top element of the Stack: " + stack.peek());

        // Get the size of the Stack
        System.out.println("Size of the Stack: " + stack.size());
    }
}
