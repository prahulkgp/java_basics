/*
 https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 */

import java.util.ArrayList;

import static java.lang.Math.abs;

public class InfiniteGrid {
    public static void main(String[] args) {
    }
        static int StepCount(ArrayList<Integer> A, ArrayList<Integer> B) {
            int i, j, k, l;
            int p, total = 0, step;
            for (p = 0; p <= (A.size() - 2); p++) {
                i = A.get(p);
                j = B.get(p);
                k = A.get(p + 1);
                l = B.get(p + 1);
                if (i == k || j == l) {
                    if (i == k) {
                        step = abs(j - l);
                    } else {
                        step = abs(k - i);
                    }
                    total = total + step;
                } else {
                    int len = abs(k - i);
                    int brd = abs(l - j);
                    int sqrNo, sqrSz, rem;
                    if (len >= brd) {
                        sqrNo = len / brd;
                        sqrSz = brd;
                        rem = len - (sqrNo * sqrSz);
                        if (sqrNo % 2 == 1) {
                            step = ((sqrNo * sqrSz) + rem);
                        } else {
                            step = (((sqrNo - 1) * sqrSz) + sqrSz + rem);
                        }
                        total = total + step;
                    } else {
                        sqrNo = brd / len;
                        sqrSz = len;
                        rem = brd - (sqrNo * sqrSz);
                        if (sqrNo % 2 == 1) {
                            step = ((sqrNo * sqrSz) + rem);
                        } else {
                            step = (((sqrNo - 1) * sqrSz) + sqrSz + rem);
                        }
                        total = total + step;
                    }
                }
            }
            return total;
        }
}
