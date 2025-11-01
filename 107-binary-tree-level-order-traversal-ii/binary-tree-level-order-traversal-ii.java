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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>list1=new ArrayList<>();
            for(int i=0;i<size;i++){
              TreeNode node=queue.poll();
              if(node.left!=null) queue.offer(node.left);
              if(node.right!=null) queue.offer(node.right);
              list1.add(node.val);
            }
            list.add(0,list1);
        }
        return list;
        
    }
}