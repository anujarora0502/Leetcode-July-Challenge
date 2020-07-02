/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Queue<TreeNode> q = new ArrayDeque<>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(q.size()!=0){
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode rn = q.remove();
                if(rn.left!= null)
                q.add(rn.left);
                if(rn.right!= null)
                q.add(rn.right);
                ll.add(rn.val);
            }
            
            ans.add(0,new ArrayList(ll)); 
        }
        
        return ans;
    }
}