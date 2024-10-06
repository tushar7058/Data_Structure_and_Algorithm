package Binary_Search_2D_Arrays;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        // our 2D matrix
        int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        // printing target element
        System.out.println(Arrays.toString(search(arr, 49)));  // Example target: 37
    }
    static int[] search(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length - 1;  // Correct the initial column to the last column

        // Implementing search algorithm
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};  // Return the row and col where the target is found
            }
            if (matrix[row][col] > target) {
                col--;  // Move left if the current value is larger than the target
            } else {
                row++;  // Move down if the current value is smaller than the target
            }
        }
        return new int[]{-1, -1};  // Target not found
    }
}