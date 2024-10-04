package Binary_Search_interviewQue;

/*
Leetcode
Find Smallest letter greater tha target
input = ["c","f","g"],target = "a"
output = "c
 */
public class prob3 {
    public static void main(String[] args) {

    }
    static  char greaterelement(char letters[],char target){
            int start = 0;
            int end = letters.length-1;
            while (start <= end){
                int mid = start+(end-start)/2;
                if(target<letters[mid]){
                    end = mid-1;
                }else {
                   start = mid+1;
                }
            }
            return letters[start%letters.length];
    }
}
