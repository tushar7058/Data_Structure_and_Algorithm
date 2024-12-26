package DSA.StackQueue;
import java.util.Stack;
public class AsteroidsCollision  {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]); // Corrected arr[i] to asteroids[i]
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(asteroids[i])) {
                    st.pop(); // Both asteroids destroy each other
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]); // Add the negative asteroid
                }
            }
        }

        // Convert the stack to an array
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}