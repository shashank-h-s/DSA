import java.util.Stack;

public class ReverseString {
    public String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuffer s = new StringBuffer();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.empty()) {
            s.append(stack.pop());
        }
        return s.toString();
    }

    public static void main(String[] args) {
        ReverseString s = new ReverseString();
        System.out.println(s.reverseString("hello"));
        System.out.println(s.reverseString("good"));
        System.out.println(s.reverseString("morning!"));

    }
}
