public class ReverseWordInString {
    public static void main(String[] args) {
        String word = "  hi good    morning  all      ";
        String result = "";
        String words = word.replaceAll("\\s+", " ").trim();
        System.out.println(words);
        String[] arr = words.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
            if (i != 0)
                result = result + " ";
        }
        System.out.println(result); // output: "all morning good hi"
    }

}
