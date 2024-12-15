package DSA.LinkedList;
// PalindromeNode class
class PalindromeNode {
    public int data;
    public PalindromeNode next;

    PalindromeNode() {
        this.data = 0;
        this.next = null;
    }

    PalindromeNode(int data) {
        this.data = data;
        this.next = null;
    }

    PalindromeNode(int data, PalindromeNode next) {
        this.data = data;
        this.next = next;
    }
}
// Main class
public class CheckPalindromeOrNotLL {

    // Method to reverse a linked list
    public static PalindromeNode reverseLinkedList(PalindromeNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        PalindromeNode newHead = reverseLinkedList(head.next);
        PalindromeNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    // Method to check if a linked list is a palindrome
    public static boolean isPalindrome(PalindromeNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        PalindromeNode slow = head;
        PalindromeNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        PalindromeNode newHead = reverseLinkedList(slow.next);
        PalindromeNode first = head;
        PalindromeNode second = newHead;

        while (second != null) {
            if (first.data != second.data) {
                reverseLinkedList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
