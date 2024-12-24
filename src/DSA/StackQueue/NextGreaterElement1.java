package DSA.StackQueue;

import java.util.*;
public class NextGreaterElement1  {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        @SuppressWarnings("unused")
        int[] nge = new int[n];
        Map<Integer, Integer> map = new HashMap<>(); // Maps nums2 value to next greater element
        Stack<Integer> st = new Stack<>();

        // Compute next greater element for nums2
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                map.put(nums2[i], st.peek());
            } else {
                map.put(nums2[i], -1);
            }
            st.push(nums2[i]);
        }

        // Map the results to nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}



