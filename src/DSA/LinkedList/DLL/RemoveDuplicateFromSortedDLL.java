package DSA.LinkedList.DLL;
/********************************************************

    class Node
    {
        public int data;
        public Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };

********************************************************/

public class RemoveDuplicateFromSortedDLL {
    public static Node uniqueSortedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                // Skip the duplicate node
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}