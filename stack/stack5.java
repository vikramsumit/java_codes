import java.util.Stack;

public class stack5 {
    public static void reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        str = result.toString();
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Hello";

        reverseString(str);

    }
}
