package DSA.Recursion;



public class helloWorld {
    public static void main(String[] args) {
        hello();
    }

    static void hello(){
    
        System.out.println("hello world");
        hello1();
    }
    static void hello1(){
        System.out.println("Hello world ");
        hello2();
    }
    static void hello2(){
        System.out.println("Hello world");
    }    
}
