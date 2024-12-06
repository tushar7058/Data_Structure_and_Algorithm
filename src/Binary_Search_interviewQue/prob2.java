package Binary_Search_interviewQue;
/*
floor : target that is smaller or equal to target.

arr[] = {2,3,5,9,14,16,18}
target = 15
ans = 14
 */
public class prob2 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = floor(arr,target);
        System.out.println(ans);

    }
    // return the index of greatest no <= target
    static  int floor(int arr[], int target){
        int start  = 0;
        int end = arr.length-1;
        // but what if the target is greater than the gretest number in the array.
        while(start<=end){
            // middle ele
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                // ans not found
                return mid;
            }
        }
        return  end ;
    }
}
