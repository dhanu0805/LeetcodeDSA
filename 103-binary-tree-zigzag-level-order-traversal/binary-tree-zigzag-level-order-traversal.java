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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null) return list;
        Deque<TreeNode>queue=new LinkedList<>();
        boolean reverse =false;
        queue.addFirst(root);
        while(!queue.isEmpty()){
         int size=queue.size();
         List<Integer>list1=new ArrayList<>();
         for(int i=0;i<size;i++){
            if(!reverse) {
                TreeNode node=queue.removeFirst();
                list1.add(node.val);
                if(node.left!=null) queue.addLast(node.left);
                 if(node.right!=null) queue.addLast(node.right);
            }else{
                TreeNode node=queue.removeLast();
                list1.add(node.val);
                if(node.right!=null) queue.addFirst(node.right);
                if(node.left!=null) queue.addFirst(node.left);
            }
            
         }
         reverse=!reverse;
            list.add(list1);

        }
        return  list;
    }
}