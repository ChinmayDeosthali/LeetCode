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

//Solution didnt work
// class Solution {
//     public TreeNode deleteNode(TreeNode root, int key) {
//         TreeNode temp = root;
//         TreeNode prev = temp;
        
//         if((root == null) || (root.val==key && (root.left == null && root.right == null))){
//             return null;
//         }    
        
//         while(temp!=null){
//             if(temp.val == key){
//                 break;
//             }
//             else if(key < temp.val){
//                 prev = temp;
//                 temp = temp.left;
//             }
//             else {
//                 prev = temp;
//                 temp = temp.right;
//             }
//         }
//         if(temp!=null){
//             if(temp.left== null && temp.right==null){
//              // no children
//                 if(prev.left == temp)
//                     prev.left = null;
//                 else
//                     prev.right = null;                    
//             }                
//             else{
//                 deleteNode(temp);
//             }
//         }


//     return root;
//    }
    
//     public void deleteNode(TreeNode node){
//         //Assuming node has atleast one child node
//         TreeNode temp = node;
    
//         if(temp.right!= null){
//             TreeNode prev = temp;
//             temp = temp.right;
//             if(temp.left!=null){
//                 while(temp.left!=null){
//                     prev = temp;
//                     temp = temp.left;
//                 }
//                 node.val = temp.val;
//                 prev.left = null;
//             }
//             else{
//                 node.val = temp.val;
//                 node.right = node.right.right;
//             }
            
//         }
//         else {
//             node.val = node.left.val;  
//             node.left = node.left.left;            
//         }
        
//     }
// }


// Leetcode premium solution
class Solution {
  /*
  One step right and then always left
  */
  public int successor(TreeNode root) {
    root = root.right;
    while (root.left != null) root = root.left;
    return root.val;
  }

  /*
  One step left and then always right
  */
  public int predecessor(TreeNode root) {
    root = root.left;
    while (root.right != null) root = root.right;
    return root.val;
  }

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;

    // delete from the right subtree
    if (key > root.val) root.right = deleteNode(root.right, key);
    // delete from the left subtree
    else if (key < root.val) root.left = deleteNode(root.left, key);
    // delete the current node
    else {
      // the node is a leaf
      if (root.left == null && root.right == null) root = null;
      // the node is not a leaf and has a right child
      else if (root.right != null) {
        root.val = successor(root);
        root.right = deleteNode(root.right, root.val);
      }
      // the node is not a leaf, has no right child, and has a left child    
      else {
        root.val = predecessor(root);
        root.left = deleteNode(root.left, root.val);
      }
    }
    return root;
  }
}