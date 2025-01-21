package DSA.Recursion;
public class CountZeros {
    public static void main(String[] args) {
        System.out.println("count of zeros : "+countzeros(23021));
    }
    // main func to calculate zeros
    static int  countzeros(int n){
        return helper(n,0);
    }
    // here used recusrsion concept
    private static int helper(int n ,int c){   
        // base condition
        if (n==0){
            return  c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
