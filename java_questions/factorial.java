import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // combination
    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static int permutation(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int permutation = fact_n / fact_nmr;
        return permutation;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        System.out.println("Factorial of n is: " + factorial(n));
        System.out.println("Combination (nCr) is: " + bincoeff(n, r));
        System.out.println("Permutation (nPr) is: " + permutation(n, r));

        sc.close();
    }
}
