package LongestPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix() {
        String[] strs = new String[2];
        strs[0]= "ab";
        strs[1]= "a";
        Arrays.sort(strs,(a, b)->Integer.compare(a.length(),b.length()));
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<Math.min(firstWord.length(),lastWord.length()); i++) {
            if(firstWord.charAt(i)!=lastWord.charAt(i)){
                return sb.toString();
            }
            sb.append(firstWord.charAt(i));
        }
        return sb.toString();
    }
}
