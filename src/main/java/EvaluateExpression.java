import java.util.Stack;

public class EvaluateExpression {
    /**
     * https://leetcode.com/problems/evaluate-reverse-polish-notation/
     * <p>
     * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
     * <p>
     * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
     * <p>
     * Note that division between two integers should truncate toward zero.
     * <p>
     * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
     * Example 1:
     * <p>
     * Input: tokens = ["2","1","+","3","*"]
     * Output: 9
     * Explanation: ((2 + 1) * 3) = 9
     * Example 2:
     * <p>
     * Input: tokens = ["4","13","5","/","+"]
     * Output: 6
     * Explanation: (4 + (13 / 5)) = 6
     * Example 3:
     * <p>
     * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
     * Output: 22
     * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
     * = ((10 * (6 / (12 * -11))) + 17) + 5
     * = ((10 * (6 / -132)) + 17) + 5
     * = ((10 * 0) + 17) + 5
     * = (0 + 17) + 5
     * = 17 + 5
     * = 22
     */

    public static void main(String[] args) {
        /*
        Steps
        1. Iterator token
        2. If the element is Operand then add to stack
           else pop 2 element from stack and do the operation and the result back to stack
         */
//        String[] tokens = {"2","1","+","3","*"};
//        String[] tokens = {"4", "13", "5", "/", "+"};
//        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String[] tokens = {"2","1","+","3","*"};
        Stack<Integer> stack = new Stack<>();
        int v2;
        int v1;
        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") && !tokens[i].equals("-")
                    && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(Integer.parseInt(tokens[i]));
            }else {
                v1 = stack.pop();
                v2 = stack.pop();
                if (tokens[i].equals("+")) {
                    System.out.println(v2 + v1);
                    stack.push(v2 + v1);
                } else if (tokens[i].equals("-")) {
                    System.out.println(v2 - v1);
                    stack.push(v2 - v1);
                } else if (tokens[i].equals("*")) {
                    System.out.println(v2 * v1);
                    stack.push(v2 * v1);
                } else if (tokens[i].equals("/")) {
                    System.out.println(v2 / v1);
                    stack.push(v2 / v1);
                }
            }
        }
        System.out.println(stack.peek());
    }
}
