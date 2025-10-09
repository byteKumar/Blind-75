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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
        }

        curr = prev;

        ListNode start = head;
        while(curr != null) {
            ListNode t1 = start.next;
            ListNode t2 = curr.next;
            start.next = curr;
            curr.next = t1;
            start = t1;
            curr = t2;
        }
    }
}