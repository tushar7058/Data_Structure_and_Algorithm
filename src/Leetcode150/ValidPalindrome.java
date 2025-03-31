public class ValidPalindrome{
	public static void main(String[] args) {
		String s = "mam";
		System.out.println("The String is :"+isPalindrome(s));	
	}
	public static boolean isPalindrome(String s) {
        // Edge case: If the string is empty, it's a palindrome
        if (s.isEmpty()) {
            return true;
        }
        // Use two-pointer approach to check if it's a palindrome
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) { 
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}