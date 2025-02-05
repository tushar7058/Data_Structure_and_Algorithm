package DSA.Recursion.StriverPlaylist;

// Summation of first N numbers

/// Task : factorial of num

public class SumOfFirstNNum {
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n,0);
        System.out.println("sum of first "+ n + " number is : "+result);
    }
    static int sum(int i , int sum){
        // base condition 
        if(i<=0){
            return sum;
        }
       return sum(i-1,sum+i);
    }
}