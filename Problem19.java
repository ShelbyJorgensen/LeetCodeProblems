/* 
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

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
        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            count++;
        }

        int target = count - n;
        count = 0;
        temp = head;
        if(target == 0) {
            head = head.next;
        } else {
            while(temp != null) {
                if(count == target - 1) {
                    temp.next = temp.next.next;
                    break;
                } else {
                    temp = temp.next;
                    count++;
                }
            }
        }
        return head;
    }
}