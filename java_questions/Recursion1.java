import java.util.*;

public class Recursion1 {
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        int Snm1 = sum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        // if(n == 0){
        //     return 0;
        // }

        int fnm1 =fib(n-1);
        int fnm2 =fib(n-2);
        int fib = fnm1 + fnm2; 
        return fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key , int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key , int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        // int n = 25;
        // // printInc(n);
        // // System.out.println(fact(n));
        // // System.out.println(sum(n));
        // System.out.println(fib(22));
        // System.out.println(fib(23));
        // System.out.println(fib(24));
        // System.out.println(fib(25));
        // System.out.println(fib(26));
        // System.out.println(fib(27));
        // System.out.println(fib(28));

        // int arr[] = {5,7,2,8};
        // int arr[] = {5,7,12,18};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {2,4,5,7,9,10,4,5,3,1};
        // System.out.println(firstOccurence(arr, 5, 00));
        // System.out.println(lastOccurence(arr, 5, 00));

        System.out.println(power(3,9));
        System.out.println(power(2,9));
        System.out.println(power(3,6));

    }
}
