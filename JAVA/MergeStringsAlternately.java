import java.util.Scanner;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        input.close();
        System.out.println(mergingString(word1, word2));
    }

    public static String mergingString(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            } else {
                result.append(" ");
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            } else {
                result.append(" ");
            }
            i++;
        }
        return result.toString();
    }

}

// explaination------
// You are given two strings word1 and word2. Merge the strings by adding
// letters in alternating order, starting with word1. If a string is longer than
// the other, append the additional letters onto the end of the merged string.
// Return the merged string.

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1: a b c
// word2: p q r
// merged: a p b q c r

// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1: a b
// word2: p q r s
// merged: a p b q r s