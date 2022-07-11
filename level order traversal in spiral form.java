Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 
  
  
  code : 
class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Queue<Node> q = new LinkedList<Node>();
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        boolean ltr = false;
        
        if(root == null)
            return res;
        
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            
            if(ltr == false){
                for(int i=0;i<n;i++){
                    Node ele = q.poll();
                    
                    if(ele.left!=null)
                        q.add(ele.left);
                    if(ele.right!=null)
                        q.add(ele.right);
                    
                    stack.push(ele.data);
                }
                while(!stack.isEmpty()){
                    res.add(stack.pop());
                }
                ltr = !ltr;
            }
            else{
                for(int i=0;i<n;i++){
                    Node ele = q.poll();
                    
                    if(ele.left!=null)
                        q.add(ele.left);
                    if(ele.right!=null)
                        q.add(ele.right);
                    
                    res.add(ele.data);
                }
                ltr=!ltr;
            }
            
        }
        return res;
        
    }
}
