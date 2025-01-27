// Recursion In Array Problems
// Sorted Array
package DSA.Recursion.RecursionArray;

public class Que1 {
    public static void main(String[] args) {
       int arr[ ] = {1,2,3,3,5,6};
       System.out.println(Sorted(arr, 0));
    }
    static boolean Sorted(int[] arr,int index){
        // base conditon
        if(index == arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && Sorted(arr, index+1); 
    }
}
