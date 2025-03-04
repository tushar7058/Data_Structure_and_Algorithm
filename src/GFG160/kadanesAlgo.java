package GFG160;

public class kadanesAlgo {
    public static void main(String[] args) {
        
    }
    // brute force approch : O(n^2)
    static int maxSumArraySum(int []arr){
        int n = arr.length;
        int res =arr[0];
        for(int i=0;i<n;i++){
            int currSum = 0;
            for(int j=i;j<n;j++){
                currSum = currSum+arr[j]; 
                // update currsum when  currsum is greate than result
                res = Math.max(currSum,res);
            }
        }
        return res;
    }

    // better approach O(n) : only required one pass
   static int maxSum(int []arr){
        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currSum  = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
   }

}
