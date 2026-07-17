// Find non-repeating letters in a stream of characters 
import java.util.*;


public class queue7 {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);

            // increase frequency of current character like when ch = z then its value will be 25 and we will increase freq[25] by 1
            // alternate of if (ch >= 'a' && ch <= 'z') {
            //     freq[ch - 'a']++;
            // } else if (ch >= 'A' && ch <= 'Z') {
            //     freq[ch - 'A']++;
            // }
            // if(ch == a) freq[0]++;
            // if(ch == b) freq[1]++;
            // if(ch == c) freq[2]++; and so on for all 26 letters of the alphabet
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1 ) {
                    q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            }
            else{
                System.out.print(q.peek() + " ");
            }
        } 
        System.out.println();

        

    }
    public static void main(String[] args) {
        String str = "aabccxb";

        printNonRepeating(str);
    }
}
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(1) because we are using a fixed size array of 26 for frequency and a queue which can have at most 26 elements in it
// what code i have to write for find the first non-repeating character in it and return its index in the string. If it doesn't exist, return -1.
// int firstUniqChar(String s) {
//     int freq[] = new int[26];
//     for (int i = 0; i < s.length(); i++) {
//         char ch = s.charAt(i);
//         freq[ch - 'a']++;
//     }
//     for (int i = 0; i < s.length(); i++) {
//         if (freq[s.charAt(i) - 'a'] == 1) {
//             return i;
//         }
//     }
//     return -1;
// }