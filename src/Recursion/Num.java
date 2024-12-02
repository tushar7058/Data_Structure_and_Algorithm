package Recursion;
// Recursion : function can call itself.

public class Num {
    public static void main(String[] args) {
        // write a function that takes in a number and print it
        // print first 5 number : 1,2,3,4,5
        printnum(1);
    }
    static  void printnum(int num){

        if(num ==5){
            System.out.println(5);
            return;
        }

        System.out.println(num);
        printnum(num+1);

        //recursive call
        // if you are calling a function again and again , you can treat it as a separate call in the stack.

    }
}
