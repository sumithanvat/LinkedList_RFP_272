package linkedlist;
public class Main {
    public static void main(String[] args) {
        // creating object of linked list
        linkedList.add(56); // First create node with data 56
        linkedList.add(70); // Then add node with data 70 to the list
        linkedList.insertAfter(56, 30); // Finally insert node with data 30 after node with data 56
        linkedList.display(); // Output: 56 -> 30 -> 70 -> null
    }
    }
