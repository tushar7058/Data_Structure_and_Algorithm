package Binary_Search_2D_Arrays;

/*
Sorted matrix:
    - search in the sorted matrix
    - target  = 6

    int arr[][] = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
        };
 */
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 6)));  // Missing closing parenthesis fixed
    }

    // Binary search within the provided row and column range
    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Run the loop until only 2 rows remain
        while (rStart < (rEnd - 1)) {  // Fixing missing parenthesis here
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;  // Move down to mid-row
            } else {
                rEnd = mid;  // Move up to mid-row
            }
        }

        // Now we have 2 rows: rStart and rStart+1 (rEnd)

        // Check if the target is in the middle column of the 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half of rStart
        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }

        // Search in 2nd half of rStart
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // Search in 1st half of rStart+1 (rEnd)
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // Search in 2nd half of rStart+1 (rEnd)
        return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
}