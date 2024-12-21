package DSA.LinkedList.DLL;

class Node {
    public int data;
    public Node next;
    public Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class DeleteOccuranceK {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == k) {
                // If the node to be deleted is the head node
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null; // Ensure the new head's prev is null
                    }
                } else {
                    // Update links for non-head nodes
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                    if (temp.prev != null) {
                        temp.prev.next = temp.next;
                    }
                }
                // Move to the next node
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}