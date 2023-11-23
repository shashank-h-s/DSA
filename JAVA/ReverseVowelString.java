public class ReverseVowelString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("before changes: " + s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                sb.append(ch);
            }
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                if (count < sb.length()) {
                    s = s.substring(0, i) + sb.charAt(count) + s.substring(i + 1);
                    count++;
                }
            }
        }
        System.out.println("After changes: " + s);
    }
}
