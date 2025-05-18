import java.util.Stack;

/**
 * Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParanthesis {
    public static void main(String[] args) {
        isValidParantesis();
    }

    private static boolean isValidParantesis() {
        String s = "([{}])";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    System.out.println("Invalid");
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Invalid");
            return false;
        }
    }

}
