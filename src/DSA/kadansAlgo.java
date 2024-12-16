package DSA;

public class kadansAlgo {

    public static long maxSubarraySum(int arr[],int n){
        long maxi = Integer.MIN_VALUE;
        long sum =0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi =sum;
            }
            // if sum <0 : discard the sum calculate
            if(sum<0){
                sum=0;
            }
        }
        // to consider sum of the empty subarray
        // uncomment the following check:

        // if(maxi<0)maxi=0;
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n =arr.length;
        long maxSum = maxSubarraySum(arr,n);
        System.out.print(maxSubarraySum(arr, n));
    }
}

