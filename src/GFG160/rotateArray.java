package GFG160;

public class rotateArray {
    public static void main(String[] args) {
        
    }
    // Naiver approach
    static void rotateByDStep(int []arr,int d){
        int n = arr.length;
        // repeate the rotation d times
        for(int i =0;i<d;i++){
            // left rotate the arrray by one position
            int first = arr[0];
            for(int j =0;j<n-1;j++){
                arr[j] =arr[j+1];
            }
            arr[n-1] =first;
        }
    }

    // Better approach : Using Temp array
    static void rotateByDStep1(int arr[], int d){
        int n= arr.length;
        // handle case when d>n
        d%=n;
        // storing rotated version of array
        int [] temp = new int[n];
        // copy last n-d elements to the front temp
        for(int i=0;i<n-d;i++){
            temp[i] =arr[i+d];
        }
        // copy the first d elements to the back of temp
        for(int i =0;i<d;i++){
            temp[n-d+i] =arr[i];
        }
        // copying the elements of temp in arr
        // to get the final rotated array
        for(int i= 0;i<n;i++){
            arr[i] = temp[i];
        }
    }

    



}
