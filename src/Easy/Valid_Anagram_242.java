package Easy;

import java.util.Arrays;

public class Valid_Anagram_242 {
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//    typically using all the original letters exactly once.

    public static boolean isAnagram(String s, String t) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        t = t.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abdc", "dbac"));
        System.out.println(isAnagram("rat", "car"));
    }
}
