/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 */

import java.util.Scanner;

public class DCP1 {
    public static void main (String[] args) {
        System.out.println("How many numbers do you want to input for checking?");
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] input = new int[size];
        System.out.println("Enter the list of numbers.");
        for (int i = 0; i < size; i++) {
            input[i] = read.nextInt();
        }
        System.out.println("What's the sum to check the list against?");
        int sum = read.nextInt();

        if (sumCheck(input, sum) == 1) {
            System.out.println("Such pair exists.");
        }
        else {
            System.out.println("Such pair doesn't exist.");
        }
    }
    static int sumCheck(int[] input, int sum) {
        int result = 0;
        for (int i = 0; i < (input.length - 1); i++) {
            int diff = sum - input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (diff != input[j]) ;
                else return 1;
            }
        }
        return result;
    }
}