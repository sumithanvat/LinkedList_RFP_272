package linkedlist;

public class linkedList {
    static Node head; // Reference to the first node

    public static void add(int data) { // Add a new node to the end of the list
        if (head == null) {
            head = new Node(data); // If list is empty, create the first node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse the list to get to the end
            }
            current.next = new Node(data); // Add the new node to the end
        }
    }

    public static void display() { // Display the values in the list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
