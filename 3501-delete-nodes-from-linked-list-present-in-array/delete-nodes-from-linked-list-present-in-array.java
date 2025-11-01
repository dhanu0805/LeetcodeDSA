/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>list=new HashSet<>();
        for(int num:nums){
            list.add(num);
        }
        ListNode prev=head;
        ListNode dummy=new ListNode(-1);
        ListNode dummy1=dummy;
        while(prev!=null){
            if(!list.contains(prev.val)){
            dummy1.next=new ListNode(prev.val);
            dummy1=dummy1.next;
            
            }
            prev=prev.next;
        }
        return dummy.next;
    }
}