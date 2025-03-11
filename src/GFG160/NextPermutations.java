package GFG160;

public class NextPermutations {
    public static void main(String[] args) {
        
    }

    static void nextPermutations(int [] arr){
        int n = arr.length;
        int i = n - 2;
        
        // Find first decreasing element from right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            // Find smallest element greater than arr[i] from right
            int j = n - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // Reverse array from i+1 to end
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
