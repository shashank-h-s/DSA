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

