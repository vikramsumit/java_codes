public class Recursion {
    public static void decnum(int n) {
        if(n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        decnum(n - 1);
    }
    public static void main(String[] args) {
        int n = 16;
        decnum(n);
    }
}
