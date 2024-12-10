package DSA.LinkedList;

// Node class
class Node {
    int data;
    ListNode next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class lec1 {
    ListNode head;

    // Method to append a new node at the end
    public void append(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) { // If list is empty
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to display the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head node itself holds the key
        if (head.data == key) {
            head = head.next;
            return;
        }

        ListNode current = head;
        ListNode previous = null;

        // Search for the key
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // Key not found
        if (current == null) {
            System.out.println("Value " + key + " not found in the list.");
            return;
        }

        // Unlink the node
        previous.next = current.next;
    }

    public static void main(String[] args) {
        lec1 list = new lec1();

        // Append nodes
        list.append(10);
        list.append(20);
        list.append(30);

        // Print the list
        System.out.println("Original List:");
        list.printList();

        // Delete a node
        list.deleteNode(20);

        // Print the list after deletion
        System.out.println("After deleting 20:");
        list.printList();

        // Attempt to delete a non-existent node
        list.deleteNode(50);
    }
}