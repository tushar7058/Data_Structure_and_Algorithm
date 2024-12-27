package DSA.StackQueue;

public class removeKdigits1 {
    public String removeKdigits(String num, int k) {
        // Edge case: if k is equal to the length of num, return "0"
        if (k == num.length()) {
            return "0";
        }
        
        // Use a stack to store the digits
        StringBuilder stack = new StringBuilder();
        
        // Iterate over the digits in the number
        for (char digit : num.toCharArray()) {
            // Remove larger digits from the stack to form a smaller number
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            // Add the current digit to the stack
            stack.append(digit);
        }
        
        // Remove remaining digits from the end if k > 0
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        
        // Remove leading zeros
        while (stack.length() > 1 && stack.charAt(0) == '0') {
            stack.deleteCharAt(0);
        }
        
        // Return the result or "0" if the stack is empty
        return stack.length() == 0 ? "0" : stack.toString();
    }
}