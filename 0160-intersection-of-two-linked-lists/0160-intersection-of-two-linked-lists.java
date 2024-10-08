/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        int countB = 0;
        while(tempA!=null || tempB!=null){
            if(tempA!=null) countA++;
            if(tempB!=null) countB++;
            if(tempA!=null) tempA=tempA.next;
            if(tempB!=null) tempB=tempB.next;
        }
        if(countA>countB){
            int diff = countA-countB;
            while(diff!=0){
                headA=headA.next;
                diff--;
            }
        }else if(countB>countA){
            int diff = countB-countA;
            while(diff!=0){
                headB=headB.next;
                diff--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB)return headA;
            headA=headA.next;
            headB=headB.next;
        }
       return null;
    }
}