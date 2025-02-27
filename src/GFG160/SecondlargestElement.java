package GFG160;

import java.util.Arrays;

public class SecondlargestElement {
    public static void main(String[] args) {      
    }
    // time complect ==> O(n*logn)

    public static int getSecondlargest(int[] arr){
        int n = arr.length;

        // sorting the arrray
        Arrays.sort(arr);

        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i]; // if true returns second largest
            }
        } 
        return -1; // if element is not present in the array
    }
    // two pass approach
    public static int  getSecondlargest1(int []arr){
        int n = arr.length;
        int largest = -1; int Secondlargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        // find second largest
        for(int i=0;i<n;i++){
          if( arr[i]>Secondlargest && arr[i]!=largest){
            Secondlargest = arr[i];
          }
        }
        return Secondlargest;
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;  // Handle edge case
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // First find the largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}
