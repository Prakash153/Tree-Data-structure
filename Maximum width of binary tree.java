https://takeuforward.org/data-structure/maximum-width-of-a-binary-tree/

refer to this link for better explaination. 
  
  code: 
class Pair {
 TreeNode node ; 
 int idx; 
    Pair(TreeNode _node, int _idx){
        node = _node;
        idx = _idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0 ; 
        int ans = 0 ; 
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            int size = q.size();
            int min = q.peek().idx; 
            int last = 0, first = 0 ;
            for(int i = 0 ; i < size ; i++)
            {
                int curr_idx = q.peek().idx - min; 
                TreeNode temp = q.peek().node;
                q.poll();
                if(i==0) first = curr_idx;
                if(i == size-1) last= curr_idx;
                if(temp.left != null) q.offer(new Pair(temp.left,curr_idx*2 + 1));
                if(temp.right != null) q.offer(new Pair(temp.right,curr_idx*2 + 2));
                
            }
            ans = Math.max(ans,last - first + 1);
        }
        return ans;
    }
    
}
  
