package DSA.LinkedList;

// Node class to define each element in the linked list
class ListNode {
    int data;
    ListNode next;

    // Constructor
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage nodes
public class linkedlist1 {
    private ListNode head;
    private ListNode tail;
    private ListNode size;

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode; // If list is empty, new node becomes the head
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // method to insert at last index

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();  // Output should be: 1 2 3
    }
}
