package linkedlist;

public class LinkedList {
    // giving value to head
    Node head; // Reference to the first node

    public void add(int value) { // Add a new node to the end of the list
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public void display() { // Display the values in the list
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " :- ");
            current = current.next;
        }
        System.out.println("null");
    }
}
