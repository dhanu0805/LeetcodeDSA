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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        TreeNode result=helper(root).node;
        return result;
    }
    public Tree helper(TreeNode root){
        if(root==null) return new Tree(0,null);
        Tree left=helper(root.left);
        Tree right=helper(root.right);
        if(left.depth==right.depth) return new Tree(left.depth+1,root);
        else if(left.depth>right.depth) return new Tree(left.depth+1,left.node);
        else return new Tree(right.depth+1,right.node);
    }
} 
class Tree{
    int depth;
    TreeNode node;
    Tree(int depth,TreeNode node){
        this.depth=depth;
        this.node=node;
    }
}