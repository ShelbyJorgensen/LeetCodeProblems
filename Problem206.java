/* 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
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
    ListNode ret = new ListNode(); 
    public ListNode reverseList(ListNode head) {
        ListNode ret = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = ret;
            ret = head;
            head = temp;
        }

        return ret;
    }
}