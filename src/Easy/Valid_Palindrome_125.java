package Easy;

import java.util.Locale;

public class Valid_Palindrome_125 {
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//    removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
//    characters include letters and numbers.

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
}
