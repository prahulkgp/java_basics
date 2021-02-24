/**
 Calculating the number of ways a frog can cross a lake, 11 feet across, by stepping on 10 stones separated by 1 foot each.

 Frog *_._._._._._._._._._._* Destination

 Frog can jump either 1 or 2 feet at a time.
 **/

public class Frog {
    public static void main(String[] args) {
        System.out.println("Frog can cross the lake in " + ways(11) + " ways.");
    }
    static int ways(int n) {
        if (n > 2) {
            return 2 + ways(n - 1) + ways(n - 2);
        }
        else {
            return n;
        }
    }
}