package linkedlist;
public class Main {
    public static void main(String[] args) {
        linkedList.add(56); // First create node with data 56
        linkedList.add(30); // Then add node with data 30 to the list
        linkedList.add(70); // Finally add node with data 70 to the list
        linkedList.pop(); // Delete the first node with data 56
        linkedList.display(); // Output: 30 -> 70 -> null
    }
    }
