
public class sum {
    public static void main(String[] args) {
        sum1(3);
    }
    static  void sum1(int ele){
        int sum =0;
        for(int i=1;i<=ele;i++){
            sum = sum+i;
            System.out.println("the sum is :"+sum);
        }
    }
}
