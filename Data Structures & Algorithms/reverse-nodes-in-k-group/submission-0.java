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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> nodes = new ArrayList<>();

        ListNode curr = head;
        while(curr != null) {
            nodes.add(curr.val);
            curr = curr.next;
        }

        for(int i=0; i + k <= nodes.size(); i+=k) {
            int l = i, r = i + k - 1;
            while(l < r) {
                int temp = nodes.get(l);
                nodes.set(l, nodes.get(r));
                nodes.set(r, temp);
                l++;
                r--;
            }
        }

        ListNode res = new ListNode(0);
        curr = res;

        for(int val: nodes) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return res.next;
    }
}
