/*
 * Given the head of a singly linked list, return the middle node of the linked list.
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int target = 0;

        while(temp != null) {
            temp = temp.next;
            target++;
        }
        target = (target / 2);
        int count = 0;
        while(head != null) {
            if(count == target) {
                return head;
            }
            head = head.next;
            count++;
        }
        return null;
    }
}