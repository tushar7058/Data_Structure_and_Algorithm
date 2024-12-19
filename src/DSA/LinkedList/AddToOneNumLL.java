package DSA.LinkedList;
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/
public class AddToOneNumLL {
	public static Node addOne(Node head) {
		int carry = helper(head);

		if(carry==1){
			Node newNode = new Node(1);
			newNode.next = head;
			return newNode;
		}
		return head;
	}
	static int helper(Node temp){
		// base case 
		if(temp==null )return 1;

		int carry = helper(temp.next);
		temp.data = temp.data +carry;

		if(temp.data<10){
			return 0;
		}
		temp.data = 0;
		return 1;
	}
}

