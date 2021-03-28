/*
https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array
 */
import java.util.ArrayList;

public class RemoveDuplicatesSorted {
    public static void main (String[] args) {
    }
    private static void deduplicate (ArrayList<Integer> a) {
        int i = 0, j = 1, n = a.size();
        while (i < n - 1 && j < n) {
            if (!a.get(j).equals(a.get(i))) {
                a.set(i + 1, a.get(j));
                i++;
            }
            else j++;
        }
        while (i < n) a.remove(i);
    }
}
