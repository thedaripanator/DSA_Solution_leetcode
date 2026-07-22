package Striver_Blind_75_LeetCode_Problems.LinkedList;

import java.lang.classfile.components.ClassPrinter;

public class Detect_a_loop_in_LL {
    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return slow;
    }
}
