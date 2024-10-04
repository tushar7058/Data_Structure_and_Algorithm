package Arraylist.questions;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        // Call the swap method
        swap(arr, 1, 3);  // Swapping elements at index 1 and index 3

//        // Print the swapped array
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }


        System.out.println(Arrays.toString(arr));
  }


    // The swap method should be defined outside the main method
    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}