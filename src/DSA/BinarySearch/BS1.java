package DSA.BinarySearch;

public class BS1 {

    public static int search(int[] nums, int low, int high, int target) {
        // Base condition
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return search(nums, mid + 1, high, target); // Recursive call for right half
        } else {
            return search(nums, low, mid - 1, target); // Recursive call for left half
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 5; // Target value to search

        // Call the search method with correct arguments
        int result = search(arr, 0, arr.length - 1, x); // Pass all required arguments

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
