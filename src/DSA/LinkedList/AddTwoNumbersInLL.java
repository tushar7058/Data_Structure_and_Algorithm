package DSA.LinkedList;
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/
public class AddTwoNumbersInLL  {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode dummyHead = new LinkedListNode(-1);
        LinkedListNode curr = dummyHead;
        LinkedListNode temp1 = head1;
        LinkedListNode temp2 = head2;

        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }

            LinkedListNode newNode = new LinkedListNode(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;
        }

        // If there's a carry remaining, add a new node
        if (carry > 0) {
            curr.next = new LinkedListNode(carry);
        }

        return dummyHead.next;
    }
}



