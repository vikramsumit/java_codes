public class permutation {
    public static void findPermutation(String str, String ans, int[] count) {
        // base case
        if  (str.length() == 0) {
            System.out.println(ans);
            count[0]++;
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Nstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(Nstr, ans+curr, count);
    }
}
    public static void main(String[] args) {
        String str = "abcghy";
        int[] count = new int[1];
        findPermutation(str, "", count);
        System.out.println("Number of permutations are: " + count[0]);
    }
}
