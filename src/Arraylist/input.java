package Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);


//        int arr[] = new int[5]; // declaration of array
//
//        // using for loop
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//          //  System.out.print(arr[i]+" ");
//
//           // System.out.println(arr[5]); // index out of bound errors
//
//            System.out.println(Arrays.toString(arr));
//        }

//        // enhanced for loop
//        for (int num : arr){  // for every element of array , print array
//            System.out.println(arr[num]+" "); // here num  represents element of array
//        }


        // array of object
        String [] s = new String[4];

        for (int i =0 ; i< args.length;i++) s[i] = sc.next();
        System.out.println(Arrays.toString(s));

    }
}
