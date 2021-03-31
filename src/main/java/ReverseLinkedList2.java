/*
https://www.interviewbit.com/problems/reverse-link-list-ii/
 */
public class ReverseLinkedList2 {
    ListNode reverseBetween(ListNode A, int B, int C) {
        if (A.next == null) return A;
        int i = 1;
        ListNode current = A, beforeB = null, prev = null;
        if (B == 1) {
            ListNode start = A, next = null;
            while (i <= C) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                i++;
            }
            start.next = current;
            //prev.next = null;
            return prev;
        }
        while (i < B) {
            if (i < B - 1) {
                current = current.next;
                i++;
            }
            beforeB = current;
            current = current.next;
            i++;
            prev = beforeB;
        }
        ListNode next = null, start = current;
        while (i <= C) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        if (current != null) {
            ListNode nodeC = next;
            beforeB.next = prev;
            //current.next = null;
            start.next = current;
        }
        else {
            beforeB.next = prev;
            start.next = current;
        }

        return A;
    }
}
