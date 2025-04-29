import java.util.*;
class LongestSubarray{
    public static void main(String[]args){

        int [] arr = {1,2,3,1,1,1,4,2,3};
        int target = 6;
        findlongest(arr,target);
    }

    // Brute 
    static void findlongest(int []arr , int target){
        /*
        1. generate all sub array
        2. check from all subarray & then return longest
        */
        int n  = arr.length;
        int maxlength = 0;

       for(int i =0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
               sum +=arr[j];
               if(sum==target){
                    maxlength = Math.max(maxlength , j-i+1);
               }
            }
       }
       System.out.println("the length of longest subarray sum "+ target + " is : "+ maxlength );
    }
}