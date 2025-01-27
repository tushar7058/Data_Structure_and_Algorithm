package DSA.Recursion.RecursionArray;
// Rotated Binary search Using Recursion
public class Que5 {
    public static void main(String[] args) {
        int [] arr = {12,4,5,6,7,9};
        System.out.println("element is in the index :"+ search(arr, 0, arr.length, 5));      
    }
    static int search(int []arr, int start,int end , int target){
        // base condition
        if(start>end){
            return -1;  // found element
        }
        // find mid 
        int mid  = start+(end-start)/2; // to find middle element

        // to check mid is target or not
        if(arr[mid]==target){
            return mid;
        }
        // 1st half Condition to find element
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                search(arr, start, mid-1, target);
            }
            else{
                return search(arr, mid+1, end, target);
            }
        }
        // 2nd half Condition to find element
        if(target>=arr[mid] && target<=arr[end]){
            return search(arr, mid+1, end, target);
        }
        return search(arr, start, mid-1, target);
    }
}
