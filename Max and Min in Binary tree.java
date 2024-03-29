class Solution{
    public static int findMax(Node root){
        //code here
        if(root == null)
        return Integer.MIN_VALUE;
        else
        return Math.max(root.data , Math.max(findMax(root.left),findMax(root.right) ) );
    }
    public static int findMin(Node root){
        //code here
         if(root == null)
        return Integer.MAX_VALUE;
        else
        return Math.min(root.data , Math.min(findMin(root.left),findMin(root.right) ) );
    }
}
