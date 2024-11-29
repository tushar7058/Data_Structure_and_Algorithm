package DSA;

public class Buy_and_Sell_Stocks {


    public  static int maxprofit(int[] arr){
            int maxProfit = 0;
            int mini = arr[0];

            for(int i=1;i<arr.length;i++){
                int CurrProfit =arr[i]-mini;
                maxProfit= (Math.max(maxProfit, CurrProfit));
                mini =Math.min(arr[i],mini);
            }
            return  maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println("the maximum profit by selling stocks is :"+maxprofit(arr));
    }
}
