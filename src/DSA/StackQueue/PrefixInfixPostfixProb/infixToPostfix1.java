package DSA.StackQueue.PrefixInfixPostfixProb;
import java.util.Stack;
public class infixToPostfix1 {
    // Function to get precedence of operators
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // For '(' or invalid characters
        }
    }
    // Function to convert an infix expression to a postfix expression
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } 
            // If the character is '(', push it onto the stack
            else if (c == '(') {
                stack.push(c);
            } 
            // If the character is ')', pop and append until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Remove '('
                }
            } 
            // If an operator is encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators left in the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}