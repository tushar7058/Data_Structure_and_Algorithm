package DSA.Recursion;


public class reverse1 {
    public static void main(String[] args) {
        reverseNo(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    static void reverseNo(int n ){
        // base conditon
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum*10 +rem;

        reverseNo(n/10);  
    }    
}
