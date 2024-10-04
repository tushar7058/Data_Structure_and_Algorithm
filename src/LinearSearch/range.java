package LinearSearch;

public class range {
    public static void main(String[] args) {
            int arr[]  = {1,2,4,5,-1,4};
            int target = 4;

          int ans =   checkrange(arr,4,0,2);
        System.out.println(ans);
    }

    static  int  checkrange(int[] arr,int target,int start,int end){
        if (arr.length==0){ //check base case
            return -1;
        }
        // run loop for checking element
       for (int i = start; i <= end; i++) {
           if (arr[i]==target){
               return i;
           }
       }
        // run when element is not present
        return -1;
    }
}
