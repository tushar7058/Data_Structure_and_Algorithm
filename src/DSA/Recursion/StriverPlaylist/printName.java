package DSA.Recursion.StriverPlaylist;
// Print name 5 times 
public class printName {
    public static void main(String[] args) {
        name(0, "Tushar kale");
    }
    static void name (int i , String n  ){
        // base condition 
        if(i>=5){
            return;
        }
        System.out.println("name is :"+n);
        name(i+1, n);
    }
}
