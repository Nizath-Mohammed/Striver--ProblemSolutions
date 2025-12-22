class Solution {
    boolean ans = true;
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        ans = ans && !(Math.abs(right-left)>1);
        return 1 + Math.max(right,left);
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ans;
    }
}