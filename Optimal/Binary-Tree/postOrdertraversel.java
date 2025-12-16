// class Solution {
//     public void postOrder(TreeNode root , List<Integer> ans){
//         if(root!=null){
//             postOrder(root.left , ans);
//             postOrder(root.right , ans);
//             ans.add(root.val);
//         }
//     }
//     ublic List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         postOrder(root , ans);
//         return ans;
//     }
// }