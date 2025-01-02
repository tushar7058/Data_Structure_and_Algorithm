package GeeksForGeeks160.Array;

public class RotateArrayByDStep {
    static void rotateArr(int [] arr ,int d){
        int n = arr.length;
        // Handle the case where d > size of array
        d %=n;
        // reverse first d elements
        reverse(arr, 0, n-1);
        // reverse remaining n-d element
        reverse(arr, d, n-1);
        // reverse entire array
        reverse(arr, 0, n-1);
    }

    // func to reverse array
    static void reverse(int []arr , int start , int end){
        while(start<end){
            // using temp variable

            int temp = arr[start];
            arr [start]=arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int d=2;

        rotateArr(arr, d);

        // print
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
