public class longestSubarraySumk {
    public static void main(String[]args){
        int []arr = {-1,1,1};
        int k = 1;
        int ans = findlogestsubarray(arr, k);
        System.out.println("the length of subarray sum is :"+ans);
    }
    // better solution
    static int  findlogestsubarray(int []arr, int k){
        int n = arr.length;
        int len  =0;

        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
