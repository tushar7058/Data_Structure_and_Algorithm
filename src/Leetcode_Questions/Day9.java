package Leetcode_Questions;

/*
 2583. Kth Largest Sum in a Binary Tree

 You are given the root of a binary tree and a positive integer k.
The level sum in the tree is the sum of the values of the nodes that are on the same level.
Return the kth largest level sum in the tree (not necessarily distinct). If there are fewer than k levels in the tree, return -1.
Note that two nodes are on the same level if they have the same distance from the root.

Input: root = [5,8,9,2,1,3,7,4,6], k = 2
Output: 13
Explanation: The level sums are the following:
- Level 1: 5.
- Level 2: 8 + 9 = 17.
- Level 3: 2 + 1 + 3 + 7 = 13.
- Level 4: 4 + 6 = 10.
The 2nd largest level sum is 13.

Input: root = [1,2,null,3], k = 1
Output: 3
Explanation: The largest level sum is 3.

 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
public class Day9 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // Min-heap to store the k largest level sums
        PriorityQueue<Long> minHeap = new PriorityQueue<>(k);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            long levelSum = 0;
            // Calculate the sum of the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                levelSum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            // Add the current level sum to the heap
            if (minHeap.size() < k) {
                minHeap.add(levelSum);
            } else if (levelSum > minHeap.peek()) {
                minHeap.poll();  // Remove the smallest of the k largest sums
                minHeap.add(levelSum);
            }
        }
        // If we don't have enough levels to get the k-th largest
        if (minHeap.size() < k) return -1;

        return minHeap.peek();  // The k-th largest element will be at the top of the min-heap
    }
    // TreeNode class definition
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
}