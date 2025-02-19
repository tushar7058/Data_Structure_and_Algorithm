package Arraylist;
import java.util.*;
class TestArrayLinked{
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist    
        al.add("Ravi");//adding object in arraylist    
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2 = getStrings();
        al2.add("James");//adding object in linkedlist    
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }

    private static List<String> getStrings() {
        List<String> al2=new LinkedList<String>();//creating linkedlist    
        return al2;
    }

    static void add(){
        List<Integer>ls = new ArrayList<Integer>();

        // looop for adding Interger elements to the list 
        Integer i =0;
        while (ls.size()==10) {
            ls.add(i);
        }
        
    }
} 