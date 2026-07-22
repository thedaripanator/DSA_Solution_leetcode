package Striver_Blind_75_LeetCode_Problems.LinkedList;

public class Reorder_list {

    static class ListNode {
        int val;
        ListNode next;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middlenode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if (hf != null) {
            hf.next = null;
        }
    }

    public ListNode middlenode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode mid) {
        if (mid == null) {
            return mid;
        }
        ListNode prev = null;
        ListNode current = mid;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
