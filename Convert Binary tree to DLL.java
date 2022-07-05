constraints: 
1. The DLL should look like inorder traversal.
2. conversion has to be done in-place;.

solution: the idea is also to traverse in inorder style and do the work. 

code: 

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev = null;
    Node head = null;
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root == null) return root;
     bToDLL(root.left);
	if(prev == null) head = root;
	else
	{
	    prev.right = root;
	    root.left = prev;
	}
	prev = root; 
	bToDLL(root.right);
	return head;
    }
}
