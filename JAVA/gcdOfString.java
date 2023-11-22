import java.util.Scanner;

public class gcdOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        System.out.println(greatestCommonDivisorOfString(str1, str2));
    }

    public static String greatestCommonDivisorOfString(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "empty";

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int strlen1, int strlen2) {
        return strlen2 == 0 ? strlen1 : gcd(strlen2, strlen1 % strlen2);
    }
}

// explaination
// For two strings s and t, we say "t divides s" if and only if s = t + ... + t
// (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x
// divides both str1 and str2.

// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"

// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
