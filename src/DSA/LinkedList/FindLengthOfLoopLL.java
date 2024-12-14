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
 };

 *****************************************************************/

 public class FindLengthOfLoopLL
 {

     static int findlength(Node slow, Node fast){
        int count = 1;
         fast = fast.next;
         while(slow!=fast){
             count++;
             fast = fast.next;
         }
         return count;
     
     }
     public static int lengthOfLoop(Node head) {  
         Node slow = head;
         Node fast = head;
         while(fast!= null && fast.next!=null){
             slow= slow.next;
             fast = fast.next.next;
 
             if(slow==fast){
                 return findlength(slow ,fast);
             }   
         }
         return 0;
     }
 }