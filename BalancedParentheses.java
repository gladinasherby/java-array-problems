import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the expression
        for (char ch : expr.toCharArray()) {
            // Push opening brackets to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check if current closing bracket matches the top element in the stack
            else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false; // Return false if no match is found
            } else if (ch == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            } else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
        }

        // If stack is empty, the expression is balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is balanced: " + isBalanced(input));
    }
}
