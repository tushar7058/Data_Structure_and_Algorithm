package DSA.LinkedList;

// LinkedListNode class represents a node in a linked list
class LinkedListNode {
    int data;
    LinkedListNode next;

    // Constructor with data and next node as parameters
    LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as a parameter, sets next to null
    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortLinkedList {

    // Function to merge two sorted linked lists
    static LinkedListNode mergeTwoSortedLinkedLists(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode dummyNode = new LinkedListNode(-1);
        LinkedListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummyNode.next;
    }

    // Function to find the middle of a linked list
    static LinkedListNode findMiddle(LinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to perform merge sort on a linked list
    static LinkedListNode sortLL(LinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode middle = findMiddle(head);
        LinkedListNode right = middle.next;
        middle.next = null;

        LinkedListNode left = sortLL(head);
        right = sortLL(right);

        return mergeTwoSortedLinkedLists(left, right);
    }

    // Function to print the linked list
    static void printLinkedList(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Linked List: 3 2 5 4 1
        LinkedListNode head = new LinkedListNode(3);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(5);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(1);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Sort the linked list
        head = sortLL(head);

        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }
}
                