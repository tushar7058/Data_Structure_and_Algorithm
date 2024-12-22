package DSA.StackQueue;
import java.util.*;
public class ImplementMinStack {
    private Stack<Long> st;
    private Long mini;
    /** Initialize your data structure here. */
    public ImplementMinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
    }
    /** Push the value onto the stack. */
    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);  // Encode the value to keep track of the minimum
                mini = val;
            } else {
                st.push(val);
            }
        }
    }
    /** Pop the top element from the stack. */
    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;  // Decode to restore the previous minimum
        }
    }
    /** Get the top element of the stack. */
    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();  // If encoded value, return the current minimum
        }
        return val.intValue();  // Return the actual top value
    }
    /** Retrieve the minimum element in the stack. */
    public int getMin() {
        return mini.intValue();  // Return the current minimum
    }
}