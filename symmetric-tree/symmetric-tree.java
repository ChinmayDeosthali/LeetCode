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
    List<Integer> inOrderList= new ArrayList<Integer>();
    List<Integer> inOrderZeroOneList= new ArrayList<Integer>();
    List<Integer> rightInOrderList= new ArrayList<Integer>();
    List<Integer> rightInOrderZeroOneList= new ArrayList<Integer>();
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        
        inOrder(root.left);
        rightInOrder(root.right);
        
        System.out.println(inOrderList);
        System.out.println(rightInOrderList);
        
        return (inOrderList.equals(rightInOrderList)) && (inOrderZeroOneList.equals(rightInOrderZeroOneList));               
    }
    
    public void inOrder(TreeNode root){
        if(root!=null)
        {
        
            if(root.left!=null)
                inOrderZeroOneList.add(1);
            else
                inOrderZeroOneList.add(0);
        
            if(root.right!=null)
                inOrderZeroOneList.add(1);
            else
                inOrderZeroOneList.add(0);
            
            inOrder(root.left);
            inOrderList.add(root.val);
            inOrder(root.right);
        }
    }
    
    public void rightInOrder(TreeNode root){
        if(root!=null)
        {
            
            if(root.right!=null)
                rightInOrderZeroOneList.add(1);
            else
                rightInOrderZeroOneList.add(0);
            
            if(root.left!=null)
                rightInOrderZeroOneList.add(1);
            else
                rightInOrderZeroOneList.add(0);
            
            rightInOrder(root.right);
            rightInOrderList.add(root.val);
            rightInOrder(root.left);
        }
    }
}