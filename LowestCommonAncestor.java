Given a Binary Tree with all unique values and two nodes value, n1 and n2. The task is to find the
lowest common ancestor of the given two nodes. We may assume that either both n1 and n2 are present in the tree or none of them are present.

LCA: It is the first common ancestor of both the nodes n1 and n2 from bottom of tree

Input:
n1 = 2 , n2 = 3  
       1 
      / \ 
     2   3
Output: 1
Explanation:
LCA of 2 and 3 is 1.


Input:
n1 = 2 , n2 = 3  
       1 
      / \ 
     2   3
Output: 1
Explanation:
LCA of 2 and 3 is 1.




Solution : 
The idea is we assume that both of thne keys are present if eith of the key is there. 

Assumption : 
1. if it is same as n1 or n2 return root. 
2. if one of its subtree's contains n1 and other contains n2. 
3. if one of the subtree's contains both n1 & n2.
4. if none of the subtree's contains any of the n1 & n2. 


class solution {
public Node LCA(Node root, int n1 , int n2){
if(root == null) return null;
if(root.data == n1 || root.data == n2 ) return root;   // if eiether of them is found 
Node lca1 = LCA(root.left,n1,n2);                       
Node lca2 = LCA(root.right,n1,n2);

if(lca1 != null && lca2 != null)               // if n1 is on one side and n2 is on other 
return root;

if(lca1 != null)                               // if n1 and n2 are on left side 
return lca1; 
else
return lca2;                                  // if n1 and n2 are on right side or they are absent
}
}
