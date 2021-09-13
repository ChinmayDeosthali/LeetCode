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
// class Solution {
    
//     List<Integer> list = new ArrayList<Integer>();
    
//     public List<Integer> postorderTraversal(TreeNode root) {
//         if(root==null)
//             return list;
//         if(root.left == null && root.right == null){
//             list.add(root.val);
//             return list;
//         }
//         if(root.left!=null)
//             postorderTraversal(root.left);
//         if(root.right!=null)
//             postorderTraversal(root.right);
//         list.add(root.val);
        
//         return list;
//     }
// }

class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = helper(root, list);
        return list;
    }
    public List<Integer> helper(TreeNode root, List<Integer> list){
        if(root!=null){
            if(root.left!=null)
                list = helper(root.left,list);
            if(root.right!=null)
                list = helper(root.right, list);
            list.add(root.val);
        }
        return list;
    }
}