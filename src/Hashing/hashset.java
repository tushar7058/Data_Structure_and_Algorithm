package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        // creating 
        HashSet<Integer> set = new HashSet<>();
        // automate adding elements in set
        for(int i=1;i<=5;i++){
            set.add(i);
            System.out.print(+i);
        }
        // size of set 
        System.out.println("\nsize of set is :"+set.size());
        // search : Contains
        if(set.contains(11)){
            System.out.println("set contains ");
        }
        else{
            System.out.println("does not contain element");
        }
        // delete : 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1 - we deleted 1");
        }

        // iterator

        @SuppressWarnings("rawtypes")
        Iterator it  = set.iterator();
        // System.out.println(it.next());
        // System.out.println(it.hasNext());

        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

}
