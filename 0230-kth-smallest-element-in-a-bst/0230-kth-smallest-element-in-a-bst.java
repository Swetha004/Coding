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
    
    private static int number = 0;
    private static int counter= 0;
    
    public int kthSmallest(TreeNode root, int k){
        counter = k;
        helper(root);
        return number;
    }
    
    public void helper(TreeNode node){
        if(node.left != null){
            helper(node.left);
        }
        
        counter--;
        
        if(counter ==0){
            number = node.val;
            return;
        }
        
        if(node.right!=null){
            helper(node.right);
        }
    }
}