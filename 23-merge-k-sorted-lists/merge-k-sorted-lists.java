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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                ans.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(ans);

        if (ans.isEmpty()) return null;
        
        ListNode head = new ListNode(ans.get(0));
        ListNode finalAns = head;

        for(int i=1;i<ans.size();i++){
            head.next = new ListNode(ans.get(i));
            head = head.next;
        }
        head.next = null;

        return finalAns;
        
    }
}