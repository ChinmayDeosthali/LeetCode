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
    TreeNode prev = null;
    TreeNode next = null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // List<Integer> res = new ArrayList<Integer>();
        helper(root, p);
        // System.out.println(res);
        return next;
    }
    
    public void helper(TreeNode root, TreeNode p){
        if(root == null)
            return;
        else if(next == null){
            if(root.left!=null)
                helper(root.left,p);
            
            if(root == p){
                prev = p;
            }
            else if(prev!= null){
                next = root;
                prev = null;
                return;
            }
            
            if(root.right!= null)
                helper(root.right,p);
        }
    }
}

// class Solution {

//     public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//         Stack<TreeNode> stack = new Stack<TreeNode>();
//         stack.push(root);
        
//         TreeNode temp = root;
//         while(!stack.isEmpty()){
//             while(temp!=null && temp.left!=null){
//                 temp = temp.left;
//                 stack.push(temp);
//             }
//             temp = stack.pop();
//             System.out.println(temp.val);
//             temp = temp.right;
//             if(temp!=null)
//                 stack.push(temp);
                
//         }
//         return root;
        
//     }
    

// }