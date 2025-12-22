public class palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getshortestpath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }

            // north
            if (dir == 'N') {
                y++;
            }

            // east
            if (dir == 'E') {
                x++;
            }

            // west
            if (dir == 'W') {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        // String str = "racecar";
        String str = "raceca";
        System.out.println(isPalindrome(str));
        String path = "WNEENESENNN";
        // String path = "SN";
        System.out.println(getshortestpath(path));

        String s1 = "Tony";
        // String s2 = "Tony";
        String s3 = new String("Tony");

        // if(s1 == s2) {
        // System.out.println("Strings are equal");
        // }
        // else{
        // System.out.println("strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

    }
}
