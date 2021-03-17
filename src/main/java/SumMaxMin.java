/*
https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/
 */

import java.util.ArrayList;

public class SumMaxMin {
    public int solve(ArrayList<Integer> A) {
        int size = A.size();
        return max_min(A, size)[0] + max_min(A, size)[1];
    }
    static int[] max_min (ArrayList<Integer> A, int size) {
        int max, min;
        int[] output = new int[2];
        if (A.size() == 1) {
            output[0] = max = A.get(0); output[1] = min = A.get(0);
            return output;
        }
        else if (A.size() == 2) {
            output[0] = max = Math.max(A.get(0), A.get(1));
            output[1] = min = Math.min(A.get(0), A.get(1));
            return output;
        }
        else {//size > 2
            int i, max_l, min_l, max_r, min_r;
            if ((A.size() % 2) == 0) {
                i = (A.size() / 2) - 1;
                max_l = max_min((ArrayList<Integer>) A.subList(0, i), i + 1)[0];
                min_l = max_min((ArrayList<Integer>) A.subList(0, i), i + 1)[1];
                max_r = max_min((ArrayList<Integer>) A.subList(i + 1, (2 * i) + 1), i + 1)[0];
                min_r = max_min((ArrayList<Integer>) A.subList(i + 1, (2 * i) + 1), i + 1)[1];
            }
            else {
                i = (A.size() / 2);
                max_l = max_min((ArrayList<Integer>) A.subList(0, i), i + 1)[0];
                min_l = max_min((ArrayList<Integer>) A.subList(0, i), i + 1)[1];
                max_r = max_min((ArrayList<Integer>) A.subList(i + 1, 2 * i), i)[0];
                min_r = max_min((ArrayList<Integer>) A.subList(i + 1, 2 * i), i)[1];
            }
            output[0] = Math.max(max_l, max_r);
            output[1] = Math.min(min_l, min_r);
            return output;
        }
    }
}