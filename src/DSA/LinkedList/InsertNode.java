package DSA.LinkedList;
class Node1{
    int data;
    Node1 next;

    public  Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertNode {
    Node1 head;

    // method to insert new node in the end
    public void insert(int data){
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
        }
        else {
            Node1 current = head;
            // travers to the end of the list
            while(current.next!=null){
                current = current.next;
            }
            current.next = node; // attach new node to the end
        }
    }
    // method to display the linked list
    public  void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node1 current = head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertNode list = new InsertNode();

        // inserting new nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // displaying the list
        System.out.println("Linked List");
        list.display();
    }
}
