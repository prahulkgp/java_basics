/*
https://www.interviewbit.com/problems/merge-two-sorted-lists-ii
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortedLists2 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first array size.");
        int size_A = read.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter array A's elements.");
        for (int i = 0; i < size_A; i++) a.add(read.nextInt());
        System.out.println("Enter the second array size.");
        int size_B = read.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Enter array B's elements.");
        for (int i = 0; i < size_B; i++) b.add(read.nextInt());
        //System.out.println("Merged array: " + merge(A, size_A, B, size_B));
        merge(a, b);
        System.out.println("Merged array: " + a);
    }
    /*
    private static ArrayList<Integer> merge (int[] A, int size_A, int[] B, int size_B) {

        int i = 0, j = 0;
        ArrayList<Integer> C = new ArrayList<>();
        while (i < size_A && j < size_B) {
            if (A[i] == B[j]) {
                C.add(A[i]); C.add(B[j]);
                i++; j++;
            }
            else if (A[i] < B[j]) {
                C.add(A[i]);
                i++;
            }
            else if (A[i] > B[j]) {
                C.add(B[j]);
                j++;
            }
        }
        if (i >= size_A) for (; j < size_B; j++) C.add(B[j]);
        else if (j >= size_B) for (; i < size_A; i++) C.add(A[i]);
        return C;
    }

     */
    private static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) == b.get(j)) {
                c.add(a.get(i)); c.add(b.get(j));
                i++; j++;
            }
            else if (a.get(i) < b.get(j)) {
                c.add(a.get(i));
                i++;
            }
            else if (a.get(i) > b.get(j)) {
                c.add(b.get(j));
                j++;
            }
        }

        if (i >= a.size()) for (; j < b.size(); j++) c.add(b.get(j));
        else if (j >= b.size()) for (; i < a.size(); i++) c.add(a.get(i));

        for (int k = 0; k < c.size(); k++) {
            if (k < a.size()) a.set(k, c.get(k));
            else a.add(c.get(k));
        }
    }
}
