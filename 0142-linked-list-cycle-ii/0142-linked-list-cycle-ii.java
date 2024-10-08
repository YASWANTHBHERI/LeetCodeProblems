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
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(s==f){
                while(s!=temp){
                    s=s.next;
                    temp = temp.next;
                }
                while(f.next!=s){
                    f=f.next;
                }
                return s;
            }
        }
        return null;
    }
}