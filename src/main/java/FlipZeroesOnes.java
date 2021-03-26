/*
https://www.interviewbit.com/problems/maximum-ones-after-modification
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FlipZeroesOnes {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        System.out.println("Enter the number.");
        int B = read.nextInt();
        System.out.println("Enter array elements.");
        while (read.hasNextInt()) {
            input.add(read.nextInt());
        }
        System.out.println(solve(input, B));
    }
    private static int solve(ArrayList<Integer> A, int B) {
        int zc = 0, len = 0, maxlen = 0, lent = 1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == 1) {
                len++;
            }
            else if (A.get(i) == 0 && zc < B) {
                zc++;
                len++;
            }
            else if (A.get(i) == 0 && zc == B) {
                lent = 1;
                int zct = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (A.get(j) == 1) {
                        lent++;
                    }
                    else if (A.get(j) == 0 && zct < B) {
                        zct++;
                        lent++;
                    }
                    else if (A.get(j) == 0 && zct == B) {
                        break;
                    }
                }
                len = lent;
            }
            if (len > maxlen) maxlen = len;
        }
        return maxlen;
    }
}