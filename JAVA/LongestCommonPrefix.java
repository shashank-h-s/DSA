import java.util.Arrays;

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string 

public class LongestCommonPrefix {
    static public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       String s1 = strs[0];
       String s2 = strs[strs.length-1];
       int idx = 0;
       while(idx < s1.length() && idx < s2.length()){
           if(s1.charAt(idx) == s2.charAt(idx)){
               idx++;
           } else {
               break;
           }
       }
       return s1.substring(0, idx);
   }

   public static void main(String[] args) {
        String [] str1 = {"flower","flow","flight"};
        String [] str2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));
   }
}
