package linkedlist;

public class linkedList {
    static Node head; // Reference to the first node
    static Node tail; // Reference to the last node

    public static void add(int data) { // Add a new node to the end of the list
        if (head == null) {
            head = new Node(data); // If list is empty, create the first node
            tail = head; // Update the tail to the new node
        } else {
            tail.next = new Node(data); // Add the new node to the end
            tail = tail.next; // Update the tail to the new node
        }
    }

    public static void insertAfter(int key, int data) { // Insert a new node after a given key
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                Node newNode = new Node(data); // Create the new node
                newNode.next = current.next; // Point the new node to the next node
                current.next = newNode; // Point the current node to the new node
                if (tail == current) {
                    tail = newNode; // Update the tail if the new node is added at the end
                }
                break;
            }
            current = current.next; // Move to the next node
        }
    }

    public static void pop() { // Delete the first node
        if (head != null) {
            head = head.next; // Update the head to the next node
        }
    }

    public static int popLast() { // Delete the last node and return its value
        if (head == null) { // If the list is empty
            return -1; // Return -1 to indicate that the list is empty
        } else if (head == tail) { // If there's only one node in the list
            int value = head.data;
            head = null;
            tail = null;
            return value;
        } else { // If there are more than one nodes in the list
            Node current = head;
            while (current.next != tail) {
                current = current.next; // Traverse the list to get to the second-to-last node
            }
            int value = tail.data;
            tail = current; // Update the tail to the second-to-last node
            tail.next = null;
            return value;
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