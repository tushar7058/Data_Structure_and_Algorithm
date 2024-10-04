package LinearSearch;

public class linearSearch2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int  target = 2;

        int ans = checknum(arr,target);
        System.out.println(ans);
    }
    static  int  checknum(int[] arr,int target){
        if (arr.length==0){ //check base case
            return -1;
        }
        // run loop for checking element
        for (int j : arr) {
            if (j == target) {
                return j;
            }
        }
        // run when element is not present
        return -1;
    }
}
