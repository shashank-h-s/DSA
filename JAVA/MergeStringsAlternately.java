import java.util.Scanner;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        input.close();
        System.out.println(mergingString(word1, word2));
    }

    public static StringBuilder mergingString(String word1, String word2) {
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

        return result;
    }

}