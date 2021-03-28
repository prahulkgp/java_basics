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
        int i = a.size() - 1, j = b.size() - 1, na = a.size() + b.size() - 1;
        while (i >= 0 && j >= 0) {
            if (a.get(i).equals(b.get(j))) {
                a.set(na, a.get(i));
                na--;
                a.set(na, b.get(j));
                na--;
                i--; j--;
            }
            else if (a.get(i) > b.get(j)) {
                a.set(na, a.get(i));
                na--;
                i--;
            }
            else if (a.get(i) < b.get(j)) {
                a.set(na, b.get(j));
                na--;
                j--;
            }
        }
    }
}
