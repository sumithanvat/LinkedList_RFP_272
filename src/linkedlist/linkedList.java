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

    public static void insertAfter(int key, int data) { // Insert a new node after a given key
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                Node newNode = new Node(data); // Create the new node
                newNode.next = current.next; // Point the new node to the next node
                current.next = newNode; // Point the current node to the new node
                break;
            }
            current = current.next; // Move to the next node
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
