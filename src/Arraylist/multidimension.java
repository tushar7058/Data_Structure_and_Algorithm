package Arraylist;

import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        /*
            1 2 3
            2 3 4
            6 5 4
         */

        Scanner sc = new Scanner(System.in);


        int [][] arr = new int[3][3]; //rows and column

//         int arr [][] = {
//                 {1,2,3}, // 0th index
//                 {2,3}, // 1st index
//                 {4,5,6,6,7} // 2nd index
//         };

         // input
        for (int row= 0;row<arr.length;row++){
            // for each column in row
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // output

        for (int row= 0;row<arr.length;row++){
            // for each column in row
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
