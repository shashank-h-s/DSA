
class Pallindrome {
    static boolean checkPallindrome(String str) {
        if (str.isEmpty())
            return false;
        String rev = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev.equals(str);
    }

    public static void main(String[] args) {
        System.out.println(checkPallindrome("abcd"));// output is false
        System.out.println(checkPallindrome("abba"));// output is true
    }
}