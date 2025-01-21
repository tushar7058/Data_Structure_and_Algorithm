package DSA.Recursion;


public class concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n ){
        // base condition
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(--n);


        // concepts of 
        /*
         * n-- & --n
         * 
         * n-- : first pass the value and then  substract the value.
         * --n : first substract the value then pass the value.
         * 
         */
    }
}
