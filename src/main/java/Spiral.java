import java.util.ArrayList;
import java.util.List;

public class Spiral {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int I, J, K, L;
        ArrayList<Integer> Output = new ArrayList<>();
        for (I = 0, J = 0, K = 0, L = A.size(); (I < 3 & J < 3 & K < 3 & L > 0); I++, J++, K++, L--) {
            while (J < (A.get(0).size() - J)) {
                Output.add(A.get(I).get(J)); J++;
            }
            while (K < (A.get(0).size() - 1)) {
                Output.add(A.get(J).get(K)); K++;
            }
            while (L > (A.size() - I)) {
                Output.add(A.get(K).get(L)); L--;
            }
        }
        return Output;
    }
}