package Basics.Strings;

public class Immutable {
    public static void main(String[] args) {
        String s = "Tushar";

         // This will print Sachin
        // because strings are
        // immutable objects
        s.concat("Kale");

        System.out.println("the String is after Concatnation is :"+s);



        String t = "tushar";
        t = t.concat(" kale");
        System.out.println("concatination performed :"+t);
    }
}
