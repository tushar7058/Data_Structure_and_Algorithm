package DSA.LinkedList;

class OddEvenNode {
    int val;
    OddEvenNode next;

    OddEvenNode(int x) {
        val = x;
        next = null;
    }
}

class TUF {
    static OddEvenNode head, tail; // head and tail of the LinkedList

    static void PrintList(OddEvenNode head) // Function to print the LinkedList
    {
        OddEvenNode curr = head;
        for (; curr != null; curr = curr.next)
            System.out.print(curr.val + "-->");
        System.out.println("null");
    }

    static void InsertatLast(int value) // Function for creating a LinkedList
    {
        OddEvenNode newnode = new OddEvenNode(value);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else
            tail = tail.next = newnode;
    }

    static OddEvenNode SegregatetoOddEVen() {
        // Creating heads of Odd and Even LinkedLists
        OddEvenNode oddHead = new OddEvenNode(-1), oddTail = oddHead;
        OddEvenNode evenHead = new OddEvenNode(-1), evenTail = evenHead;
        OddEvenNode curr = head, temp;

        while (curr != null) {
            // Breaking the link of the current node
            temp = curr;
            curr = curr.next;
            temp.next = null;

            if (temp.val % 2 != 0) { // If odd node, append to odd LinkedList
                oddTail.next = temp;
                oddTail = temp;
            } else { // If even node, append to even LinkedList
                evenTail.next = temp;
                evenTail = temp;
            }
        }

        evenTail.next = oddHead.next;
        // Appending odd LinkedList at the end of even LinkedList
        return evenHead.next;
    }

    public static void main(String args[]) {
        InsertatLast(1);
        InsertatLast(2);
        InsertatLast(3);
        InsertatLast(4);
        System.out.println("Initial LinkedList: ");
        PrintList(head);
        OddEvenNode newHead = SegregatetoOddEVen();
        System.out.println("LinkedList After Segregation: ");
        PrintList(newHead);
    }
}

