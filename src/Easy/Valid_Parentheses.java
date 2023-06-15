package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        char[] chars = s.trim().toCharArray();

        if(s.length() % 2 != 2 || s.length() == 0) return false;
        if(chars[0] == ')' || chars[0] == '}' || chars[0] == '}') return false;
        if(chars[s.length() - 1] == '(' || chars[s.length() - 1] == '[' || chars[s.length() - 1] == '{') return false;

        HashMap<Character, Character> charMap = (HashMap<Character, Character>) Map.of('(',')'
            ,'[',']','{','}');

        Stack<Character> characterStack = new Stack<>();

        for(int i = 0; i < chars.length;) {

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(([]){})"));
        System.out.println(isValid("(("));
        System.out.println(isValid("(()})"));
    }
}
