package DSA.Recursion.Recursion_Level1Que;

public class Fact1 {
    public static void main(String[] args) {
        int ans = product(5);
        System.out.println("ans is :"+ans);
    }
    static int product(int n){
        if(n<=1){
            return 1;
        }
        return n*product(n-1);
    }
}
