package DSA.Recursion.StriverPlaylist;
public class printLinearlyNum {
    public static void main(String[] args) {
        PrintLinearly(0, 5);
    }
    static void PrintLinearly(int i,int n){
        // base conditoion
        if(i>=n){
            return;
        }
        System.out.println(i);
        PrintLinearly(i+1, n);
    }
}
