

public class multiplicationTable {
    public static void main(String[] args) {
        multiplication(2);
    }
    static void multiplication(int element){
        for(int i=1;i<=10;i++){
            System.out.println(element + " * " + i +" = " + element * i);
        }
    }
}
