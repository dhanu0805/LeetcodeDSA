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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        return build(nums,0,nums.length-1);
        
    }
    public TreeNode build(int arr[],int start,int end){
        if(start>end)return null;
        int ind=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[ind])ind=i;
        }
        TreeNode node=new TreeNode(arr[ind]);
        node.left=build(arr,start,ind-1);
        node.right=build(arr,ind+1,end);
        return node;
    }
}