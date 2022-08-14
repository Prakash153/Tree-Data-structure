Given the root of a complete binary tree, return the number of the nodes in the tree.

According to Wikipedia, every level, except possibly the last, is completely filled in a complete
binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.
  
  
  solution : 



class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ) return null ; 
        if(root.val == p.val || root.val == q.val) return root; 
        
        TreeNode lca1 = lowestCommonAncestor(root.left,p,q);
        TreeNode lca2 = lowestCommonAncestor(root.right,p,q); 
        
        if(lca1 != null && lca2 != null)
            return root;
        
        if(lca1 != null)
            return lca1; 
        else
            return lca2;
    }
}
