code: 
// left view
class Tree
{
   public void leftSideNode(Node root, ArrayList<Integer> list ,int level){
       if(root == null){
           return;
       }
       if(level == list.size()){
           list.add(root.data);
       }
       leftSideNode(root.left, list, level + 1);
       leftSideNode(root.right,list, level + 1);
       
   }
   //Function to return list containing elements of left view of binary tree.
   ArrayList<Integer> leftView(Node root)
   {
       ArrayList<Integer> list = new ArrayList<>();
       leftSideNode(root, list, 0);
       return list;
       
   }
}

// right view

code: 
class Solution {
    public void rightMostNode(TreeNode root, int level , ArrayList<Integer> list){
        if(root == null)
            return ;
        if(level == list.size())
            list.add(root.val);
        rightMostNode(root.right,level+1,list);
        rightMostNode(root.left,level+1,list);
        return;
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        rightMostNode(root,0,list);
        return list;
    }
}
