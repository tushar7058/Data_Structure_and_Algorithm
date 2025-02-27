package GFG160;

public class moveallZeroToEnd {
    public static void main(String[] args) {
    }

    static void PushZeroToEnd(int [] arr){
        int n = arr.length;
        int[] temp = new int[n]; // creating n size array 
        // to keep track of the index in temp[]
        int j = 0;
        // Copy non-zero elements to temp[]
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }
        // Fill remaining positions in temp[] with zeros
        while (j < n)
            temp[j++] = 0;
        // Copy all the elements from temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    // Better Approach

    static void PushZeroToEnd1(int[]arr){
        int count = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }

        while (count<n) {
            arr[count++]=0;
        }
    }

    // optimal approach 

    static void PushZeroToEnd2(int []arr){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){

            if(arr[i]!=0){
                // swapping elements

                int temp =arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // move count++

                count++;
            }

        }
    }
}
