package DSA.Recursion;

// Recursion : Function call itself.


public class numsRecursion {
    public static void main(String[] args) {
        nums(1);
    }
    static void nums(int n){
        // base condition
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        nums(n+1); // checking itself.

        // recursive call 
        // if you are a calling a function again and again , you can treat it as a seprate call in tha stack.
    }
}
