/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // ListNode temp = head;
        // while(temp!=null){
        //     if(temp.val==Integer.MIN_VALUE) return true;
        //     temp.val = Integer.MIN_VALUE;
        //     temp=temp.next;
        // }
        // return false;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
            
        }
        return false;
    }
}