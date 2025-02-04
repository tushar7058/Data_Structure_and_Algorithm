package DSA.Recursion.Recursion_Pattern;

public class pattern1 {
    public static void main(String[] args) {
        patternStar(4, 0);
        
    } 
    static void patternStar(int r, int c){
        // base condition
        if(r==0){
            return;
        }
        // 2 nd condition 
        if(c<r){
            System.out.print("*");
            patternStar(r, c+1);
        }
        else{
            System.out.println();
            patternStar(r-1, 0);
        }
    }
}
