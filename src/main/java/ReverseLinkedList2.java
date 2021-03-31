/*
https://www.interviewbit.com/problems/reverse-link-list-ii/
 */
public class ReverseLinkedList2 {
    ListNode reverseBetween(ListNode A, int B, int C) {
        int i = 1;
        ListNode current = A, beforeB = null;
        while (i < B) {
            if (i < B - 1) {
                current = current.next;
                i++;
            }
            beforeB = current;
            current = current.next;
            i++;
        }
        ListNode prev = beforeB, next = null, start = current;
        while (i <= C) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        ListNode nodeC = next;
        beforeB.next = prev;
        current.next = null;
        start.next = current;

        return A;
    }
}
