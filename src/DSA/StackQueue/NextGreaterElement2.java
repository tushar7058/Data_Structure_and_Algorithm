package DSA.StackQueue;
import java.util.*;

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length; 
        int nge [] = new int[n]; // creating n size arrr  to save ans
        Stack<Integer>st = new Stack<>(); // creating stack

        for(int i = 2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop(); // to delete ele
            }
            if(i<n){
                nge[i] = st.isEmpty()? -1 : st.peek(); // ternary operations varName = conditon ? if True :  if false
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}