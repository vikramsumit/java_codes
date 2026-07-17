// Valid parenthesis

import java.util.Stack;

public class stack7 {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        // for (char c : s.toCharArray()) {
        //     if (c == '(' || c == '{' || c == '[') {
        //         stack.push(c);
        //     } else {
        //         if (stack.isEmpty()) {
        //             return false;
        //         }
        //         char top = stack.pop();
        //         if ((c == ')' && top != '(') ||
        //             (c == '}' && top != '{') ||
        //             (c == ']' && top != '[')) {
        //             return false;
        //         }
        //     }
        // }

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is an opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If it's a closing bracket, check if the stack is empty or if the top of the stack matches 
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // if ((c == ')' && top != '(') ||
                //     (c == '}' && top != '{') ||
                //     (c == ']' && top != '[')) {
                //     return false;
                // }
                if((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
                    continue;
                } else {
                    return false;
                }
                
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isValid(str)); // Output: true
    }
} 