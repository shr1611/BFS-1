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

// Time: O(Number of nodes)
// Space: O(max breadth of tree)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> out = new ArrayList<>();
      if(root == null){
        return out;
      }
      
      Queue<TreeNode> q = new LinkedList<>();
      TreeNode temp = root;
      
      q.offer(temp);
      
      while(!q.isEmpty()){
        
        int size = q.size();
        System.out.println(size);
        TreeNode curr;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<size;i++){
          curr = q.poll();
          list.add(curr.val);
          
          if(curr.left != null){
            q.offer(curr.left);
            // temp = temp.left;
           }
        
          if(curr.right != null){
            q.offer(curr.right);
            // temp = temp.right;
          }
          
        }
        
        out.add(list);
      }
       return out;
    }
}
