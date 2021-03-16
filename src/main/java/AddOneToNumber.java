/*
https://www.interviewbit.com/problems/add-one-to-number/
 */

import java.util.Arrays;
import java.util.Scanner;

public class AddOneToNumber {
    public static void main (String[] args) {
        System.out.println("Enter the non-negative number.");
        Scanner read = new Scanner(System.in);
        int input = read.nextInt();
        System.out.println("Output: " + AddOne (input));
    }
    static String AddOne (int input) {
        String input_str = Integer.toString(input);
        int[] input_arr = new int[input_str.length()];
        for (int i = 0; i < input_str.length(); i++) {
            input_arr[i] = input_str.charAt(i);
        }
        int len = input_arr.length - 1;
        int carry = 1;
        if ((input_arr[len] + 1) == 10) {
            input_arr[len] = 0;
            for (int i = len - 1; i >= 0; i--) {
                if ((input_arr[i] + carry) == 10) {
                    input_arr[i] = 0;
                }
            }
        }
        else input_arr[len]++;
        return Arrays.toString(input_arr);
    }
}