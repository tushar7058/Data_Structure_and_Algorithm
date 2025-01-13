package DSA.Recursion.Recursion_Level1Que;

public class DigitSum {
    public static void main(String[] args) {
         int ans = sumOfDigit(120);
         System.out.println("sum of all this is : "+sumOfDigit(ans));
    }
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigit(n/10)+n%10;
    }
}
