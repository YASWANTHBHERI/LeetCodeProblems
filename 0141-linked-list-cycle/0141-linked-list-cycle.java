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

        HashMap<ListNode,Integer>hmap = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(!hmap.containsKey(temp))hmap.put(temp,temp.val);
            else return true;
            temp = temp.next;
        }
        return false;
    }
}