package LinkedList;

public class Linkedlist {
    Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(" null");
    }

    public void deleteByValue(int value) {
        Node current = head;
        if (current != null && current.data == value) {
            head = current.next;
            return;
        }
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            return;
        }
        System.out.println("Value not found");
    }

    public void deleteByPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position is greater than the number of nodes");
            return;
        }
        current.next = current.next.next;
    }

}
