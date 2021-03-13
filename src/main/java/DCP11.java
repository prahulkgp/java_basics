/*
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
return all strings in the set that have s as a prefix.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DCP11 {
    public static void main (String[] args) {
        System.out.println("Enter the string to be queried:");
        Scanner read = new Scanner(System.in);
        String query = read.next();
        System.out.println("Enter the set of strings to go through.");
        ArrayList<String> strings = new ArrayList<>();
        while (read.hasNext()) {
            strings.add(read.next());
        }
        System.out.println("Here are your autocomplete suggestions: " + autocomplete(query, strings));
    }
    static ArrayList<String> autocomplete (String query, ArrayList<String> strings) {
//        ArrayList<char[]> input = convert(strings);
        int length = query.length();
        int[] check = new int[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            check[i] = 1;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (check[j] == 1) {
                    if (query.charAt(i) != strings.get(j).charAt(i)) check[j] = 0;
                }
            }
        }
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (check[i] == 1) output.add(strings.get(i));
        }
        return output;
    }
    static ArrayList<char[]> convert (ArrayList<String> strings) {
        ArrayList<char[]> output = new ArrayList<>();
        int size = strings.size();
        for (int i = 0; i < size; i++) {
            int length = strings.get(i).length();
            output.add(new char[length]);
            for ( int j = 0; j < length; j++) {
                output.get(i)[j] = strings.get(i).charAt(j);
            }
        }
        return output;
    }
}