public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        this.top = -1;
    }

    // Add an element to the top of the stack
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        stack[top + 1] = data;
        top++;
    }

    // Remove the top element from the stack
    public int pop (){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        top--;
        return stack[top];
    }

    // Get the top element of the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Get the size of the stack
    public int size(){
        return top + 1;
    }

    public boolean isFull(){
        if (top + 1 == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}
