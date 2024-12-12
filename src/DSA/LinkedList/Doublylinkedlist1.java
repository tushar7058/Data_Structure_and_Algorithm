package DSA.LinkedList;
// DListNode class to represent each element in the doubly linked list
class DListNode {
    int data;
    DListNode next; // Pointer to the next node
    DListNode prev; // Pointer to the previous node

    // Constructor
    DListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
// DoublyLinkedList class to manage the list
public class Doublylinkedlist1 {
    DListNode head; // Head of the doubly linked list

    // Method to convert an array to a doubly linked list
    public void arrayToDoublyLinkedList(int[] arr) {
        if (arr.length == 0) {
            return; // If the array is empty, do nothing
        }

        // Create the head node
        head = new DListNode(arr[0]);
        DListNode current = head;

        // Iterate through the array and build the list
        for (int i = 1; i < arr.length; i++) {
            DListNode newNode = new DListNode(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
    }

    // Method to print the list forward
    public void printForward() {
        DListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to print the list backward
    public void printBackward() {
        if (head == null) return;

        // Traverse to the end of the list
        DListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Print in reverse
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Doublylinkedlist1 list = new Doublylinkedlist1();

        int[] array = {10, 20, 30, 40, 50}; // Sample array

        // Convert array to doubly linked list
        list.arrayToDoublyLinkedList(array);

        // Print the list forward and backward
        System.out.println("Doubly Linked List printed forward:");
        list.printForward();

        System.out.println("Doubly Linked List printed backward:");
        list.printBackward();
    }
}