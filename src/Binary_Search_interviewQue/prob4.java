package Binary_Search_interviewQue;

public class prob4 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        prob4 obj = new prob4();
        int[] result = obj.searchrange(nums, target);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchrange(int nums[], int target) {
        int ans[] = {-1, -1};

        // Check for the first and last occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans; // Missing return fixed
    }

    // Function to return the index of the target
    public int search(int nums[], int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Search on the left side for the first occurrence
                } else {
                    start = mid + 1; // Search on the right side for the last occurrence
                }
            }
        }
        return ans;
    }
}