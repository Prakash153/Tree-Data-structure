Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.


Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.
Example 2:

Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.
  
  
  
  
  code: 

class Tree
{
   //Function to check whether all nodes of a tree have the value 
   //equal to the sum of their child nodes.
   public static int isSumProperty(Node root)
   {
       if (root == null || (root.left == null && root.right == null)) return 1;
       int sum = 0;
       if (isSumProperty(root.left) == 1) {
           sum = root.left != null ? sum + root.left.data : sum;
       } else {
           return 0;
       }
       if (isSumProperty(root.right) == 1) {
           sum = root.right != null ? sum + root.right.data : sum;
       } else {
           return 0;
       }
       if (root.data == sum) return 1;
       return 0;
   }
}
