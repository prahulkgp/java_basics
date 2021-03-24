import java.util.Arrays;
import java.util.Scanner;

public class ColourSort {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter array size.");
        int size = read.nextInt();
        System.out.println("Enter array made of elements 0, 1, and 2.");
        int[] input = new int[size];
        for (int i = 0; i < size; i++) input[i] = read.nextInt();
        System.out.println("Sorted array: " + Arrays.toString(sort(input, size)));
    }
    private static int[] sort (int[] A, int size) {
        int zero_pos = 0, two_pos = size - 1, temp;
        for (int i = 0; i < two_pos; i++) {
            if (A[i] == 0) {
                temp = A[zero_pos];
                A[zero_pos] = A[i];
                A[i] = temp;
                zero_pos++;
            }
            else {
                if (A[i] == 2) {
                    temp = A[two_pos];
                    A[two_pos] = A[i];
                    A[i] = temp;
                    two_pos--;
                }
            }
        }
        return A;
    }
}
