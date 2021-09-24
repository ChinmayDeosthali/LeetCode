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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode ret = findNode(root, val);
        return ret;
    }
    
    public TreeNode findNode(TreeNode node, int val){
        if(node == null)
            return node;
        
        if(node.val < val ){
            node = findNode(node.right, val);
        }
        else if(node.val > val){
            node = findNode(node.left, val);
        }
        
        return node;

    }
}