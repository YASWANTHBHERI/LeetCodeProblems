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

        ListNode temp = head;
        while(temp!=null){
            if(temp.val==Integer.MIN_VALUE) return true;
            temp.val = Integer.MIN_VALUE;
            temp=temp.next;
        }
        return false;
    }
}