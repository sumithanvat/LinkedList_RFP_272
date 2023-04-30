package linkedlist;
public class Main {
    public static void main(String[] args) {

        linkedList.add(56); // First create node with data 56
        linkedList.add(30); // Then add node with data 30 to the list
        linkedList.add(70); // Finally add node with data 70 to the list
        // search for node with key 30
        Node node = linkedList.search(30);

        if (node != null) {
            System.out.println("Node found with value: " + node.data);
        } else {
            System.out.println("Node not found");
        }
        linkedList.display();
    }
    }
