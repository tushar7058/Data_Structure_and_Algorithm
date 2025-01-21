package DSA.Recursion;


public class reverse1 {
    public static void main(String[] args) {
        // reverseNo(1234);
        System.out.println(reverse2(1234));
    }
    static int sum = 0;
    static void reverseNo(int n ){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum*10 +rem;

        reverseNo(n/10);  
    }    
    // second way to reverse a function.
    static int  reverse2(int n){
        // sometimes might you need some additional variables in the arguments
        // in that case , make another function

        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit); 
    }
    // helper function for calculatio
    private static int helper(int n ,int digit){
        // base condition
        if(n%10 == n){
            return 1;
        }
        // calculate remainder
        int rem = n%10;
        // returning the value
        return rem* (int)(Math.pow(10,digit-1)) +helper(n/10, digit-1);
    }
}

