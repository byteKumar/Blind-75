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

        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        curr = prev;
        int count = 1;
        ListNode curr2 = curr;

        while (curr != null) {
            if (n==1){
                curr = curr.next;
                break;
            }
            if(count == n - 1){
                curr.next = curr.next.next;
                break;
            } else {
                count++;
            }
            curr = curr.next;
        }

        if (n==1){
            curr2 = curr;
        }

        ListNode prev2 = null;
        while(curr2!=null) {
            ListNode temp = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = temp;
        }

        curr2 = prev2;
        return curr2;
    }
}