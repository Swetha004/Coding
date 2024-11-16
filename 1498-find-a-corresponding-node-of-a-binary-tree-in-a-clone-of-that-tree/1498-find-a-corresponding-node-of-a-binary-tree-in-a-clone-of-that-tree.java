/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode[] ar=new TreeNode[1];
        clone(ar,cloned,target);
        return ar[0];
    }
    void clone(TreeNode ar[],TreeNode cl, TreeNode t)
    {
        if(cl==null)
        return;
        if(cl.val==t.val)
        {
            ar[0]=cl;
            return;
        }
        clone(ar,cl.left,t);
        clone(ar,cl.right,t);
    }
}