import java.util.ArrayList;
import java.util.List;

public class Spiral {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int I, J, K, L;
        ArrayList<Integer> Output = new ArrayList<>();
        for (I = 0; I <= 2; I++) {
            for (J = 0; J <= 2; J++) {
                Output.add(A.get(I).get(J));
            }
            for (K = 0; K <= 2; K++) {
                Output.add(A.get(J).get(K));
            }
            for (L = 1; L >= 0; L--) {
                Output.add(A.get(K).get(L));
            }
        }
        return Output;
    }
}