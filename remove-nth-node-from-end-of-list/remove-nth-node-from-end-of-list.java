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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        if(length == 1){
            head = null;
            return head;
        }
        if((length - n)==0){
                    head = head.next;
                    // System.out.println("head: "+head.val);
                    return head;
        } 
        temp = head;
        // System.out.println("length: "+length);
        int count = 0;
        while(temp!=null){
                        
            count++;
            if(count == (length - n)){
                temp.next = temp.next.next;
                break;
            }
            
            temp = temp.next;
        }
        return head;
    }
}