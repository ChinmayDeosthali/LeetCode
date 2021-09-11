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
        while(headB!=null){
            ListNode val = traverse(headA,headB);
            headB = headB.next;
            if(val!=null)
                return val;
        }
        return null;
    }
    
    public ListNode traverse(ListNode headA, ListNode check){
        while(headA!=null){
            if(headA == check)
                return check;
            headA = headA.next;
        }
        return null;
    }
}