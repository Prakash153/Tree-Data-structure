Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree


Input : 
          1
        /   \
       2     5
      / \     \
     3   4     6
Output :
1 2 3 4 5 6 
Explanation: 
After flattening, the tree looks 
like this
    1
     \
      2
       \
        3
         \
          4
           \
            5
             \
              6 
Here, left of each node points 
to NULL and right contains the 
next node in preorder.The inorder 
traversal of this flattened tree 
is 1 2 3 4 5 6.





Solution: the idea is, the bottom right most node of current left node should point to current right node and current right node should point to current left node 
and current left should point to null. 
if there is node current left then move curr to current's right. 

code: 
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root,prev = null;
        while(curr != null){
            if(curr.left != null){
            prev = curr.left; 
            while(prev.right != null){
                prev = prev.right;
            }
            prev.right = curr.right;
            curr.right = curr.left;
            curr.left= null;
            }
        curr = curr.right;
        }
    }
}
