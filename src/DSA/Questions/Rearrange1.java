package DSA;

import java.util.ArrayList;
public class Rearrange1 {
    public  static int[] rearrangebysign(int[] arr, int n){

        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array.

        ArrayList<Integer> positve = new ArrayList<>();
        ArrayList<Integer>Negative  = new ArrayList<>();
        // Segregate the array into positives and negatives.
        for (int j : arr) {
            if (j > 0) positve.add(j);
            else Negative.add(j);
        }
        // Positives on even indices, negatives on odd.
        for(int i = 0; i<n/2; i++){
            arr[2*i] = positve.get(i);
            arr[2*i+1] =Negative.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr ={1,2,-4,-5};

        int[] ans = rearrangebysign(arr,n);

        // print
        for(int i =0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
