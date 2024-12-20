package Collections.learnArraysClass;

import java.sql.Array;
import java.util.Arrays;

// Used for Primitve array.

@SuppressWarnings("unused")
public class learnarrayclass1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,1,3,7,4,4};

      // Used array class sort func to sort array/
        Arrays.sort(a);
        // used for printing a array.
        for(int i : a){
            System.out.print(i+" ");
        }
      
        int index =    Arrays.binarySearch(a, 2);
        System.out.println(index);
  
    }
}
