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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode>node=new LinkedList<>();
        node.offer(root);
        int ind=0;
        while(!node.isEmpty()){
            int len=node.size();
           List<TreeNode>list=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode n=node.poll();
                list.add(n);
                if(n.left!=null) node.offer(n.left);
                if(n.right!=null) node.offer(n.right);
            }
            if(ind%2==1){
                int l=0,r=list.size()-1;
                while(l<r){
                    int temp=list.get(l).val;
                    list.get(l).val=list.get(r).val;
                    list.get(r).val=temp;
                    l++;
                    r--;
                }
            }

          ind++;
        }
        return root;
    }
}