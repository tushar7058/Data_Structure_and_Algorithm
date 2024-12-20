package Collections;
import java.util.ArrayDeque;

public class CustomArrayDeque { // Renamed the class
    public static void main(String[] args) {
        // Using java.util.ArrayDeque
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Example usage
        adq.add(10);
        adq.add(20);
        adq.add(30);
        adq.offerFirst(12);
        adq.offerLast(12);
        System.out.println("ArrayDeque contents: " + adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekLast());

        System.out.println("last element to be poped is : "+ adq.pollLast());

        
    }
}