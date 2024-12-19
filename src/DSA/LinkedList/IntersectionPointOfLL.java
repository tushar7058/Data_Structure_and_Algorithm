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
public class IntersectionPointOfLL{
    public static int findIntersection(Node firstHead, Node secondHead) {
           if (firstHead == null || secondHead == null) {
               return -1;
           }
   
           Node t1 = firstHead;
           Node t2 = secondHead;
   
           while (t1 != t2) {
               t1 = (t1 == null) ? secondHead : t1.next;
               t2 = (t2 == null) ? firstHead : t2.next;
           }
   
           // If they meet, t1 (or t2) is the intersection node
           return (t1 != null) ? t1.data : -1;
       }
   }


