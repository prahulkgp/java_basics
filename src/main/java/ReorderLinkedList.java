public class ReorderLinkedList {
    public ListNode reorderList(ListNode A) {
        if (A.next == null) return A;
        ListNode current = A, temp;
        int len = 1;
        while (current.next != null) {
            len++; current = current.next;
        }
        current = A;
        ListNode[] curr = new ListNode[(len/2) + 1];
        for (int i = 0; i < (len/2) + 1; i++) {
            curr[i] = current;
            current = current.next;
        }
        temp = current; int i;
        if (len%2 == 1) i = (len/2) - 1;
        else i = (len/2) - 2;
        for (; i >= 0; i--) {
            curr[i].next = temp;
            temp = temp.next;
            curr[i].next.next = curr[i + 1];
        }
        curr[len/2].next = null;
        return A;
    }
}
