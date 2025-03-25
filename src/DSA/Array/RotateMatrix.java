package DSA.Array;
/*

Rotate Image : by 90 degrees
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]  //{
        [1,2,3]     [7,4,1]
        [4,5,6] =>  [8,5,2]
        [7,8,9]     [9,6,3]

        // observations
        [0][0] = [0][3]      [1][0] =  [0][2]
        [0][1] = [1][3] =>   [1][1] =  [1][2]  
        [0][2] = [2][3]      [1][2] =  [2][2]
        [0][3] = [3][3]      [1][3] =  [3][2]

        [2][0] = [0][1]      [3][0] = [0][0]
        [2][1] = [1][1]  =>  [3][1] = [1][0]
        [2][2] = [2][1]      [3][2] = [2][0]
        [3][2] = [3][1]      [3][3] = [3][0]

}
Output: [[7,4,1],[8,5,2],[9,6,3]]

 */
public class RotateMatrix {
    public static void main(String[] args) {
        
    }
    // brute force : 
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] ans = new int[n][n];
        // iterate 
        for(int i =0;i<n;i++){  
            for( int j=i+1;j<n;j++){
                ans[j][n-1-i] = matrix[i][j];

            }
        }
        // back to original matrix
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                matrix[i][j] = ans[i][j];
            }
        } 
    }

    // Better Solution : no extra space
    // transpose 
    public void rotate1(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for( int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]  = temp;
            }
        }
        // reverse 
        for( int i =0;i<n;i++){
            for (int j = 0, k = n - 1; j < k; j++, k--){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k]= temp;
            }
        }
    }
    
}

