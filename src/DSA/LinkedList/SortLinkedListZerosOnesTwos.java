package DSA.LinkedList;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class SortLinkedListZerosOnesTwos {
    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node zerohead = new Node(-1); // Dummy head for 0s
        Node onehead = new Node(-1);  // Dummy head for 1s
        Node twohead = new Node(-1);  // Dummy head for 2s

        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;

        Node temp = head;

        // Partition the nodes into three lists
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // Connect the three lists
        zero.next = (onehead.next != null) ? onehead.next : twohead.next;
        one.next = twohead.next;
        two.next = null; // End the list

        // Return the head of the merged list
        return zerohead.next;
    }
}
