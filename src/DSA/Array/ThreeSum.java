package DSA.Array;
import java.util.*;
/*
Example 1 :   
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2 :
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int n = nums.length;
        List<List<Integer>> ans = threeSum(nums, n);

        // Printing the result
        for (List<Integer> triplet : ans) {
            System.out.print("[");
            for (int i = 0; i < triplet.size(); i++) {
                System.out.print(triplet.get(i));
                if (i < triplet.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // Brute force solution: O(n³) complexity
    public static List<List<Integer>> threeSum(int[] nums, int n) {
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // Fixed increment from i to j
                for (int k = j + 1; k < nums.length; k++) {

                    // Addition check
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);  // Sorting to avoid duplicate orderings
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    // Better Solution : 
    public static List<List<Integer>> threeSum1(int[] nums, int n) {
        // Set to store unique triplets
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                // If third exists in set1, we found a triplet
                if (set1.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp); // Sort to ensure uniqueness
                    set.add(temp); // Add to the main set
                }
                set1.add(nums[j]); // Move this outside the if block
            }
        }
        // Convert set to list and return
        return new ArrayList<>(set);
    }

}