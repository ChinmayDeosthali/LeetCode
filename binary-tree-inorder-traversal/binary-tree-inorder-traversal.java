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
    List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return list;
        }
        if(root.left!=null)
            inorderTraversal(root.left);
        list.add(root.val);
        if(root.right!=null)
            inorderTraversal(root.right);
        
        return list;
    }
}