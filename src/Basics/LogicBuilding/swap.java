package Basics.LogicBuilding;

public class swap {
    public static void main(String[] args) {
        swapping(1,2);
    }
    static void swapping(int a , int b ){
        int temp =a;
        a =b ;
        b = temp;
        System.out.println("after swapping element");
        System.out.println("element a is :"+a);
        System.out.println("element b is :"+b);
    }
}
