package Leetcode_Questions;

import java.util.Arrays;

public class mergedIntervals {
    public static void main(String[] args) {
        
    }
    // brute force solution : O(nlogn)
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }
        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int index = 0; // Pointer to track the last merged interval
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) { // Overlapping condition
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]); // Merge
            } else {
                index++; 
                intervals[index] = intervals[i]; // Move non-overlapping interval forward
            }
        }
        // Return only the valid merged intervals
        return Arrays.copyOf(intervals, index + 1);
    }
}
