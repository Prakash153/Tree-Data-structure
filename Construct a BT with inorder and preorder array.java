Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder
traversal of the same tree, construct and return the binary tree.



Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5

Solution : pre traversal = root left right 
           in traversal  = left root right


so the first element of pre Array will always be root. 
if we get the position of root in inorder array, the left portion of the inorder array will be the left subtree and right portion will be right subtree. 




code : 


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return helper(preorder,0,preorder.length - 1 , inorder,0,inorder.length-1);
    }
    public static Node helper(int[] pre,int preStart, int preEnd,int in[],int inStart,int inEnd){
        if(preStart > preStart || inStart > inEnd) return null;
        Node root = new Node(pre[preStart]);
        int inorder_idx = 0 ; 
        for(int i = inStart; i<= inEnd ; i++)
        {
            if(in[i] == pre[preStart]){
                inorder_idx = i;
                break;
            }
        }
        int subTree_size = inorder_idx - inStart;
        root.left = helper(pre,preStart+1,preStart + subTree_size,in,inStart,inorder_idx -1 );
        root.right = helper(pre,preStart + subTree_size + 1, preEnd, in , inorder_idx + 1, inEnd);
        return root;
    }
}
