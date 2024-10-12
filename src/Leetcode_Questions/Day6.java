package Leetcode_Questions;

/*

18. 4Sum

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.


Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]


 */
import  java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day6 {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) continue;
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && arr[j - 1] == arr[j]) continue;
                int k = j + 1;
                int l = len - 1;
                while (k < l) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k] + arr[l];
                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[k - 1] == arr[k]) k++;
                        while (k < l && arr[l + 1] == arr[l]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
