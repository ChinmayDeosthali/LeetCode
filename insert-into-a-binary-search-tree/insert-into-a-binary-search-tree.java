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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        TreeNode prev = temp;
        TreeNode node = new TreeNode(val);
        
        if(root == null)
            return node;
        
        while(temp!=null){
            prev = temp;
            if(val < temp.val)
                temp = temp.left;
            else 
                temp = temp.right;
            // System.out.println(prev.val);
        }
        
        if(val < prev.val){
            prev.left = node;
        }
        else 
            prev.right = node;
        
        return root;
            
    }
}