// Stock price prediction using stack data structure

import java.util.Stack;

public class stack6 {
    public static void stockSpan(int prices[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];

            while(!s.isEmpty() && currPrice > prices[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85, 90, 95, 100, 110};
        int span[] = new int[prices.length];
        
        stockSpan(prices, span);

        for(int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    
    }
}
