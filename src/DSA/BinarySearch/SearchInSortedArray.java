package DSA.BinarySearch;


import java.util.ArrayList;
public class SearchInSortedArray {
    public static int search(ArrayList<Integer> arr, int n, int k) {

        int low = 0 ;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid) ==k)
            {
                return mid;

            }

            // left sorted
            if(arr.get(low) <= arr.get(mid)){
                if(arr.get(low) <=k && k<= arr.get(mid)){
                    high = mid-1;
                }
                else{
                    low =mid+1;
                }
            }
            // check right sorted
            else{
                if(arr.get(mid) ==k && k<= arr.get(high)){
                    low = mid+1;
                }
                else{
                    low = mid-1;
                }
            }
        }
        return -1 ; // element not  found
    }
}
