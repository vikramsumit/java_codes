// First Non Repeating Character

class q2 {
    static String firstNonRepeating(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        // frequency array for all ASCII characters
        int[] freq = new int[26];

        // Process each character in the stream
        for (int i = 0; i < n; i++) {

            // Update frequency for the current character
            freq[s.charAt(i) - 'a']++;

            // Scan from the beginning to find the 
            // first non-repeating character
            boolean found = false;

            for (int j = 0; j <= i; j++) {
                if (freq[s.charAt(j) - 'a'] == 1) {
                    ans.append(s.charAt(j));
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.append('#');
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        String ans = firstNonRepeating(s);
        System.out.println(ans);
    }
}