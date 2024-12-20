package Collections.learnArraysClass;

import java.util.ArrayList;

import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {


        List <Integer>list1 = new ArrayList<>();

      
        list1.add(0);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // System.out.println(list1);
        // System.out.println("min element is :"+Collections.min(list1));
        // System.out.println("max element is :"+Collections.max(list1)); 

        Collections.sort(list1, Comparator.reverseOrder());
        System.out.println(list1);

        
    }
}
