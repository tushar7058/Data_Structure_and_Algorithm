package Strings_And_StringBuilder;

public class palindrome {
    public static void main(String[] args) {
        String str = "Tushark";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0;i<=str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start!=end){
                return  false;
            }

        }
        return true;
    }

    static boolean isvalid(String s){
        s = s.toLowerCase();
        for(int i =0;i<=s.length();i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);


            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
