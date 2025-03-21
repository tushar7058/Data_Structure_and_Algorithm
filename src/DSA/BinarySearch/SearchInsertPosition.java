package DSA.BinarySearch;

public class SearchInsertPosition {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low =0;
        int high = arr.length-1;
        int ans = n;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans ;
    }
}


