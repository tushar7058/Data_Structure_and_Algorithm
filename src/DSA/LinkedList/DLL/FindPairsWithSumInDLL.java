package DSA.LinkedList.DLL;
import java.util.* ;
/****************************************************************

    Following is the class structure of the Node class:

      class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

*****************************************************************/

public class FindPairsWithSumInDLL {

    public static List findPairs(Node head, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (head == null) return (List) result;

        // Initialize two pointers
        Node left = head;
        Node right = head;

        // Move the 'right' pointer to the tail of the list
        while (right.next != null) {
            right = right.next;
        }

        // Two-pointer approach
        while (left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;

            if (sum == k) {
                result.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            } else if (sum < k) {
                left = left.next; // Move left pointer to increase sum
            } else {
                right = right.prev; // Move right pointer to decrease sum
            }
        }

        return (List) result; // Cast to raw type List
    }
}

