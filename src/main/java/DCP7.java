/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
You can assume that the messages are decode-able. For example, '001' is not allowed.
 */

import java.util.Scanner;

public class DCP7 {
    public static void main (String[] args) {
        System.out.println("Type in your coded message.");
        Scanner read = new Scanner(System.in);
        String input = read.next();
        System.out.println("The message can be decoded in " + decode_count(input, 0) + "ways.");
    }
    static int decode_count(String input, int i) {
        if (i < (input.length() - 1)) {
            if ((Character.getNumericValue(input.charAt(i)) + (10 * Character.getNumericValue(input.charAt(i + 1)))) < 27) {
                return decode_count(input, i) + decode_count(input, i + 1);
            } else {
                return decode_count(input, i);
            }
        }
        else
            return 1;
    }
}