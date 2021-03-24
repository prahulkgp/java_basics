/*
https://www.interviewbit.com/problems/intersection-of-sorted-arrays/
 */
import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionSortedArrays {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter size of first array.");
        int sizeA = read.nextInt();
        int[] A = new int[sizeA];
        System.out.println("Enter elements of A separated by spaces.");
        for (int i = 0; i < sizeA; i++) A[0] = read.nextInt();
        System.out.println("Enter size of second array.");
        int sizeB = read.nextInt();
        int[] B = new int[sizeB];
        System.out.println("Enter elements of B separated by spaces.");
        for (int i = 0; i < sizeB; i++) B[0] = read.nextInt();
        System.out.println("Common elements of A and B are: " + intersection(A, B, sizeA, sizeB));
    }
    private static ArrayList<Integer> intersection (int[] A, int[] B, int sizeA, int sizeB) {
        int i = 0, j = 0;
        ArrayList<Integer> output = new ArrayList<>();
        while (i < sizeA - 1 && j < sizeB - 1) {
            if (A[i] == B[j]) {
                output.add(A[i]);
                i++; j++;
            }
            else {
                if (A[i] < B[j]) i++;
                else if (A[i] > B[j]) j++;
            }
        }
        return output;
    }
}
