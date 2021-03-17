/*
https://www.interviewbit.com/problems/maximum-absolute-difference/
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MaxAbsDiff {
    public static void main (String[] args) {
        System.out.println("Input the array, one number at a time.");
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while (read.hasNextInt()) {
            input.add(read.nextInt());
        }
        System.out.println("Maximum absolute difference: " + solve(input));
    }
    static int solve (ArrayList<Integer> input) {
        int a = input.get(0) - 1, b = input.get(0) - 1, c = input.get(0) +1, d = input.get(0) + 1;
        for (int i = 1; i < input.size(); i++) {
            int value1 = input.get(i) - (i + 1);
            int value2 = input.get(i) + (i + 1);
            if (value1 > a) a = value1;
            if (value1 < b) b = value1;
            if (value2 > c) c = value2;
            if (value2 < d) d = value2;
        }
        return Math.max(a - b, c - d);
    }
}
