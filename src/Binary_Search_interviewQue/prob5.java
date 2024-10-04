// position of an element in infinite sorted array
/*
we are using binary search cause here we dont know start & end after finding start
and end we are using binary search.
 */

package Binary_Search_interviewQue;
public class prob5 {
    public static void main(String[] args) {
        // start with box of size 2
        int arr[] ={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 5;
        System.out.println(ans(arr,target));
    }
    static  int ans(int arr[],int target){
        // find range
        // first start with  a box size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target>arr[end]) {
            int temp = end+1; // this is my new start
            // double the box value
            // end = previous end  + size of box+2
            end = end + (end-start+1)*2;
            start = temp;
        }
        return  binarysearch(arr,target,start,end);
    }

    static int  binarysearch(int arr[],int target,int start,int end){
        while (start <= end) {
            // finding the middle element
            // int mid = (start+end)/2 --> might be possible that (start+end)
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return  mid;
            }
        }
        return -1;
    }
}
