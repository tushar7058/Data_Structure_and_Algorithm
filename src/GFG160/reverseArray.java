package GFG160;

import java.util.Collections;
import java.util.List;

class ReverseArray {
    public static void main(String[] args) {
        
    }
    // Method for reversing array using two pointers
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // swapping
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;  // Fixed: was using arr[temp]
            
            left++;
            right--;
        }
    }
    
    // Method for reversing List using Collections
    public void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }
}
