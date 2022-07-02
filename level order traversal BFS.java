code : 

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wraplist = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root == null) return wraplist;
        while(!q.isEmpty())
        {
            int level_num = q.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i = 0 ; i < level_num ; i++)
            {
                if(q.peek().left != null) q.offer(q.peek().left);
                  if(q.peek().right != null) q.offer(q.peek().right);
                sublist.add(q.poll().val);
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }
}
