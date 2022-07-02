Given a Binary Tree of size N and an integer K. Print all nodes that are at distance k from root (root is considered at distance 0 from itself). Nodes should be printed from left to right. If k is more that height of tree, nothing should be printed.

For example, if below is given tree and k is 2. Output should be 4 5 6.

          1
       /     \
     2        3
   /         /   \
  4        5    6 
     \
      8
      
  
  
  code:
class Tree
{ 
    ArrayList<Integer>al =new ArrayList<>();
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         if(root == null){
             return al ;
         }
         if(k==0){
            al.add(root.data);
         } 
         Kdistance(root.left,k-1) ;
         Kdistance(root.right,k-1) ; 
         return al ;
     }
}
