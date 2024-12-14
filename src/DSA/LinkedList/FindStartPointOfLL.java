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
public class FindStartPointOfLL {
    public static Node firstNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // Use null instead of NULL
            slow = slow.next;         // slow moves 1 step
            fast = fast.next.next;    // fast moves 2 steps

            if (slow == fast) {       // Cycle detected
                slow = head;          // Reset slow to head
                while (slow != fast) { // Find the start of the cycle
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Return the start node of the cycle
            }
        }

        return null; // Return null if no cycle is found
    }
}

