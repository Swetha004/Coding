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
   
     List<Integer> a=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        this.traversal(root);
        return a.get(k-1);
        
    }
    TreeNode traversal(TreeNode root)
    {
        if(root!=null)
        {
            traversal(root.left);
            a.add(root.val);
            traversal(root.right);
        }
        return null;
    }
    
}