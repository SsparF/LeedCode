package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0 || s.length() == 0) return false;

        HashMap<Character, Character> charMap = new HashMap<>(Map.of('(', ')', '[', ']', '{', '}'));
        Stack<Character> characterStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                characterStack.push(c);
            } else if (charMap.containsValue(c)) {
                if (characterStack.isEmpty() || charMap.get(characterStack.pop()) != c) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(([]){})"));
        System.out.println(isValid("(("));
        System.out.println(isValid("(()})"));
    }
}
