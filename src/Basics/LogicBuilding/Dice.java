package Basics.LogicBuilding;
// Java program for the above approach
public class Dice {
    static void oppositeFaceOfDice(int n)  {
        // Stores number on opposite face
        // of dice
        int ans = 7 - n;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 2;
        oppositeFaceOfDice(n);
    }
}
