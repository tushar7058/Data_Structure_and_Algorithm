package LinearSearch;

public class evenodddigit {
    public static void main(String[] args) {
        int nums[] = {12, 245, 3, 6, 7896};
        System.out.println(findnum(nums));
    }

    // Corrected method to accept the array and pass it to the logic
    static int findnum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check if the number has an even number of digits
    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }

    // Corrected function to count the number of digits in a number
    static int digit(int num) {
        if (num == 0) {
            return 1; // Special case for number 0, which has 1 digit
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // Corrected from % to /
        }
        return count;
    }
}