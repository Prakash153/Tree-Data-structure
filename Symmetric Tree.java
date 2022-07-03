/* Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
  
  check wether the right side of the tree is mirror image of left side. 
  
  solution: 
for this purpose we will simultaneously check for both right and left side of the tree using inorder traversal. */
  
  code: 

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left,root.right);
    }
    public boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isSymmetricHelp( left.left, right.right) && isSymmetricHelp( left.right, right.left);
    }
}
