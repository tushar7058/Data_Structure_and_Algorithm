package Basics.LogicBuilding;
import java.util.Scanner;
    // find out even odd number 
public class evenOdd {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a num x :");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("the elements is Even");
        }
        else{
            System.out.println("the element is odd");
        }
        sc.close();
    }
}
