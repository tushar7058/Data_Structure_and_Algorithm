package BinarySearch;
public class binary {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        int target = 56;

        int ans = binaryesearch(arr,target);

        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist

    static  int binaryesearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // find middle element
            int mid = start+(end-start)/2;
            if (arr[mid]>target){
                end = mid-1;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else {
                // ans found
                return  mid;
            }
        }
        return -1;
    }
}
