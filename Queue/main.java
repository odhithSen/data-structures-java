package Queue;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Front element is: " + queue.peek());

        queue.enqueue(6);
        queue.enqueue(7);
        
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Size of the queue is: " + queue.getSize());
    }
}
