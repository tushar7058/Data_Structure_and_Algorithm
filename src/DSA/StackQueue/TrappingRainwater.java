package DSA.StackQueue;


// Trapping Rainwater : Hard Prob

public class TrappingRainwater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int leftmax = 0;
        int rightmax = 0;
        int total = 0;

        int l = 0, r = height.length - 1;

        while (l <= r) {
            if (height[l] <= height[r]) {
                if (height[l] < leftmax) {
                    total += leftmax - height[l];
                } else {
                    leftmax = height[l];
                }
                l++;
            } else {
                if (height[r] < rightmax) {
                    total += rightmax - height[r];
                } else {
                    rightmax = height[r];
                }
                r--;
            }
        }
        return total;
    }
}