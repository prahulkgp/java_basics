/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

Follow-up: what if you can't use division?
*/

import java.util.Arrays;
import java.util.Scanner;

public class DCP2 {
    public static void main (String[] args) {
        System.out.println("How many numbers?");
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] input = new int[size];
        System.out.println("Enter the numbers one by one.");
        for (int i = 0; i < size; i++) {
            input[i] = read.nextInt();
        }
        System.out.println("Here's the output array.\n" + Arrays.toString(output(input, size)));
    }
    static int[] output(int[] input, int size) {
        int product = 1;
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            product = product * input[i];
        }
        for (int i = 0; i < size; i++) {
            output[i] = product / input[i];
        }
        return output;
    }
}
