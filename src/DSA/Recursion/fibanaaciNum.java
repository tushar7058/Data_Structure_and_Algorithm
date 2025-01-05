package DSA.Recursion;

public class fibanaaciNum {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n) {

    // base condition
        if(n<2){   // if n==0 && n=1 return 1 ;
            return n ;
        }
        return fib(n-1) + fib(n-2);
    }
}
