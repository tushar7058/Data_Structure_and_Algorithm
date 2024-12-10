package DSA.LinkedList;

// Define the Node class
class Node2 {
    int data;
    Node next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
public  class SearchElement {
    Node head;

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty, make the new node the head
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Attach the new node at the end
        }
    }

    // Method to search for an element in the linked list
    public boolean search(int key) {
        Node current = head;
        while (current != null) { // Traverse the list
            if (current.data == key) { // If the element is found, return true
                return true;
            }
            current = current.next;
        }
        return false; // Element not found
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       SearchElement list = new SearchElement();

        // Insert nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Search for elements
        int searchKey = 20;
        if (list.search(searchKey)) {
            System.out.println("Element " + searchKey + " found in the list.");
        } else {
            System.out.println("Element " + searchKey + " not found in the list.");
        }

        searchKey = 40;
        if (list.search(searchKey)) {
            System.out.println("Element " + searchKey + " found in the list.");
        } else {
            System.out.println("Element " + searchKey + " not found in the list.");
        }
    }
}