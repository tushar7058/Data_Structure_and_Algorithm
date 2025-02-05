package Hackerrank;

import java.util.Arrays;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        reverse(array);
        
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static List<Integer> reverseArray1(List<Integer> a) {
        int start = 0;
        int end = a.size() - 1;
        while (start < end) {
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        return a;
    } 
}
  