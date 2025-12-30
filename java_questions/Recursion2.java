//power question
//tiling pbllm

public class Recursion2 {
    public static int optimizedPower(int a , int n) {
        if(n == 0) {
            return 1;
        }
        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
    

        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        } 

        return halfPowerSq;
    }

    public static int tilingProblem(int n) { // 2 x n (floor size)
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //kaam
        //vertical size
        int fnm1 = tilingProblem(n- 1);

        //horizontal choice
        int fnm2 = tilingProblem(n -2);

        int totways = fnm1 + fnm2;
        return totways;

    }
    public static void main(String[] args) {
        // int a = 5;
        // int n = 6;
        // System.out.println(optimizedPower(a,n));
        int n = 8;
        System.out.println(tilingProblem(n));
    }
}
