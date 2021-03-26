/*
https://www.interviewbit.com/problems/diffk/
 */

import java.util.Scanner;

public class DiffK {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the array size.");
        int size = read.nextInt();
        int[] input = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) input[i] = read.nextInt();
        System.out.println("Enter a non-negative integer.");
        int diff = read.nextInt();
        if (diff_k(input, diff) == 0) System.out.println("No two such indices exist.");
        if (diff_k(input, diff) == 1) System.out.println("Two such indices exist.");
    }
    private static int diff_k (int[] A, int k) {
        int status = 0;
        int i = 0, j = 0;
        while (i < A.length - 1 && j < A.length) {
            if (i == j) j++;
            else if ((A[j] - A[i]) == k) {
                status = 1;
                break;
            }
            else if ((A[j] - A[i]) > k) i++;
            else if ((A[j] - A[i]) < k) j++;
        }
        return status;
    }
}
