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
        List<ListNode> nodes = new ArrayList<>();

        ListNode curr = head;
        while(curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        int nodeIdx = nodes.size() - n;
        
        if(nodeIdx == 0)
            return head.next;

        ListNode prev = nodes.get(nodeIdx - 1);
        prev.next = nodes.get(nodeIdx).next;

        return head;
    }
}
