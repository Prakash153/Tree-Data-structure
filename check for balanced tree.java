/* Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5

Example 1:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced
Example 2:

Input:
       10
     /   \
    20   30 
  /   \
 40   60
Output: 1
Explanation: The max difference in height
of left subtree and right subtree is 1.
Hence balanced.  
*/


code: 

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
  boolean isBalanced(Node root)
   {
// Your code here
   if(root == null){
    return true;
      }
  boolean leftValue = isBalanced(root.left);
 if(!leftValue) return false;
 boolean rightValue = isBalanced(root.right);
 if(!rightValue) return false;
 if(Math.abs(height(root.left)-height(root.right))>1){
    return false;
  }
return true;
   }
   
   int height(Node root){
       if(root == null){
           return 0;
       }
       return Math.max(height(root.left),height(root.right))+1;
   }
}
