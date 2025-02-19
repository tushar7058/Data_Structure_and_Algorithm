package Leetcode150;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void merge(int [] nums1, int m,int[]nums2,int n){
       
        int [] merge = new int[m+n];
        int left =0;
        int right = 0;
        int index = 0;

          // Merge elements from nums1 and nums2 in sorted order
          while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                merge[index] = nums1[left];
                left++;
            } else {
                merge[index] = nums2[right];
                right++;
            }
            index++;
        }

        // to add remaiing elements from nums1
        while(left<m){
            merge[index]=nums1[left];
            left++;
            index++;
        }
        // Copy remaining elements from nums2 (if any)
            while (right < n) {
                merge[index] = nums2[right];
                right++;
                index++;
            }
        // Printing merged array for verification
        for (int num : merge) {
            System.out.print(num + " ");
        }
    } 
}

/*
 * 
 * Brute Force approach 
 * 
 * // by creatting extra array
 * 
 * 
 * 
 * 
 * 
 * 
 */

// most optimal Soluton of Leetcode: Scored at 100
class TwoMergedSortedArray{
    static void TwoSorted(int []nums1,int m,int[]nums2,int n){
        for(int j=0 ,i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}