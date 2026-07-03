import java.util.*;

public class stack4 {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int top = s.pop();
            System.out.println(top);
            temp.push(top);
        }

        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: "); 
        printStack(s);

        System.out.println("After reversing the stack: ");
        reverseStack(s);
        printStack(s);

        // pushAtBottom(s, 4);

        // // Print stack
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }
    }
}
