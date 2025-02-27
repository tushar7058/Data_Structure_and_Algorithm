package Basics.LogicBuilding;
// Iterative Java Code to find sum of digits
public class SumDigits {
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {

            // Extract the last digit
            int last = n % 10;

            // Add last digit to sum
            sum += last;

            // Remove the last digit
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 555;
        System.out.println(sumOfDigits(n));
    }
}
