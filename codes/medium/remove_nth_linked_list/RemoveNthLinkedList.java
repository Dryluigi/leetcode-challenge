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
        ListNode pointer = head;
        ListNode prev = null;
        int length = 0;
        
        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }
        
        pointer = head;
        
        for (int i = 0; i < length - n; i++) {
            prev = pointer;
            pointer = pointer.next;
        }
        
        if (prev == null) {
            if (pointer.next == null) {
                head = null;
            } else {
                head = head.next;
            }
        } else if (pointer.next == null) {
            prev.next = null;
        } else {
            prev.next = pointer.next;
            pointer = null;
        }
        
        return head;
    }
}