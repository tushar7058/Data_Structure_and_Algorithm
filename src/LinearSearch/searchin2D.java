package LinearSearch;

import java.util.Arrays;

public class searchin2D {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {2, 3, 4},
                {4, 5, 5}
        };

        int target = 3;
        int ans[] = search2d(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    // Corrected method to return an int (since we're finding a single maximum value)
    static int max2d(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;  // Return max as an int, not an array
    }

    // Search method remains the same
    static int[] search2d(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  // Found target, return position
                }
            }
        }
        return new int[]{-1, -1};  // Target not found, return {-1, -1}
    }
}