package Binary_Search_interviewQue;

// ceiling of no a number.
// arr[] = {2,3,5,9,14,16,18}
/*
ceiling : find smallest num that is greater or equal to the  target element.

ceiling(arr,target 14) = ans -> 14
ceiling(arr,target15) = ans -> 16

 */

public class prob1 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = celing(arr,target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    // return the index
    static  int celing(int arr[], int target){
        // but what if the target is greater than the gretest num in the array

        if(target>arr[arr.length-1]){
            return -1;
        }
        int start  = 0;
        int end = arr.length-1;
        while(start<=end){
            // middle element
            int mid = start+(end-start)/2;
            if(target<arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                // ans not found
                return mid;
            }
        }
        return  start ;
    }
}
