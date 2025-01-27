package Collections;

import java.util.Stack;

// stack used last in first out method

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer>stck = new Stack<>();

        stck.push(1);
        stck.push(2);
        System.out.println(stck);
        System.out.println("pop element is ;"+stck.pop());
        System.out.println(stck.peek());
    }
}
