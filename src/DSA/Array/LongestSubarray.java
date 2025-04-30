import java.util.*;
class LongestSubarray{
    public static void main(String[]args){

        int [] arr = {1,2,3,1,1,1,4,2,3};
        // int target = 6;
        int k = 6;
        // findlongest(arr,target);
       System.out.println( "longest length of subarray sum :"+findlongest1(arr,k));
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

    /*
        - Two pointer Approach
        - Optimized Solution
    */
    static int findlongest1(int[]arr,int k){
        int left = 0 , right =0;
        int sum =0 , maxlen = 0;
        int n = arr.length;

        while(right<n){
            sum += arr[right];
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }   
}