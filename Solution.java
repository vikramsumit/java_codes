import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        // Taking input
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        // Printing output
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        scan.close();
    }
}
