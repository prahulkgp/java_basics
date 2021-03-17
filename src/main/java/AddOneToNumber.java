/*
https://www.interviewbit.com/problems/add-one-to-number/
 */

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = A.size() - 1; i >= 0; i--) {
            B.add(A.get(i));
        }
        int len = B.size() - 1;
        B.set(0, B.get(0) + 1);
        for (int i = 0; i < len; i++) {
            if (B.get(i) > 9) {
                B.set(i, 0);
                B.set(i + 1, B.get(i + 1) + 1);
            }
        }
        for (int i = len; i >= 0; i--) {
            if (B.get(i) == 0) {
                B.remove(i);
                len--;
            }
            else break;
        }
        if (B.get(len) < 10) {
            for (int i = len; i >= 0; i--) {
                output.add(B.get(i));
            }
        }
        else {
            B.set(len, 0);
            B.add(1);
            for (int i = len + 1; i >= 0; i--) {
                output.add(B.get(i));
            }
        }
        return output;
    }
}