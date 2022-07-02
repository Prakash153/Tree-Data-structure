INORDER TRAVERSAL : left, root , right

code:
class Solution {
    public ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}

PREORDER TRAVERSAL : root , left , right

code: 

class Solution {
     public ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
         
       if(root == null)
            return list;
     list.add(root.val);
        preorderTraversal(root.left);
       
        preorderTraversal(root.right);
        return list;    
    }
}


POSTORDER TRAVERSAL:  left , right root

code:

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
