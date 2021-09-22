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
    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root,res);
        for(int i =0; i < res.size() - 1; i++)
            if(res.get(i) >= res.get(i+1))
                return false;
        return true;
    }
    public static void helper(TreeNode root, List<Integer> res){
        if(root!=null){
            if(root.left!=null)
                helper(root.left, res);
            res.add(root.val);
            if(root.right!=null)
                helper(root.right, res);
        }
    }
}