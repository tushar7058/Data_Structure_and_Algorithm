package DSA.Recursion;

public class FibonacciNthNo {
    public static void main(String[] args) {
        System.out.println("fibonacci num is :"+fibo(4 ));
    }
    static int  fibo(int n ){
        //base condition 
        if(n<2){
            return n ;
        }   
        return fibo(n-1)+fibo(n-2);
    }
}
