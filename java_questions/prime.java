import java.util.*;

public class prime {
    // public static boolean isPrimes(int n){
    //     if(n == 2){
    //         return true;
    //     }
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++) {
    //         if (n % i == 0)
    //         isPrime = false;
    //         break;
    //     }
    //     return isPrime;
    // }

     public static boolean isPrime(int n){
        if(n ==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i ==0) {
                return false;
            }
        }
        return true;
     }

     public static void primesinrange(int n){
        for(int i=2; i<=n; i++) {
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println("ur no is printed");
     }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(13));
        System.out.println(isPrime(33));
        System.out.println(isPrime(2));
        System.out.println(isPrime(21));
        System.out.println(isPrime(19));
        System.out.println(isPrime(358877));
        System.out.println(isPrime(35887999));
        primesinrange(559558);
    }
}
