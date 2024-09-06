package LinkedList;

import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {

        // 1. Java LinkedList class (part of the Java Collections Framework)
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(1);
        linkedList.add(2);
        System.out.println("LinkedList: " + linkedList);

        // Add elements at a specific index
        linkedList.add(1, 3);

        // Add elements at the beginning and end of the LinkedList
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println("LinkedList: " + linkedList);

        // Remove elements from the LinkedList
        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList: " + linkedList);

        // Get the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // 2. Implementing a linked list from scratch
        // - create node class
        // - create linked list class

        Linkedlist list = new Linkedlist();

        // Add elements to the linked list
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);
        list.addEnd(5);
        list.printList();

        // Delete elements from the linked list
        list.deleteByValue(2);
        list.deleteByValue(10);
        list.printList();

        list.deleteByPosition(1);
        list.deleteByPosition(10);
        list.printList();

        // 3. reverse a linked list
        Linkedlist list2 = new Linkedlist();
        list2.addFront(1);
        list2.addFront(2);
        list2.addFront(3);
        list2.addFront(4);
        list2.addFront(5);

        list2.printList();
        list2 = reverseList(list2);
        list2.printList();

        // 4. finding the length of a linked list
        System.out.println("Length of the linked list: " + findLength(list2));

    }

    // Find the length of a linked list
    public static int findLength(Linkedlist list) {
        int length = 0;
        Node current = list.head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // Reverse a linked list
    public static Linkedlist reverseList(Linkedlist list) {
        Node prev = null;
        Node current = list.head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;

        return list;
    }
}
