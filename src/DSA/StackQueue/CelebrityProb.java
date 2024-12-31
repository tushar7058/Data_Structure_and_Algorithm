package DSA.StackQueue;
// Find the celebrity problem 

public class CelebrityProb { 
    public static int celebrity(int matrix[][]) {
        int top = 0; 
        int down = matrix.length - 1;
        // Step 1: Find the candidate
        while (top < down) {
            if (matrix[top][down] == 1) {
                top++; // Top knows Down, so Top cannot be a celebrity
            } else {
                down--; // Top does not know Down, so Down cannot be a celebrity
            }
        }
        // Step 2: Validate the candidate
        int candidate = top;
        for (int i = 0; i < matrix.length; i++) {
            // Check if the candidate knows anyone or if not everyone knows the candidate
            if (i != candidate && (matrix[candidate][i] == 1 || matrix[i][candidate] == 0)) {
                return -1; // No celebrity found
            }
        }
        return candidate; // Candidate is the celebrity
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 1, 0}
        };
        int result = celebrity(matrix);
        if (result == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("The celebrity is person " + result);
        }
    }
}


