code: 

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

