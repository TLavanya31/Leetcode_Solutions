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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);
                break;
            }
        }

        if (len == 0) return null;

        ListNode p1 = head;
        ListNode p2 = head;

        while (len > 0) {
            p2 = p2.next;
            len--;
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1; 
    }
}