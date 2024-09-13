package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaBuiltInQueue {
    public static void main(String[] args) {
        // 1. Java Queue Interface (part of the Java Collections Framework)
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add(1);
        queue.add(2);
        System.out.println("Queue: " + queue);

        // Remove elements from the Queue
        queue.remove();
        System.out.println("Queue: " + queue);

        // Peek the front element of the Queue
        System.out.println("Front element : " + queue.peek());

        // Get the size of the Queue
        System.out.println("Size of the Queue: " + queue.size());
    }
}
