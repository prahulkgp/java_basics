/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.
 */

import java.util.Scanner;

public class DCP4 {
    public static void main (String[] args) {
        System.out.println("How many numbers?");
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        System.out.println("Enter the list of numbers.");
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = read.nextInt();
        }
        System.out.println(output(input, size) + " is the lowest positive integer that is not in the input.");
    }
    static int output (int[] input, int size) {
        int output = 1;
        for (int i = 0; i < size; i++) {
                if (input[i] == output) {
                    output++;
                }
        }
        return output;
    }
}