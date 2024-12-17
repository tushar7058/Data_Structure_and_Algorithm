package DSA.LinkedList;

class DeleteNthNode {
    public int data;
    public DeleteNthNode next;

    // Constructor for DeleteNthNode with data and next node
    public DeleteNthNode(int data1, DeleteNthNode next1) {
        data = data1;
        next = next1;
    }

    // Constructor for DeleteNthNode with only data (next set to null)
    public DeleteNthNode(int data1) {
        data = data1;
        next = null;
    }
}
public class RemoveNthNodeLL{
    // Function to print the linked list
    public static void printLL(DeleteNthNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth node from the end of the linked list
    public static DeleteNthNode DeleteNthNodefromEnd(DeleteNthNode head, int N) {
        // Create two pointers, fastp and slowp
        DeleteNthNode fastp = head;
        DeleteNthNode slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < N; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
        DeleteNthNode delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        DeleteNthNode head = new DeleteNthNode(arr[0]);
        head.next = new DeleteNthNode(arr[1]);
        head.next.next = new DeleteNthNode(arr[2]);
        head.next.next.next = new DeleteNthNode(arr[3]);
        head.next.next.next.next = new DeleteNthNode(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}