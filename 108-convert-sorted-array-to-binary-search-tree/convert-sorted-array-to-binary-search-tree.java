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
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans1 = sortedArrayToBST(nums, 0, nums.length -1);
        return ans1;
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int n = start + (end - start) / 2;

        TreeNode ans = new TreeNode(nums[n]);

        ans.left = sortedArrayToBST(nums, start, n-1);
        ans.right = sortedArrayToBST(nums, n+1, end);

        return ans;
    }
}