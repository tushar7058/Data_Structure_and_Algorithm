package Collections;
import java.util.HashSet;
import java.util.*;

public class LearnhashSet {
    public static void main(String[] args) {
        Set <Integer >set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);

        set.remove(1);

      System.out.println(set.contains(2));

        System.out.println("element contains in set :"+set);
    }
}
