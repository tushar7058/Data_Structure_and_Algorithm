package LinearSearch;

public class searchInstring {
    public static void main(String[] args) {
            String str = "abcd";
            char target = 'c';

        System.out.println(searchInString(str, target) );
    }

    static  boolean search2(String str, char target) {
        if(str.length() == 0 ){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }





    static  boolean searchInString(String str, char target) {
            if(str.length() == 0 ){
                return false;
            }

            for (int i = 0; i < str.length(); i++) {
                if(target==str.charAt(i)){
                    return true;
                }
            }
            return false;
    }
}
